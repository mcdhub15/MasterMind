
public class Peg {
	
	private int loc;
	private int col;

	public Peg(int loc, int col) {
		// TODO Auto-generated constructor stub
		this.loc = loc;
		this.col = col;
	}
	
	public void setLoc(){
		this.loc  = loc;
	}
	
	public int getLoc(){
		return loc;
	}
	
		
	public void setcolpeg(){
		this.col  = col;
	}
	
	public int getcolpeg(){
		return col;
	}
	
	
	public String toString(){
		String PegInfo;
		PegInfo = "Peg location:" + this.loc + "   " + "Peg colour:" + this.col;
		return PegInfo;
		
	}

}// end class
