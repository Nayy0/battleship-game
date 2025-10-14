package battleship;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest{

	@Test
	public void isFinishedReturnTrueWhenFinished() throws InvalidPositionException{
		Board b=new Board(2,2);
		Boat b1=new Boat(2);
		Position p=new Position(0,0);
		b.placeBoat(p,Direction.east,b1);
		Game g=new Game(b);
		Board board=g.getBoard();
		board.shootAt(new Position(0,0));
		board.shootAt(new Position(0,1));
		assertTrue(g.isFinished());
	}

	@Test
	public void isFinishedReturnsFalseWhenNotFinished() throws InvalidPositionException{
		Board b=new Board(2,2);
                Boat b1=new Boat(2);
                Position p=new Position(0,0);
                b.placeBoat(p,Direction.east,b1);
                Game g=new Game(b);
		assertFalse(g.isFinished());
                Board board=g.getBoard();
                board.shootAt(new Position(0,0));
		assertFalse(g.isFinished());
		board.shootAt(new Position(1,1));
		assertFalse(g.isFinished());
	}

}
