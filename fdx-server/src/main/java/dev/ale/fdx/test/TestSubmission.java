package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.messaging.SubmissionStatusType;
import dev.ale.fdx.entity.messaging.SubmissionStatusValueType;
import dev.ale.fdx.service.SubmissionStatusService;

public class TestSubmission {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SubmissionStatusService Sservice = context.getBean(SubmissionStatusService.class);
		
		SubmissionStatusType S = new SubmissionStatusType();
		SubmissionStatusValueType value = SubmissionStatusValueType.valueOf("MANUAL");
		S.setStatus(value);
		S.setStatusReason("GOOD");
		
		Sservice.create(S);
		//retrieve
		SubmissionStatusType Sretrieve = Sservice.retrieve(650L);
		System.out.println("--------------- TAMPIL DATA ----------------");
		System.out.println(Sretrieve.getStatusReason());
		System.out.println(Sretrieve.getStatus());
		System.out.println("--------------------------------------------");
		//update
		Sretrieve.setStatusReason("PROBLEM");
		//delete
		Sservice.deleteById(651L);
	}

}
