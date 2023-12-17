package main;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Vehicle;
import projectConfig.ProjectConfig;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v = new Vehicle();
		
		v.setName("Ford free style");
		
		System.out.println("vehicle with out from config file : "+v.getName());
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		var v1 = context.getBean(Vehicle.class);
		
		System.out.println("vehicle from configuration "+v1.getName());
		
		
	}

}
