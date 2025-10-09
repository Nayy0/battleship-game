package battleship;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import battleship.Boat;


public class BoatTest{

	@Test
	public void addOneWhenBoatIsTouched(){
		Boat b=new Boat(2);
		b.isTouched();
		assertSame(1,b.getNbTouches());
	}

	@Test
	public void trueWhenBoatIsSunk(){
		Boat b=new Boat(2);
                b.isTouched();
		b.isTouched();
		assertTrue(b.isSunk());
	}

	@Test
	public void dontAddWhenBoatIsSunk(){
		Boat b=new Boat(2);
                b.isTouched();
                b.isTouched();
                assertSame(2,b.getNbTouches());
		b.isTouched();
                assertSame(2,b.getNbTouches());
		assertTrue(b.isSunk());
	}
}



