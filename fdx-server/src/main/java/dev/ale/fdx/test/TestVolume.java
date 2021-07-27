package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.UomVolumeType;
import dev.ale.fdx.entity.base.VolumeType;
import dev.ale.fdx.service.VolumeService;

public class TestVolume {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		VolumeService Vservice = context.getBean(VolumeService.class);
		//create
		VolumeType V = new VolumeType();
		UomVolumeType value = UomVolumeType.valueOf("US_GAL");
		V.setUom(value);
		V.setValue(8);
		Vservice.create(V);
		//retrieve
		VolumeType Vretrieve = Vservice.retrieve(762L);
		System.out.println("==================== TAMPILKAN DATA ===================");
		System.out.println(Vretrieve.getUom());
		System.out.println(Vretrieve.getValue());
		System.out.println("=======================================================");
		//update
		Vretrieve.setValue(8);
		Vservice.update(Vretrieve);
		//delete
		Vservice.deleteById(763L);
	}

}
