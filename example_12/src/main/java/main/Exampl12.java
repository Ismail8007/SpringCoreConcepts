package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Person;
import config.ProjectConfig;

public class Exampl12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var p = context.getBean(Person.class);
		
		System.out.println("person name is : "+ p.getName());
		
		System.out.println("persons owns vehicle is: "+p.getVehicle());
	}

}
