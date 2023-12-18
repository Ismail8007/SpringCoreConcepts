package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import services.VehicleService;

@Component("vehicleBean")
public class Vehicle {
	
	private String name ="Ford FreeStyle";
	
	@Autowired
	private VehicleService vehicleService;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VehicleService getVehicleService() {
		return vehicleService;
	}

	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
	
	

}
