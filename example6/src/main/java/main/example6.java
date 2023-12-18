package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Vehicle;
import config.ProjectConfig;

public class example6 {
	
	public static void main(String[] args) {
		
		
		var context  = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		var v = context.getBean(Vehicle.class);
		
		System.out.println("vehicle name from application context: "+v.getName());
		
		v.sayHello();
		
		context.close();
		
	}

}
