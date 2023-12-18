package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Person;
import beans.Vehicle;

@Configuration
public class ProjectConfig {

	
	
	@Bean
	public Vehicle vehicle() {
		Vehicle v = new Vehicle();
		v.setName("Toyato");
		return v;
		
	}
	
	
	/*
    Here in the below code, we are trying to wire or establish a relationship between Person
    and Vehicle, by passing the vehicle as a method parameter to the person() bean method.

    Spring injects the vehicle bean to the person bean using Dependency Injection. Spring will
    make sure to have only 1 vehicle bean is created and also vehicle bean will be created
    first always as person bean has dependency on it.

    * */
	
	@Bean
	public Person person(Vehicle vehicle) {
		var p = new Person();
		p.setName("Ismail");
		p.setVehicle(vehicle);
		return p;
	}
}
