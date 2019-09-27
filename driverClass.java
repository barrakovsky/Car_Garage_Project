
public class driverClass {

	public static void main(String[] args) {
		
		Engine eng1 = new Engine(150);
		Car c1 = new Car("Honda1", "bar1", 1990, "Yellow", 4, eng1 );
		Car c2 = new Car("Honda2", "bar1", 1990, "Yellow", 4, eng1 );
		Car c3 = new Car("Honda3", "bar1", 1990, "Yellow", 4, eng1 );
		
		Garage gr1 = new Garage();
		
		gr1.park(c1);
		
		
	}

}
