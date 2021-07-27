package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.flight.RouteDesignatorToNextElementType;
import dev.ale.fdx.service.RouteDesignToNextElementService;

public class TestRouteDesignatorNextElement {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		RouteDesignToNextElementService Rservice = context.getBean(RouteDesignToNextElementService.class);
		//create 
		RouteDesignatorToNextElementType R = new RouteDesignatorToNextElementType();
		R.setRouteDesignator("Route");
		R.setStandardInstrumentArrival("Standar");
		R.setStandardInstrumentDeparture("depart");
		Rservice.create(R);
		//Retrieve
		RouteDesignatorToNextElementType Rretrieve = Rservice.retrieve(561L);
		System.out.println("------------- TAMPIL DATA ------------");
		System.out.println(Rretrieve.getRouteDesignator());
//		System.out.println(Rretrieve.getStandardInstrumentArrival());
//		System.out.println(Rretrieve.getStandardInstrumentDeparture());
//		System.out.println("---------------------------------------");
		//update
//		Rretrieve.setRouteDesignator("Design");
//		Rretrieve.setStandardInstrumentArrival("Takeoff");
//		Rservice.update(Rretrieve);
//		//delete
		//Rservice.deleteById(561L);
	}

}
