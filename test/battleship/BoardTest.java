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
		assertArrayEquals(b.getGrid()[0],t);
		assertArrayEquals(b.getGrid()[1],t);
	}

	@Test
	public void getTheCorrectSquare() throws InvalidPositionException{
	        Boat b1=new Boat(1);
		Board b=new Board(2,2);
		Position p=new Position(1,1);
		b.placeBoat(p,Direction.west,b1);
		Square s=b.getSquare(p);
		assertSame(s.getBoat(),b1);
	}

	@Test
	public void getTheCorrectAnswerWhenShoot() throws InvalidPositionException{
		Boat b1=new Boat(2);
		Board b=new Board(2,2);
		Position p1=new Position(0,1);
		b.placeBoat(p1,Direction.west,b1);
		Response r1=b.shootAt(p1);
		assertSame(Response.hit,r1);
		Position p2=new Position(0,0);
		Response r2=b.shootAt(p2);
		Position p3=new Position(1,1);
		assertSame(Response.sunk,r2);
		Response r3=b.shootAt(p3);
		assertSame(Response.miss,r3);
	}

	@Test
	public void shootAtThrowsExceptionWhenPositionOutTheGrid() throws InvalidPositionException {
		Board b=new Board(2,2);
		Position p=new Position(2,2);
		assertThrows(InvalidPositionException.class,
			       () -> b.shootAt(p));
	}


	@Test
	public void palceBoatIsCorrect() throws InvalidPositionException {
		Board b=new Board(2,2);
		Position p1 =new Position(0,1);
		Boat b1=new Boat(2);
		b.placeBoat(p1,Direction.south,b1);
		Square s1=b.getSquare(p1);
		Position p2=new Position(1,1);
		Square s2=b.getSquare(p2);
		assertSame(b1,s1.getBoat());
		assertSame(b1,s2.getBoat());
		Position p3=new Position(0,0);
		Position p4=new Position(1,0);
		Square s3=b.getSquare(p3);
		Square s4=b.getSquare(p4);
		assertNull(s3.getBoat());
		assertNull(s4.getBoat());
	}

	@Test
	public void placeBoatThrowsExceptionWhenAnotherBoatIsMet() throws InvalidPositionException{
		Board b=new Board(2,2);
		Position p1=new Position(0,1);
		Boat b1=new Boat(2);
		b.placeBoat(p1,Direction.south,b1);
		Position p2=new Position(0,0);
		assertThrows(InvalidPositionException.class,
				() -> b.placeBoat(p2,Direction.east,b1));
	}

		
}
