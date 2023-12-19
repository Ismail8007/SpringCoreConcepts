package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import services.VehicleService;

public class Example_16 {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		var vs1 =context.getBean(VehicleService.class);
		
		var vs2 = context.getBean("vehicleService",VehicleService.class);
		
		System.out.println("Hashcode of the object vs1 : "+ vs1.hashCode());
		System.out.println("Hashcode of the object vs2 : "+ vs2.hashCode());
		
		if(vs1 != vs2) {
			System.out.println("vehicle services bean is a prototype scoped bean");
		}
		
	}

}
