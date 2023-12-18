package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Person;
import beans.Vehicle;
import config.ProjectConfig;

public class Example10 {
	
	public static void main(String[] args) {
		
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		var v = context.getBean(Vehicle.class);
		
		var p = context.getBean(Person.class);
		
		System.out.println("person name from person bean: "+ p.getName());
		System.out.println("vehicle name from vehicle  bean :" + v.getName());
		System.out.println("Persons owns vehicle name is : "+ p.getName());
	}

}
