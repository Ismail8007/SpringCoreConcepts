package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	

	private String name ="Ismail";
	
	
	/* @Autowired */
	private Vehicle vehicle;
	
	 /*
    The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */
	
	@Autowired
	public Person(Vehicle vehicle) {
		this.vehicle = vehicle;
		System.out.println("person bean created by spring");
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Vehicle getVehicle() {
		return vehicle;
	}

	/* @Autowired */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


}
