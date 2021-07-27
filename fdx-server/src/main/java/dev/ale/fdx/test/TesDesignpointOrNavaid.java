package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.DesignatedPointOrNavaidType;
import dev.ale.fdx.entity.base.GeographicalPositionType;
import dev.ale.fdx.entity.base.NavaidServiceTypeType;
import dev.ale.fdx.service.DesignPointNavService;

public class TesDesignpointOrNavaid {
	
	public static void main(String [] args) {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			DesignPointNavService DesponService = context.getBean(DesignPointNavService.class);
			
			DesignatedPointOrNavaidType Despon = new DesignatedPointOrNavaidType();
			//create
			Despon.setDesignator("NAV 404");
			NavaidServiceTypeType Nav = NavaidServiceTypeType.valueOf("LOC");
			Despon.setNavaidServiceType(Nav);
			GeographicalPositionType Geopos = new GeographicalPositionType();
			Despon.setPosition(Geopos);
			
			DesponService.create(Despon);
			
			//retrieve
			DesignatedPointOrNavaidType DesponRetrieve = DesponService.retrieve((long) 325);
			
			//Delete
			DesponService.deleteById((long) 325);
	}

}
