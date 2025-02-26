import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int r = obj.nextInt();
		int n = obj.nextInt();
		String[][] arr = new String[r][n];
		for (int j = 0; j<r; j++){
		for (int i = 0; i< n; i++){
		    arr[i] = obj.nextLine();
		    }
	    }
    }
}