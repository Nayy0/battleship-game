package battleship;

/**
 * Class for boat
 */
public class Boat{
	/**the length of the boat*/
	private int length;
	/** the number of time the boat has been touched*/
	private int nbTouches;
	
	/**
	 * Buils a Boat with given length, number touches is 0
	 */
	public Boat(int length){
		this.length=length;
		this.nbTouches=0;
	}

	/**
	 * return true if the boat is sunk
	 * @return true if boat is sunk
	 */
	public boolean isSunk(){
		return this.length==this.nbTouches;
	}

	/**
	 * return this's length
	 * @return this's length
	 */
	public int getLength(){
		return this.length;
	}
	/**
	 * return this's nbTouches
	 * @return this's nbTouches
	 */
	public int getNbTouches(){
		return this.nbTouches;
	}

	/**
	 * add 1 to this's nbTouches
	 */
	public void isTouched(){
		if(!this.isSunk()){
			this.nbTouches++;
		}
	}
}
