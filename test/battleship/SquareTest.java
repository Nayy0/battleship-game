import battleship;

public class SquareTest{

	@Test
	public void trueWhenHasABoat(){
		Boat b=new Boat(3);
		Square s=new Square(b);
		assertsame(true,s.hasBoat);
	}
	@Test
	public void falseWhenHasNoBoat(){
		Boat b=new Boat(3);
                Square s=new Square(b);
                assertsame(false,s.hasBoat);
	}
	@Test
	public void respondMissWhenShootIsMissed(){
		Boat b=new Boat(3);
                Square s=new Square();
		Response r1=s.shoot;
		Response r2=Response.miss;
		assertsame(r1,r2);
	}

	@Test
	public void respondHitWhenShootIsHit(){
		Boat b=new Boat(3);
                Square s=new Square(b);
                Response r1=s.shoot;
                Response r2=Response.hit;
                assertsame(r1,r2);
	}

	@Test 
	public void respondSunkWhenShootSunkABoat(){
		Boat b=new Boat(2);
		b.isTouched();
		b.isTouched();
                Square s=new Square(b);
                Response r1=s.shoot;
                Response r2=Response.sunk;
                assertsame(r1,r2);
	}

	@Test
	public void doNotAddToNbTouchesWhenHasBeenShot(){
		Boat b=new Boat(3);
                Square s=new Square(b);
		s.shoot();
		assertsame(1,b.getNbTouches());
		s.shoot();
		assertsame(1,b.getNbTouches());
	}
}
