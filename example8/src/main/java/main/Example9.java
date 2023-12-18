package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Vehicle;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context =new ClassPathXmlApplicationContext("beans.xml");
		
		
		var v = context.getBean(Vehicle.class);
		
		System.out.println("vehicle from spring context is: "+v.getName());

	}

}
