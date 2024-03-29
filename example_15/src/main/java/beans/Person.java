package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*@Lazy can be used at component level and config level
*/
@Lazy
@Component(value="personBean")
public class Person {
	
	public Person() {
		System.out.println("person bean created");
	}
	
	private String name="Ismail";
	
	@Autowired
	private Vehicle vehicle;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}
