
public class Vehicle {
	
	private String make; 
	private String model;
	private int year; 
	private String color;
	
	
	
	public Vehicle(String make, String model, int year, String color) {
		setMake(make);
		setModel(model);
		setYear(year);
		setColor(color);
	}
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + "]";
	}
	
	
	
	

}
