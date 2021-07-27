package dev.ale.fdx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.ale.fdx.config.AppConfig;
import dev.ale.fdx.entity.base.TemporalChoiceType;
import dev.ale.fdx.entity.flight.DepartureOrArrivalIndicatorType;
import dev.ale.fdx.entity.flight.TimeConditionType;
import dev.ale.fdx.entity.flight.TimeConstraintType;
import dev.ale.fdx.service.TimeConstraintService;

public class TestTimeConstraint {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TimeConstraintService Tservice = context.getBean(TimeConstraintService.class);
		
		TimeConstraintType T = new TimeConstraintType();
		TimeConditionType value = TimeConditionType.valueOf("BETWEEN");
		T.setCondition(value);
		T.setConstraintReference("Barrier");
		DepartureOrArrivalIndicatorType depart = DepartureOrArrivalIndicatorType.valueOf("ARRIVAL");
		T.setDepartureOrArrivalIndicator(depart);
		T.setSeqNum(8);
		TemporalChoiceType Tchoice = new TemporalChoiceType();
		T.setTemporalSpecification(Tchoice);
		Tservice.create(T);
		//retrieve
		TimeConstraintType Tretrieve = Tservice.retrieve(701L);
		System.out.println("===================== TAMPILKAN DATA ========================");
		System.out.println(Tretrieve.getConstraintReference());
		System.out.println(Tretrieve.getCondition());
		System.out.println(Tretrieve.getDepartureOrArrivalIndicator());
		System.out.println(Tretrieve.getSeqNum());
		System.out.println(Tretrieve.getTemporalSpecification());
		System.out.println("=================================================");
		//update
		Tretrieve.setSeqNum(7);
		Tservice.update(Tretrieve);
		//delete
		Tservice.deleteById(703L);
	}

}
