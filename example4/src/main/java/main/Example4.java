package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Vehicle;
import config.ProjectConfig;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var v =context.getBean(Vehicle.class);
		
		System.out.println(v.getName());

	}

}
