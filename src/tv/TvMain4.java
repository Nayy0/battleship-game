package tv;
import io.Input;

public class TvMain4{
	public static void main(String[] args){
		System.out.print(" give a brand : ?");
		String userString=Input.readString();
		Tv t1=new Tv(userString);
		t1.on();
		System.out.println(t1);
		boolean ok = false; 
      		while (!ok) {
         		try {
            			System.out.print(" give an int : ? ");
            			int userInt = Input.readInt();
            			ok = true;
				t1.changeChannel(userInt);
				System.out.println(t1);
         		} catch (java.io.IOException e) {  
            			ok = false;
		            	System.out.println("wrong input : please give an int");
			}
		}
	}
}


