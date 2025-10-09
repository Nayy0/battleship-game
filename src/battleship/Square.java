package battleship;

/**
 * Class for Square
 */
public class Square{
	/**true if it already has been shot at */
	private boolean isShoot;
	/**the boat the square has*/
	private Boat boat;

	/**
	 * Creates a square with no boat and has not been shot
	 */
	public Square(){
		this.boat=null;
		this.isShoot=false;
	}

	/**
	 * Creates a square with a given boat and has not been shot
	 */
	public Square(Boat b){
		this.boat=b;
		this.isShoot=false;
	}

	/**
	 * return this's boat
	 * @return this's boat
	 */
	public Boat getBoat(){
		return this.boat;
	}

	/**
	 * return this's isShoot
	 * @return this's isShoot
	 */
	public boolean isShoot(){
		return this.isShoot;
	}

	/**
	 * return a response depending on what this contains
	 * @return a response depending on what this contains
	 */
	public Response shoot(){}

	/**
	 * return true if this has a boat
	 * @return true if this has a boat
	 */
	public boolean hasBoat(){
	}

	
}	

