
public class Car extends Vehicle {
	
	private int passengerCount; 
	private Engine eng;
	
	public Car(String make, String model, int year, String color, int PassangerCount, Engine eng) {
		super(make, model, year, color);
		setPassengerCount(PassangerCount);
		setEng(eng);
		
	}


	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public String getEng() {
		return this.eng.toString();
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}
	
	public String toString(){
		return "Make: " +getMake() + " Model: " + this.getModel() + " Year: " + this.getYear() + " Color: " + this.getColor()+ " Passanger Count: " + this.getPassengerCount() + this.getEng();
	}

	
}
