package battleship;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import battleship.Board;
import battleship.Boat;
import battleship.Square;


public class BoardTest{
	
	@Test
	public void gridIsGoodAtCreation(){
		Board b=new Board(2,2);
		Square[] t=new Square[2];
		for(int i=0;i<t.length;i++){
			Square s=new Square();
			t[i]=s;
		}
		assertArrayEquals(b.grid[0],t);
		assertArrayEquals(b.grid[1],t);
	}

	@Test
	public void getTheCorrectSquare(){
	        Boat b1=new Boat(1);
		Board b=new Board(2,2);
		Position p=new Position(1,1);
		b.placeBoat(p,Direction.west,b1);
		Square s=getSquare(p);
		assertSame(s.getBoat(),b1);
	}
}
	

