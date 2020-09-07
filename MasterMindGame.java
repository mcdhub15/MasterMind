
public class MasterMindGame {
	
	private int numpegs;
	private int numcolpegs;

	public MasterMindGame(int numpegs, int numcolpegs) {
		// TODO Auto-generated constructor stub
		
		this.numpegs = numpegs;
		this.numcolpegs = numcolpegs;
		
		
	}
	
	
	public void setnumpegs(){
		this.numpegs = numpegs;
	}
	
	public int getnumpegs(){
		return numpegs;
	}
	
	public void setcolpegs(){
		this.numcolpegs = numcolpegs;
		
	}
	
	public int getcolpegs(){
		//return getcolpegs;
		return numcolpegs;
	}
	
	public String toString(){
		String GameStatus;
		
		GameStatus = this.numpegs + "  " + this.numcolpegs;
		return GameStatus;
	}

}// end class
