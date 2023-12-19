package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Person;
import config.ProjectConfig;

public class Example_15 {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		System.out.println("Before retrieving the person bean from spring context");
		
		var p = context.getBean(Person.class);
		
		System.out.println("After retrieving the person bean from spring context");
		
	}

}
