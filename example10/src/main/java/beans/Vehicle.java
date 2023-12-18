package beans;

public class Vehicle {
	
	public Vehicle() {
		System.out.println("vehicle bean is created by spring");
	}

	
	private String name;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "vehicle name is: "+ name;
	}
	
	
}
