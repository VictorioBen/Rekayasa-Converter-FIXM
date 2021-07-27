package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.OnlineContactType;
import dev.ale.fdx.entity.base.TelecomNetworkTypeType;
import dev.ale.fdx.service.OnlineContactService;

public class TestOnlineContact {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		OnlineContactService OnService = context.getBean(OnlineContactService.class);
		//create
		OnlineContactType online = new OnlineContactType();
		//create
		online.setEmail("platkuning13@gmail.com");
		online.setLinkage("www.snap.co.id");
		TelecomNetworkTypeType telecom = TelecomNetworkTypeType.valueOf("INTERNET");
		online.setNetwork(telecom);
		online.setExtension(null);

		OnService.create(online);

		//retrieve
		OnlineContactType OnRetrieve = OnService.retrieve((long) 317);
		System.out.println(OnRetrieve.getEmail());
		System.out.println(OnRetrieve.getLinkage());
		System.out.println(OnRetrieve.getNetwork());

		//delete
		OnService.deleteById((long) 317);

	}

}
