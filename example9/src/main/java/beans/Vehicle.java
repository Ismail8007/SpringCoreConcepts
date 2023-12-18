package beans;

public class Vehicle {

	
	private String name;
	
	public Vehicle() {
		System.out.println("vehicle is created by spring");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void printHello() {
		System.out.println("printing Hello from component Vehicle bean");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "vehicle name is " + name;
	}
	
	
}
