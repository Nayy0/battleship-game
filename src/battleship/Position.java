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
}

