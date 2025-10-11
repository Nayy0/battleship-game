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
			for(int j;j<w;j++){
				Square s=new Square();
				t[i][j]=s;
			}
		}
		this.grid=t;
	}

	/**
	 * return the response of a shoot at a given position
	 *
		
