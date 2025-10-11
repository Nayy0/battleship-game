package battleship;

import battleship.Square;
import battleship.Boat;

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
			for(int j;j<w;j++){
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
	public Square[][] getGrid(){}
	
	/**
	 * return the square at the position given in this's grid
	 *@param p the position of the square
	 *@return the square at p in this's grid
	 */
	public Square getSquare(Position p){}

	/**
	 * return the response of a shoot at a position
	 *@param p the position we shoot at
	 *@return the response of a shoot at a given position
	 */
	public Response shootAt(Position p){}
	
	/**
	 * place boat on only one square
	 * @param p the position we place a boat
	 * @param b the boat we want to place
	 */
	public void placeAPiecetOfTheBoat(Position p,Boat b){}

	/**
	 * place a boat in the grid at a position in a direction
	 * @param p the position 
	 * @param d the direction
	 * @param b the boat we want to place
	 */
	public void placeBoat(Position p,Direction d, Boat b){}

	/**
	 * return the string representation of the grid
	 *@return the string representation of the grid
	 */
	public String toString(){}
