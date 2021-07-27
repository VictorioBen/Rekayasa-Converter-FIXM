package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.ActivationType;
import dev.ale.fdx.entity.flight.LevelConditionType;
import dev.ale.fdx.entity.flight.LevelConstraintType;
import dev.ale.fdx.service.LevelConstrainService;

public class TestLevelConstraint {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		LevelConstrainService Lservice = context.getBean(LevelConstrainService.class);
		//create
		LevelConstraintType Level = new LevelConstraintType();
		ActivationType activation = ActivationType.valueOf("PLAN_TO_ATTAIN");
		Level.setActivation(activation);
		LevelConditionType condition = LevelConditionType.valueOf("AT_OR_BELOW");
		Level.setCondition(condition);
		Level.setConstraintReference("Plan AT");
		
		Lservice.create(Level);
		//retrieve
		LevelConstraintType Lretrieve = Lservice.retrieve((long) 440);
		System.out.println("----------- TAMPILKAN DATA ------------");
		System.out.println(Lretrieve.getConstraintReference());
		System.out.println(Lretrieve.getActivation());
		System.out.println(Lretrieve.getCondition());
		System.out.println("------------ TAMPILKAN DATA -----------");
		
		//Update
		Lretrieve.setConstraintReference("Plan Below");
		Lservice.update(Lretrieve);
		
		//delete
		Lservice.deleteById((long) 440);

	}

}
