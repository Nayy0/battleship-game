package battleship;

/**
 * Class fot board
 */
public class Board{
	/**the grid of the board*/
	private Square[][] grid;
	/**
	 * Creats a grid of length and width given
	 */
	public Board(int l,int w){
		Square[][] t=new Square[l][w];
		for(int i=0;i<l;i++){
			for(int j=0;j<w;j++){
				Square s=new Square();
				t[i][j]=s;
			}
		}
		this.grid=t;
	}
	
	/**
	 * return this's grid
	 * @return this's grid
	 */
	public Square[][] getGrid(){
		return this.grid;
	}
	
	/**
	 * return the square at the position given in this's grid
	 *@param p the position of the square
	 *@return the square at p in this's grid
	 *@exception InvalidPositionException if the position is out of the grid
	 */
	public Square getSquare(Position p) throws InvalidPositionException{
		int i=p.getI();
		int j=p.getJ();
		if (i>=this.grid.length || i<0 || j>=this.grid[0].length || j<0){
			throw new InvalidPositionException("position"+p+"is not valid");
		}
		return this.grid[i][j];
	}

	/**
	 * return the response of a shoot at a position
	 *@param p the position we shoot at
	 *@return the response of a shoot at a given position
	 * @throws InvalidPositionException if the position is out of the grid
	 */
	public Response shootAt(Position p) throws InvalidPositionException {
			Square s=this.getSquare(p);
			Response r=s.shoot();
			return r;
	}
	
	/**
	 * place boat on only one square
	 * @param p the position we place a boat
	 * @param b the boat we want to place
	 * @throws InvalidPositionException if the position is out of the grid or the Square already has a boat
	 */
	private void placeBoatOnOneSquare(Position p,Boat b) throws InvalidPositionException {
		Square s1=this.getSquare(p);
		if (s1.hasBoat()){
			throw new InvalidPositionException("there is already a boat in the squares");
		}
		Square s2=new Square(b);
		int i=p.getI();
		int j=p.getJ();
		this.grid[i][j]=s2;
	}


	/**
	 * place a boat in the grid at a position in a direction
	 * @param p the position 
	 * @param d the direction
	 * @param b the boat we want to place
	 * @throws InvalidPositionException if the position is out of the grid or the Square already has a boat
	 */
	public void placeBoat(Position p,Direction d, Boat b) throws InvalidPositionException {
		for (int n=0;n < b.getLength();n++){
			this.placeBoatOnOneSquare(p,b);
			p.next(d);
		}

	}

	/**
	 * return the string representation of the grid
	 *@return the string representation of the grid
	 */
//	public String toString(){}

}
