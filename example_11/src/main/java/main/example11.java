package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Person;
import beans.Vehicle;
import config.ProjectConfig;

public class example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		var p = context.getBean(Person.class);
		
		var v = context.getBean(Vehicle.class);
		
		System.out.println("Person name from person bean : "+ p.getName());
		
		System.out.println("Vehicle name from vehicle bean: "+ v.getName());
		
		System.out.println("name of vehicle own by person bean : "+ p.getVehicle());

	}

}
