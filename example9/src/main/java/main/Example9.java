package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Person;
import beans.Vehicle;
import config.ProjectConfig;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		var p = context.getBean(Person.class);
		
		var v =context.getBean(Vehicle.class);
		
		System.out.println("person name from person component: "+p.getName());
		System.out.println("vehicle name from vehicle component: "+ v.getName());
		System.out.println("Persion which he owns a vehicle is: "+ p.getVehicle());
		

	}

}
