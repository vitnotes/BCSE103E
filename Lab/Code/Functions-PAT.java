import java.util.*;
public class Main
{
    public static void generate(int pin){
        int[] arr = new int[4];
        int count = 0;
        while(pin > 0){
            int rem = pin % 10;
            rem += 7;
            rem %= 10;
            if (count == 0)
                arr[1] = rem;
            else if (count == 1)
                arr[0] = rem;
            else if (count == 2)
                arr[3] = rem;
            else
                arr[2] = rem;
            pin /= 10;
            rem = 0;
            count++;
	    }
	    for (int var = 3; var >= 0; var--){
	        System.out.print(arr[var]);
	    }
    }
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int pin = obj.nextInt();
		generate(pin);
}
}