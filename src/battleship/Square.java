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
	public boolean getIsShoot(){
		return this.isShoot;
	}

	/**
	 * return a response depending on what this contains,we consider shooting on a square already targeted send the same response as it wasn't targetted
	 * @return a response depending on what this contains
	 */
	public Response shoot(){
		if((!this.hasBoat())){
			return Response.miss;
		}
		this.shootBoat();
		if(this.boat.isSunk()){
			return Response.sunk;
		}else{
			return Response.hit;
		}
		
	}
	
	/**
	 * return true if this has a boat
	 * @return true if this has a boat
	 */
	public boolean hasBoat(){
		return this.boat!=null;
	}
	
	/**
	 * shoot on the boat of the square
	 */
	public void shootBoat(){
		if(!this.isShoot){
			this.boat.isTouched();
		}
		this.isShoot=true;
	}

	/**
	 * return the representation of a square
	 * @return the representation of a square
	 */
	public String toString(){
		if(!this.isShoot){
			return ".";
		}else if(this.shoot()==Response.miss){
			return "~";
		}else{
			return "*";
		}
	}
					

	
}	

