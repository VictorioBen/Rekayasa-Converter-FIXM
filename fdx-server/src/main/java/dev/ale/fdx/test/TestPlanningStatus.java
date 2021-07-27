package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.messaging.PlanningStatusType;
import dev.ale.fdx.entity.messaging.PlanningStatusValueType;
import dev.ale.fdx.service.PlanningStatusService;

public class TestPlanningStatus {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PlanningStatusService Pservice = context.getBean(PlanningStatusService.class);
		//create
		PlanningStatusType P = new PlanningStatusType();
		PlanningStatusValueType value = PlanningStatusValueType.valueOf("CONCUR");
		P.setStatus(value);
		P.setStatusReason("this concur");

		Pservice.create(P);
		//retrieve
		PlanningStatusType Pretrieve = Pservice.retrieve((long) 474);
		System.out.println("-------------- TAMPIL DATA ------------");
		System.out.println(Pretrieve.getStatusReason());
		System.out.println(Pretrieve.getStatus());
		System.out.println("---------------------------------------");
		//update
		Pretrieve.setStatusReason("im good");
		Pservice.update(Pretrieve);
		//delete
		Pservice.deleteById(475L);
	}

}
