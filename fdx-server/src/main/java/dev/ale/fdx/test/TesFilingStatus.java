package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.messaging.FilingStatusType;
import dev.ale.fdx.entity.messaging.FilingStatusValueType;
import dev.ale.fdx.service.FilingStatusService;

public class TesFilingStatus {
	
	public static void main(String [] args) {
		
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			FilingStatusService FilService = context.getBean(FilingStatusService.class);
			//create
//			FilingStatusType Filing = new FilingStatusType();
//			FilingStatusValueType value = FilingStatusValueType.valueOf("ACCEPTABLE");
//			Filing.setStatus(value);
//			Filing.setStatusReason("Silahkan mendarat");
//			
			//FilService.create(Filing);
			
			//retrieve
			FilingStatusType FilRetrieve = FilService.retrieve((long) 354);
			System.out.println(FilRetrieve.getStatus());
			System.out.println(FilRetrieve.getStatusReason());
			
			//delete
			//FilService.deleteById((long) 355);
			
			//update
			FilingStatusType FilUpdate = FilService.updateById((long) 354);
			FilUpdate.setStatusReason("Silahkan landing");
			
			
	}

}
