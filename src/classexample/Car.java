package classexample;

public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public Car(int doors, int wheels, String model, String engine, String colour) {
		super();
		this.doors = doors;
		this.wheels = wheels;
		this.model = model;
		this.engine = engine;
		this.colour = colour;
	}

	public int getDoors() {
		return this.doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return this.wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String toString() {
		return "Selected Car has very good specification ";
	}
	
}
