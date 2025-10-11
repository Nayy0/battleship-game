package battleship;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import battleship.Boat;
import battleship.Square;
import battleship.Response;


public class SquareTest{

	@Test
	public void trueWhenHasABoat(){
		Boat b=new Boat(3);
		Square s=new Square(b);
		assertTrue(s.hasBoat());
	}
	@Test
	public void falseWhenHasNoBoat(){
                Square s=new Square();
                assertFalse(s.hasBoat());
	}
	@Test
	public void respondMissWhenShootIsMissed(){
		Boat b=new Boat(3);
                Square s=new Square();
		Response r1=s.shoot();
		Response r2=Response.miss;
		assertSame(r1,r2);
	}

	@Test
	public void respondHitWhenShootIsHit(){
		Boat b=new Boat(3);
                Square s=new Square(b);
                Response r1=s.shoot();
                Response r2=Response.hit;
                assertSame(r1,r2);
	}

	@Test 
	public void respondSunkWhenShootSunkABoat(){
		Boat b=new Boat(2);
		b.isTouched();
		b.isTouched();
                Square s=new Square(b);
                Response r1=s.shoot();
                Response r2=Response.sunk;
                assertSame(r1,r2);
	}

	@Test
	public void doNotAddToNbTouchesWhenHasBeenShot(){
		Boat b=new Boat(3);
                Square s=new Square(b);
		s.shoot();
		assertSame(1,b.getNbTouches());
		s.shoot();
		assertSame(1,b.getNbTouches());
	}

	@Test
	public void sendSunkIfShootSunkTheBoat(){
		Boat b=new Boat(2);
		Square s1=new Square(b);
		Square s2=new Square(b);
		s1.shoot();
		Response r=s2.shoot();
		assertSame(r,Response.sunk);
	}

	@Test
	public void sendSunkWhenSunkAndAlreadyHaveBeenShoot(){
		Boat b=new Boat(2);
                Square s1=new Square(b);
                Square s2=new Square(b);
                s1.shoot();
                s2.shoot();
		Response r1=s1.shoot();
		Response r2=s2.shoot();
		assertSame(r1,Response.sunk);
		assertSame(r2,Response.sunk);
	}


	@Test
	public void sendMissIfShootTouchNothing(){
		Square s=new Square();
		Response r=s.shoot();
		assertSame(r,Response.miss);
	}

	@Test
	public void sendHitIfShootTouchBoat(){
		Boat b=new Boat(3);
                Square s=new Square(b);
                Response r=s.shoot();
		assertSame(r,Response.hit);
	}
	@Test
	public void sendHitIfShootTouchBoatMultipleTimeButNotSunk(){
                Boat b=new Boat(2);
                Square s=new Square(b);
		s.shoot();
                Response r=s.shoot();
                assertSame(r,Response.hit);
	}




}
