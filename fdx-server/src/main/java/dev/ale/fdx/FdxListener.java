package dev.ale.fdx;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.xml.sax.SAXException;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.config.DefaultNamespacePrefixMapper;
import dev.ale.fdx.config.JAXBContextConfig;
import dev.ale.fdx.entity.flight.AircraftType;
import dev.ale.fdx.entity.flight.FlightType;
import dev.ale.fdx.entity.flight.ObjectFactory;
import dev.ale.fdx.service.AircraftService;
import dev.ale.fdx.service.FlightService;

public class FdxListener extends Thread {
	private static final String JAXB_CONTEXT_FIXM_BASE = "dev.ale.fdx.entity.base";
	private static final String JAXB_CONTEXT_FIXM_FLIGHT = "dev.ale.fdx.entity.flight";
	private static final String JAXB_CONTEXT_FIXM_MESSAGING = "dev.ale.fdx.entity.messaging";
	private static final String JAXB_CONTEXT_FIXM = JAXB_CONTEXT_FIXM_BASE + ":" + JAXB_CONTEXT_FIXM_FLIGHT + ":"
			+ JAXB_CONTEXT_FIXM_MESSAGING;
	private static final String XSD_FIXM_FLIGHT = "/fdx_workspace/fdx-server/src/main/resource/xsd/flight/Flight.xsd";
	private static final String XSD_FIXM_AIRCRAFT = "/fdx_workspace/fdx-server/src/main/resource/xsd/flight/Flight.xsd";
	private static final String XSD_FIXM_FLIGHTDATA = "/xsd/flight/flightdata/FlightData.xsd";
	private ServerSocket serverSocket;
	private static int PORT_1988 = 2020;
	private static final String TARGET_PATH = "/fdx_workspace/fdx-server/src/main/resource/inbox/";
	private static final String CONVERT_PATH = "/fdx_workspace/fdx-server/src/main/resource/convert/";
	private static final String FAIL_PATH = "/fdx_workspace/fdx-server/src/main/resource/fail/";
	private static final String XML_FILE_1 = "/fdx_workspace/fdx-server/src/main/resource/inbox/person.xml";
	private static String schema = XSD_FIXM_FLIGHT;
	private BufferedInputStream inStream;
	private Socket clientSocket;
	private FileOutputStream fos;
	private DataInputStream dis;
	private FileInputStream fis;

	public FdxListener(int port) {
		try {
			System.out.println("|| ========================= ||");
			System.out.println("|| Opening server port "+PORT_1988+"  ||");
			serverSocket = new ServerSocket(PORT_1988);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		while (true) {
			try {

				Socket clientSocket = serverSocket.accept();
				System.out.println(" ");
				System.out.println(" Accepting socket = " +clientSocket.getInetAddress());
				moveFile();
				
				try {
					saveFile(clientSocket);
					sendFile(clientSocket);
						
				} catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void saveFile(Socket clientSocket) throws IOException, JAXBException, SAXException {
		//		System.out.println("Saving file");
		//		
		dis = new DataInputStream(clientSocket.getInputStream());
		DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
		//		System.out.println(dis.readUTF());
		//		String strSourcePathFile = dis.readUTF();
		//		int indexFileName = strSourcePathFile.lastIndexOf("/")+1;
		//		String fileName = strSourcePathFile.substring(indexFileName);
		//		FileOutputStream fos = new FileOutputStream(TARGET_PATH+fileName);
		fos = new FileOutputStream(TARGET_PATH+dis.readUTF());
		//BufferedOutputStream out = new BufferedOutputStream(dos);
		
		byte[] buffer = new byte[4096];

		int filesize = 15123; // Send file size in separate msg
		int read = 0;
		int totalRead = 0;
		int remaining = filesize;
		while((read = dis.read(buffer, 0, Math.min(buffer.length, remaining))) > 0) {
			totalRead += read;
			remaining -= read;
			fos.write(buffer, 0, read);
		}
		File files = new File(TARGET_PATH);
		for (File file : files.listFiles()) {
			if(validateXMLSchema(file, schema)) {
				System.out.println("XML : " +file);
				System.out.println("---   VALIDATED  ---");
				System.out.println("File Name: " +file.getName());
				UnMarshall(file, schema);
				//sendFile(clientSocket);
//				out.write((byte)1);
//				inStream = new BufferedInputStream(new FileInputStream(file));
//				byte[] buf = new byte[1024];
//				int bytres = 0;
//				while((bytres = inStream.read(buf)) != -1) {
//					out.write(buf, 0, bytres);
//					out.flush();
//					System.out.println("File terkirim" +file);
//				}
//				
				System.out.println("=============================================================================");

			}else {
				System.out.println("XSD : " +schema);
				System.out.println("XML : " +file);
				System.out.println("!!! XML NOT VALID !!!");
				System.out.println("File Name : " +file.getName());
				//jeda();
				System.out.println("=============================================================================");
			}
			//sendFile(clientSocket);
		}
	
		closeConnection();
	}
	
	private void sendFile(Socket clientSocket) throws IOException {
		DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
		File file = new File(CONVERT_PATH);
		for (File pwd : file.listFiles()) {
		 fis = new FileInputStream(pwd);
	}
		byte[] buffer = new byte[(int)file.length()];
		dos.writeUTF(file.getName());
		while((fis.read(buffer)) >= 0) 
		{
			dos.write(buffer);
			System.out.println("File terkirim  : " +file.getName());
			
		}
		
	}	
	
	public void closeConnection() {
		try {
			if(fos!=null) {
				fos.close();
			}
			if(dis!=null) {
				dis.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean validateXMLSchema(File file, String xsdPath ) {

		try {
			SchemaFactory factory = 
					SchemaFactory.newInstance(javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(file));
			System.out.println("XSD : " +schema);

		}
		catch (IOException | SAXException e) {

			System.out.println(e.getLocalizedMessage());
			return false;
		}
		return true;	
	}

	public void UnMarshall (File file, String xsdPath) throws JAXBException, SAXException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(FlightType.class);
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
		Schema schema1 = sf.newSchema(new File(xsdPath));

		Unmarshaller unmarshaller = context.createUnmarshaller();

		unmarshaller.setSchema(schema1);

		@SuppressWarnings("unchecked")
		FlightType flight = (FlightType) unmarshaller.unmarshal(file);
//		System.out.println("Get aircraft : " +flight.getAircraft());
//		System.out.println("Get Hjid : " +flight.getAircraft().getHjid());
//		System.out.println("Aircraft Addres : "+flight.getAircraft().getAircraftAddress());
//		System.out.println("Restration : "+flight.getAircraft().getRegistration());
//		System.out.println("SignificantMark : "+flight.getAircraft().getSignificantMarkings());
//		System.out.println("AircraftColours : "+flight.getAircraft().getAircraftColours());
//		System.out.println("AircraftApproach : "+flight.getAircraft().getAircraftApproachCategory());
//		System.out.println();

		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
		FlightService Fservice = context1.getBean(FlightService.class);
		Fservice.create(flight);
		System.out.println("SUCCESS");
	}

	public static void moveFile() throws IOException
	{


		File files = new File(TARGET_PATH);
		for(File f : files.listFiles()) {
			if(validateXMLSchema(f, schema)) {
			Path movefrom = FileSystems.getDefault().getPath(TARGET_PATH+f.getName());
			Path target = FileSystems.getDefault().getPath(CONVERT_PATH+f.getName());

			try
			{
				Files.move(movefrom, target, StandardCopyOption.REPLACE_EXISTING);
				System.out.println("Berhasil dipindah ke convert_path");
			}catch(IOException e) {
				System.err.println(e);
			}
			}else {
				Path movefrom = FileSystems.getDefault().getPath(TARGET_PATH+f.getName());
				Path target = FileSystems.getDefault().getPath(FAIL_PATH+f.getName());
				try {
					Files.move(movefrom, target, StandardCopyOption.REPLACE_EXISTING);		
				}catch(IOException e) {
					System.err.println(e);
				}
			}
		}
	}
	
	public static void jeda()
	{
		char[] animationChars = new char[]{'|', '/', '-', '\\'};	

		for (int i = 99; i <= 100; i++) {	
			System.out.println("Processing: " + i + "% " + animationChars[i % 4] + "\r");	

			try {	
				Thread.sleep(100);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Processing: Done!");	
	}
}
