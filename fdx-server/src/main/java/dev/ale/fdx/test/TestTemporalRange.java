package dev.ale.fdx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TemporalRangeType;
import dev.ale.fdx.service.TemporalRangeService;

public class TestTemporalRange {

	public static void main(String[] args) throws ParseException, DatatypeConfigurationException {

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			TemporalRangeService Tservice = context.getBean(TemporalRangeService.class);
			TemporalRangeType T = new TemporalRangeType();
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			java.util.Date date = format.parse("2019-10-03 07:23:10");
			T.setEarliestItem(date);
			XMLGregorianCalendar xcall = DatatypeFactory.newInstance().newXMLGregorianCalendar("2019-12-12");
			T.setEarliest(xcall);
			XMLGregorianCalendar LatestXcall = DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-12-12");
			T.setLatest(LatestXcall);
			java.util.Date date2 = format.parse("2015-10-03 07:23:10");
			T.setLatestItem(date2);
			Tservice.create(T);
			//retrieve
			TemporalRangeType Tretrieve = Tservice.retrieve(698L);
			System.out.println("================= TAMPILKAN DATA =================");
			System.out.println(Tretrieve.getEarliest());
			System.out.println(Tretrieve.getEarliestItem());
			System.out.println(Tretrieve.getLatest());
			System.out.println(Tretrieve.getLatestItem());
			//update
			Tretrieve.setEarliestItem(date2);
			Tservice.update(Tretrieve);
			//delete
			Tservice.deleteById(699L);
	}

}
