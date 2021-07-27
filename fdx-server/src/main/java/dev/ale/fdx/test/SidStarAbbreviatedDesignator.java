package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.SidStarAbbreviatedDesignatorToNextElementType;
import dev.ale.fdx.service.SidstarabBreviatedDesingService;

public class SidStarAbbreviatedDesignator {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SidstarabBreviatedDesingService Sservice = context.getBean(SidstarabBreviatedDesingService.class);
		
		SidStarAbbreviatedDesignatorToNextElementType S = new SidStarAbbreviatedDesignatorToNextElementType();
		S.setSidAbbreviatedDesignator("sid");
		S.setStarAbbreviatedDesignator("star");
		
		Sservice.create(S);
		//retrieve
		SidStarAbbreviatedDesignatorToNextElementType Sretrieve = Sservice.retrieve(608L);
		System.out.println("---------------- TAMPIL DATA ----------------------");
		System.out.println(Sretrieve.getSidAbbreviatedDesignator());
		System.out.println(Sretrieve.getStarAbbreviatedDesignator());
		System.out.println("---------------------------------------------------");
		//update
		Sretrieve.setSidAbbreviatedDesignator("abb");
		Sservice.update(Sretrieve);
		//delete
		Sservice.deleteById(609L);
	}

}
