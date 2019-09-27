
public class Garage {
	
	private Car[] carArray = new Car[5];
	private int index = 0; 

	public Garage() {
		
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public Car[] getCarArray(){
		return this.carArray;
	
	}
	
	protected void park(Car car){
		
		if(availabilityCheck()){
			getCarArray()[index] = car; 
			index++;
		}
		
		
	}
	
	private boolean availabilityCheck(){
		
		while(getCarArray().length == index+1){
			expandCarArray();
		}
		
		return true; 
	}
	
	private void expandCarArray(){
		
		Car[] newCarArray = new Car[getCarArray().length*2];
		
		for (int i = 0; i < getCarArray().length ; i ++){
			newCarArray[i] = getCarArray()[i];
		}
		
		this.carArray = newCarArray;
		
	}
	
	public void getCarCheck(int index){
		try{
			if(getCarArray()[index] != null || index < getIndex()){
				System.out.println(carArray[index].toString());
			}else{
				throw new NoCarException(index);
			}
			
		}
		catch(NoCarException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	
	public void unPark(int index){
		
		if(getCarArray().length < index+1){
			System.out.println("we don't have more than " + (index+1) + "parking spots");
		}else if(getIndex() < index){
			System.out.println("there is no car parking in spot " + index);
		}else{
			for (int i = index; i < getIndex(); i++){
				getCarArray()[i] = getCarArray()[i+1];
			}
			
			getCarArray()[getIndex()] = null;
		}
		
		
	}
	
	public String toString()
	{
		for (int i =0 ; i < getCarArray().length; i++){
			return getCarArray()[i].toString();
		}
		
		return null;
		
	}
	
	

}
