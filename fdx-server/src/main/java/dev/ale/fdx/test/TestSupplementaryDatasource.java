package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3.xlink.v1999.ActuateType;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.AtcUnitReferenceType;
import dev.ale.fdx.entity.base.IcaoUnitReferenceType;
import dev.ale.fdx.entity.base.OtherUnitReferenceType;
import dev.ale.fdx.entity.base.PersonOrOrganizationType;
import dev.ale.fdx.entity.flight.SupplementaryDataSourceType;
import dev.ale.fdx.service.SupplementaryDatasourceService;

public class TestSupplementaryDatasource {

	public static void main(String[] args) {

			AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
			
			SupplementaryDatasourceService Sservice = context.getBean(SupplementaryDatasourceService.class);
			//create
			SupplementaryDataSourceType S = new SupplementaryDataSourceType();
			PersonOrOrganizationType value = new PersonOrOrganizationType();
			S.setPersonOrOrganization(value);
			IcaoUnitReferenceType icao = new IcaoUnitReferenceType();
			S.setUnit(icao);
			
			Sservice.create(S);
			//retrieve
			SupplementaryDataSourceType Sretrieve = Sservice.retrieve(653L);
			System.out.println("---------------- tampil data ----------");
			System.out.println(Sretrieve.getPersonOrOrganization());
			System.out.println(Sretrieve.getUnit());
			//update
			OtherUnitReferenceType other = new OtherUnitReferenceType();
			Sretrieve.setUnit(other);
			//delete
			Sservice.deleteById(656L);
	}

}
