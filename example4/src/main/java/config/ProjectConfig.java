package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import beans.Vehicle;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */

@Configuration
public class ProjectConfig {
	
	
	
	@Bean(name ="audiVehilce")
	Vehicle vehicle1() {
		var v = new Vehicle();
		
		v.setName("audi");
		return v;
	}
	
	@Bean(value="hondaVehicle")
	Vehicle vehicle2() {
		var v1 = new Vehicle();
		v1.setName("honda");
		return v1;
		
	}
	
	@Primary
	@Bean("ferrariVehicle")
	Vehicle vehicle3() {
		var v1 = new Vehicle();
		v1.setName("ferrari");
		return v1;
	}
	

}
