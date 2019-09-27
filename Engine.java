
public class Engine {
	
	private double hp = 0;
	

	public Engine(double hp) {
		setHp(hp);
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Engine horse power: " + hp ;
	} 
	
	

}
