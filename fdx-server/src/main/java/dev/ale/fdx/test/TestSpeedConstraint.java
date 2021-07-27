package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TrueAirspeedChoiceType;
import dev.ale.fdx.entity.flight.ActivationType;
import dev.ale.fdx.entity.flight.SpeedConditionType;
import dev.ale.fdx.entity.flight.SpeedConstraintType;
import dev.ale.fdx.service.SpeedConstrainService;

public class TestSpeedConstraint {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SpeedConstrainService Sservice = context.getBean(SpeedConstrainService.class);
		//create
		SpeedConstraintType S = new SpeedConstraintType();
		ActivationType value  = ActivationType.valueOf("PLAN_TO_ATTAIN");
		S.setActivation(value);
		SpeedConditionType Speed = SpeedConditionType.valueOf("BETWEEN");
		S.setCondition(Speed);
		TrueAirspeedChoiceType choice = new TrueAirspeedChoiceType();
		S.setSpeed(choice);
		
		Sservice.create(S);
		//retrieve
		SpeedConstraintType Sretrieve = Sservice.retrieve(627L);
		System.out.println("------------ TAMPIL DATA -----------------");
		System.out.println(Sretrieve.getConstraintReference());
		System.out.println(Sretrieve.getActivation());
		System.out.println(Sretrieve.getSpeed());
		System.out.println(Sretrieve.getCondition());
		System.out.println("------------------------------------------");
		//update
		SpeedConditionType Scondition =  SpeedConditionType.valueOf("AT");
		Sretrieve.setCondition(Scondition);
		//delete
		Sservice.deleteById(631L);
	}

}
