
public class NoCarException extends Exception {
	
	private int index;

	public NoCarException( int index) {
		super("There was no car in parking spot number " + index);		
		setIndex(index);
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	

}
