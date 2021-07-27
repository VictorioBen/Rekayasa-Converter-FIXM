package dev.ale.fdx.test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.PersonOrOrganizationType;
import dev.ale.fdx.entity.flight.SupplementaryDataSourceType;
import dev.ale.fdx.entity.flight.SupplementaryDataType;
import dev.ale.fdx.service.SupplementaryDataService;
import javafx.util.Duration;

public class TestSupplementaryData {

	public static void main(String[] args) throws DatatypeConfigurationException {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SupplementaryDataService Sservice = context.getBean(SupplementaryDataService.class);
		SupplementaryDataType S = new SupplementaryDataType();
		javax.xml.datatype.Duration d = DatatypeFactory.newInstance().newDuration(60);
		S.setFuelEndurance(d);
		S.setPersonsOnBoard(8);
		PersonOrOrganizationType value = new PersonOrOrganizationType();
		S.setPilotInCommand(value);
		SupplementaryDataSourceType Sup = new SupplementaryDataSourceType();
		S.setSupplementaryDataSource(Sup);
		
		Sservice.create(S);
		//retrieve
		SupplementaryDataType Sretrieve  = Sservice.retrieve(662L);
		System.out.println("---------- TAMPIL DATA ----------------");
		System.out.println(Sretrieve.getFuelEnduranceItem());
		System.out.println(Sretrieve.getPersonsOnBoard());
		System.out.println(Sretrieve.getPilotInCommand());
		System.out.println(Sretrieve.getSupplementaryDataSource());
		//update
		Sretrieve.setFuelEnduranceItem("PT3M33S");
		Sservice.update(Sretrieve);
		//delete
		Sservice.deleteById(668L);
	}

}
