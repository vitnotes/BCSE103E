import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
	    int l = obj.nextInt();
	    int[] arr = new int[4];
	    int count = 0;
        while (l > 0) {
            int remainder = l % 10;
            arr[3-count] = remainder;
            l = l / 10;
            count++;
        }
        int s = arr[0];
        int la = 0;
        for (int v: arr){
            if (v >= la){
                la = v;
            }
            if (v <= s){
                s = v;
            }
        }
        System.out.println(s);
        System.out.println(la);
        System.out.print("The passcode is ");
        for(int var = 3; var >= 0; var--){
            int x = 0;
            if (arr[var] % 2 != 0){
                x = arr[var] + la;
                System.out.print(x+"@");
            }
            else if (arr[var] % 2 == 0){
                x = arr[var] + s;
                System.out.print(x+"*");
            }
        }
	}
}