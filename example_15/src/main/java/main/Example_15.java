package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Person;
import config.ProjectConfig;

public class Example_15 {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		String[] names=context.getBeanDefinitionNames();
		
		
		System.out.println("Before retrieving the person bean from spring context" + names.length);
		
		var p = context.getBean(Person.class);
		String[] names1=context.getBeanDefinitionNames();
		
		System.out.println("After retrieving the person bean from spring context" + names1.length);
		
	}

}
