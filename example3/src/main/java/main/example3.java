package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Vehicle;
import config.ProjectConfig;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		var v1 =context.getBean("audiVehicle", Vehicle.class);
		System.out.println("vehicle name from spring context : "+ v1.getName());
		
		var v2 = context.getBean("hondaVehilce",Vehicle.class);
		
		System.out.println("vehicle name from spring context: "+ v2.getName());
		
		
		var v3 = context.getBean("ferrariVehicle",Vehicle.class);
		System.out.println("vehicle name form spring conext: "+v3.getName());

	}

}
