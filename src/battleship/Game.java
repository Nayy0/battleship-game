package battleship;

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
	 * @return tthis's board
	 */
	public Board getBoard(){
		return this.board;
	}
	
	/**
	 * return true if the game is finished
	 * @return true if the game is finished
	 */
	public boolean isFinished(){
		
				

