package battleship;


/**
 * Class for position
 */
public class Position{
	/** the index of a line*/
	private int i;
	/** the index of a column*/
	private int j;

	/**
	 * Builds a position with given i and j
	 */
	public Position(int i,int j){
		this.i=i;
		this.j=j;
	}
	/**
	 * return this's i
	 * @return this's I
	 */
	public int getI(){
		return this.i;
	}
	/**
	 * return this's j
	 * @return this's j
	 */
	public int getJ(){
		return this.j;
	}

	/**
	 * the next position depending on the direction given
	 * @param d the direction of the next position
	 * 
	 */
	public void next(Direction d){
		if(d==Direction.north){
			this.i=this.i-1;
		}else if (d==Direction.south){
			this.i=this.i+1;
		}else if (d==Direction.east){
			this.j=this.j+1;
		}else if (d==Direction.west){
			this.j=this.j-1;
		}
	}

	/**
	 * return the representation of a position
	 * @retur the representation of a position
	 */
	public String toString(){
		return ("("+this.i+", "+this.j+")");
	}
}

