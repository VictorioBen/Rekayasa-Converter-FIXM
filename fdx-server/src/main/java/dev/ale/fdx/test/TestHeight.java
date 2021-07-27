package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.HeightType;
import dev.ale.fdx.entity.base.UomHeightType;
import dev.ale.fdx.entity.base.VerticalReferenceType;
import dev.ale.fdx.service.HeightService;

public class TestHeight {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		HeightService Hservice = context.getBean(HeightService.class);
		//create
		HeightType Height = new HeightType();
		UomHeightType uom = UomHeightType.valueOf("FT");
		Height.setUom(uom);
		VerticalReferenceType VerRef  = VerticalReferenceType.valueOf("STD");
		Height.setRef(VerRef);
		Height.setValue(10);

		Hservice.create(Height);
		
		//retrieve
		HeightType Hretrieve = Hservice.retrieve(409L);
		System.out.println(Hretrieve.getValue());
		System.out.println(Hretrieve.getUom());
		System.out.println(Hretrieve.getRef());
		
		//Update
		VerticalReferenceType verRef2 = VerticalReferenceType.valueOf("SFC");
		Hretrieve.setRef(verRef2);
		Hservice.update(Hretrieve);
		
		//delete
		Hservice.deleteById(410L);

		
	}

}
