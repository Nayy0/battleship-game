package battleship;
import io.Input;

/**
 * The class to play the game
 */
public class Game{

	/**the board of the game*/
	private Board board;

	/**
	 * Construct a game of a board given
	 */
	public Game(Board b){
		this.board=b;
	}
	
	/**
	 * return this's board
	 * @return this's board
	 */
	public Board getBoard(){
		return this.board;
	}
	
	/**
	 * builds a table with all the boat of the grid
	 */
	private Boat[] getBoats(){
		Square[][] stab=this.board.getGrid();
		int lengthtab=stab.length*stab[0].length;
		Boat[] t=new Boat[lengthtab];
		int k=0;
		for (int i=0;i<stab.length;i++){
			for (int j=0;i<stab.length;i++){
				Square s=stab[i][j];
				if (s.hasBoat()){
					t[k]=s.getBoat();
					k++;
				}
			}
		}
		return t;
	}


	/**
	 * return true if the game is finished
	 * @return true if the game is finished
	 */
	public boolean isFinished(){
		Boat[] btab=this.getBoats();
		for (Boat boat : btab){
			if (boat!=null && !boat.isSunk()){
				return false;
			}
		}
		return true;
	}

	/**
	 * play the game of battleship
	 */
	public void play(){
		int x=this.board.getGrid().length -1;
		int y=this.board.getGrid()[0].length -1;
		int numberofhit=0;
		while (this.isNotFinished()){
			System.out.println(this.b);
			Position p=this.inputPosition(x,y);
			Response r=this.board.shootAt(p);
			System.out.println(r.name());
			numberofhit++;
		}
		System.out.println("You sank all the boats in "+numberofhit+" hits.");
	}

	/**
	 * returns a position input by the user
	 * @return a position input by the user
	 */
	private Position inputPosition(int x,int y){
		System.out.print("give the first index of your shot (0-"+x+"): ");
		int userI=Input.readInt();
		System.out.print("give the second index of your shot (0-"+y+"): ");
		int userJ=Input.readInt();
		return new Position(userI,userJ);
	}


}
	
		
		
				

