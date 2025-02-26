import java.lang.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		Float f1 = new Float(2.71);
		Float f2 = new Float(3.14);
		Character c1 = new Character('a');
		Character c2 = new Character('b');
		if (i1.equals(i2) == true){
		    System.out.println("They are equal.");
		}
		else{
		    System.out.println("They aren't equal.");
		}
		int f = f1.compareTo(f2);
		int c = c1.compareTo(c2);
		System.out.println("When we use compareTo method with 2 float, we get "+f);
		System.out.println("When we use compareTo method with 2 float, we get "+c);
    }
}


