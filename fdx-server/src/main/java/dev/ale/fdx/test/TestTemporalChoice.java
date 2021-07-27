package dev.ale.fdx.test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TemporalChoiceType;
import dev.ale.fdx.entity.base.TemporalRangeType;
import dev.ale.fdx.service.TemporalChoiceService;

public class TestTemporalChoice {

	public static void main(String[] args) throws DatatypeConfigurationException, ParseException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		TemporalChoiceService Tservice = context.getBean(TemporalChoiceService.class);
		TemporalChoiceType T = new TemporalChoiceType();
		TemporalRangeType Tr = new TemporalRangeType();
		T.setTemporalRange(Tr);
		XMLGregorianCalendar xcall = DatatypeFactory.newInstance().newXMLGregorianCalendar("2019-10-03");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		java.util.Date date = format.parse("2019-10-03 07:23:10");
		T.setTimeValueItem(date);
		Tservice.create(T);
		//retrieve
		TemporalChoiceType Tretrieve = Tservice.retrieve(692L);
		System.out.println("================= TAMPILKAN DATA ===============");
		System.out.println(Tretrieve.getTemporalRange());
		System.out.println(Tretrieve.getTimeValue());
		System.out.println(Tretrieve.getTimeValueItem());
		System.out.println("=================================================");
		//update
		java.util.Date date2 = format.parse("2012-12-12 03:20:10");
		Tretrieve.setTimeValueItem(date2);
		Tservice.update(Tretrieve);
		//Delete
		Tservice.deleteById((long) 694);
	}

}
