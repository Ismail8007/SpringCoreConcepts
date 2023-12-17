package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Vehicle;

@Configuration
public class ProjectConfig {
	
	@Bean(name ="audiVehicle")
	Vehicle vehicle1() {
		var v1 = new Vehicle();
		v1.setName("audi");
		return v1;
	}
	
	@Bean(value="hondaVehilce")
	Vehicle vehicle2() {
		var v2 = new Vehicle();
		v2.setName("honda");
		return v2;
	}
	
	
	@Bean("ferrariVehicle")
	Vehicle vehicle3() {
		var v3 = new Vehicle();
		v3.setName("ferrari");
		return v3;
	}

}
