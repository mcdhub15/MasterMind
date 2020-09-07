
public class MasterMind {

	public MasterMind() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int np = (int) (10* Math.random()+1);
		int nc = (int) (9* Math.random()+1);
		//int np = 4;
		//int nc = 5;
		
		MasterMindGame mg = new MasterMindGame(np, nc);
		
		System.out.println(mg);
		
		
		System.out.println("Number of pegs:" + mg.getnumpegs());
		
		System.out.println("Number of colours:" + mg.getcolpegs());
		
		
		//int [] grades = new int[4];
		
		//int [] board = new int[np];
		
		
		/*
		 * 
		 * set dynamic array size for Board and randomly assign colour to each peg in the array
		 * 
		 */
		
		 // Film Watch[] = new Film[4];
	     //  Watch[0] = new Film("Shrek",133);
		 Peg Board[] = new Peg[np];
		
		for (int spc= 0; spc < Board.length; spc ++){
			System.out.println("tracing:" + nc);
			
			int pegcol = (int) (nc* Math.random()+1);
			
			Board[spc] = new Peg(spc,  pegcol);
			
			
			
		}
		
for (int spc= 0; spc < Board.length; spc++){
	
	System.out.println("index:" + spc);
			
	System.out.println(Board[spc]);
			
			
			
		}



	
		
		
		
		
		
		
	}// end main		

}// end class
