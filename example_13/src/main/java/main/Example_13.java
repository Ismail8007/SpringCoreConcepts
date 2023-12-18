package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Person;
import beans.Vehicle;
import config.ProjectConfig;

public class Example_13 {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		String[] persons =context.getBeanNamesForType(Person.class);
		
		var p =context.getBean(Person.class);
		
		String[] vehicles = context.getBeanNamesForType(Vehicle.class);
		
		System.out.println("person name is : "+ p.getName());
		
		System.out.println("person owns vehicle is: "+ p.getVehicle().getName());
		
		p.getVehicle().getVehicleService().playMusic();
		p.getVehicle().getVehicleService().moveVehicle();
		
		
	}

}
