package battleship;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import battleship.Direction;

public class PositionTest{

	@Test
	public void IsGoodAtCreation(){
		Position p=new Position(1,0);
		assertSame(1,p.getI());
		assertSame(0,p.getJ());
	}

	@Test
	public void goodNextWhenNorth(){
		Position p=new Position(1,1);
		p.next(Direction.north);
		assertSame(0,p.getI());
		assertSame(1,p.getJ());
	}

	@Test
	public void goodNextWhenSouth(){
		Position p=new Position(1,1);
		p.next(Direction.south);
		assertSame(2,p.getI());
		assertSame(1,p.getJ());
	}
	
	@Test
	public void goodNextWhenEast(){
		Position p=new Position(1,1);
                p.next(Direction.east);
                assertSame(1,p.getI());
                assertSame(2,p.getJ());
	}

	@Test
	public void goodNextWhenWest(){
		Position p=new Position(1,1);
                p.next(Direction.west);
                assertSame(1,p.getI());
                assertSame(0,p.getJ());
	}
}
