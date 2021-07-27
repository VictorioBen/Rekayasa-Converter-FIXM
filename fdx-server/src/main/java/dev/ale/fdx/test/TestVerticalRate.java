package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.UomVerticalRateType;
import dev.ale.fdx.entity.base.VerticalRateType;
import dev.ale.fdx.service.VerticalRateService;

public class TestVerticalRate {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		VerticalRateService Vservice = context.getBean(VerticalRateService.class);
		VerticalRateType V = new VerticalRateType();
		UomVerticalRateType value = UomVerticalRateType.valueOf("FT_MIN");
		V.setUom(value);
		V.setValue(10);
		Vservice.create(V);

		//retrieve
		VerticalRateType Vretrieve = Vservice.retrieve(759L);
		System.out.println("=============== TAMPILKAN DATA =============");
		System.out.println(Vretrieve.getUom());
		System.out.println(Vretrieve.getValue());
		System.out.println("============================================");
		//update
		Vretrieve.setValue(8);
		Vservice.update(Vretrieve);
		//delte
		Vservice.deleteById(760L);
	}

}
