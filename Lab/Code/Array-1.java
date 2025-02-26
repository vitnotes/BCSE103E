public class Main
{
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
		int i;
		System.out.println("Odd Index:");
		for(i = 1; i < 23; i += 2){
		    System.out.print(a[i] + " ");
		}
		System.out.println("\nEven Index in Reverse:");
		for(i = 22; i > -1; i -= 2){
		    System.out.print(a[i] + " ");
	}
}
}