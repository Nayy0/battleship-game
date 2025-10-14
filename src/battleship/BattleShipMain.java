package battleship;

public class BattleShipMain{
	
	public static void main(String[] args)throws InvalidPositionException,java.io.IOException{
		Board b=new Board(8,12);
		Boat b1=new Boat(3);
		Boat b2=new Boat(2);
		b.placeBoat(new Position(2,3),Direction.east,b2);
		b.placeBoat(new Position(7,11),Direction.north,b1);
		Position p1=new Position(2,3);
		Position p2=new Position(7,11);
		System.out.println("Position du bateau 1 : "+p1);
		System.out.println("Position du bateau 2 : "+p2);
		Game g=new Game(b);
		g.play();
	}
}



