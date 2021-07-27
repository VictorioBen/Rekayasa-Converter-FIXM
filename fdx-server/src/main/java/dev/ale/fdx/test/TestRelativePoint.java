package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.BearingType;
import dev.ale.fdx.entity.base.DesignatedPointOrNavaidType;
import dev.ale.fdx.entity.base.DistanceType;
import dev.ale.fdx.entity.base.GeographicalPositionType;
import dev.ale.fdx.entity.base.RelativePointType;
import dev.ale.fdx.service.RelativePointService;

public class TestRelativePoint {

	public static void main(String[] args) {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			RelativePointService Rservice = context.getBean(RelativePointService.class);
			RelativePointType R = new RelativePointType();
			BearingType B = new BearingType();
			R.setBearing(B);
			DistanceType D = new DistanceType();
			R.setDistance(D);
			GeographicalPositionType G = new GeographicalPositionType();
			R.setPosition(G);
			DesignatedPointOrNavaidType Despos = new DesignatedPointOrNavaidType();
			R.setReferencePoint(Despos);
			Rservice.create(R);
			//RETIREVE
			RelativePointType Rretireve = Rservice.retrieve(546L);
			System.out.println(Rretireve.getBearing());
			//Update
			Rretireve.setBearing(B);
			Rservice.update(Rretireve);
			//delete
			Rservice.deleteById(551L);
	}

}
