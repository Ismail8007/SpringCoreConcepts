package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beans.Vehicle;

@Configuration
@ComponentScan(basePackages="beans")
public class ProjectConfig {
	
	@Bean
	Vehicle vehcile1() {
		var v1 =  new Vehicle();
		v1.setName("Audi");
		return v1;
	}
	
	@Bean
	Vehicle vehicle2() {
		var v2 = new Vehicle();
		v2.setName("Ferrai");
		return v2;
	}
	
	@Bean
	Vehicle vehicle3() {
		var v3 = new Vehicle();
		v3.setName("Ford FreeStyle");
		return v3;
	}

}
