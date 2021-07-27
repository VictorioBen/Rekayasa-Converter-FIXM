package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3.xlink.v1999.ActuateType;
import org.w3.xlink.v1999.ShowType;
import org.w3.xlink.v1999.TypeType;

import com.sun.webkit.ContextMenu.ShowContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.RelativePointType;
import dev.ale.fdx.entity.base.SignificantPointType;
import dev.ale.fdx.service.SignificationPointService;

public class TestSignificantPoint {

	public static void main(String[] args) {
			
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SignificationPointService Sservice = context.getBean(SignificationPointService.class);
		//create
		RelativePointType Repon = new RelativePointType();
		ActuateType value = ActuateType.valueOf("ON_REQUEST");
		Repon.setActuate(value);
		Repon.setArcrole("Role");
		Repon.setRole("Middle");
		ShowType s = ShowType.valueOf("NONE");
		Repon.setShow(s);
		Repon.setTitleAttribute("Arrival");
		TypeType type = TypeType.valueOf("TITLE");
		Repon.setType(type);
		
		Sservice.create(Repon);
		//retrieve
		RelativePointType Rretrive = (RelativePointType) Sservice.retrieve(612L);
		System.out.println("------------- TAMPIL DATA ---------------");
		System.out.println(Rretrive.getArcrole());
		System.out.println(Rretrive.getActuate());
		System.out.println(Rretrive.getRole());
		System.out.println("-----------------------------------------");
		//update
		Rretrive.setTitleAttribute("Departure");
		Sservice.update(Rretrive);
		//delete
		Sservice.deleteById(613L);
	}

}
