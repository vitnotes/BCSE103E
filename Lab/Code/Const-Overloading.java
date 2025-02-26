import java.util.*;
class Familymember{
	String fname;
	static String lname;
	String gen;
	int age;
	Familymember(String a ,String b, int c){
		fname = a;
		gen = b;
		age = c;
	}
	Familymember(String d ,String e){
		fname = d;
		gen = e;
		age = 30;
	}
	Familymember(String f){
		fname = f;
		gen = "female";
		age = 23;
	}
	Familymember(){
		fname = "Harry";
		gen = "male";
		age = 17;
	}
	public static void m() {
		lname = "potter";
	}
	void disp(){
		System.out.println(fname+" "+lname+"\n"+gen+"\n"+age);
		}
}
public class Main {
	public static void main(String argv[]) {
		Scanner s = new Scanner(System.in);
		String a1,b1,d1,e1,f1;
		int c1;
		a1 = s.nextLine();
		b1 = s.nextLine();
		c1 = s.nextLine();
		e1 = s.nextLine();
		f1 = s.nextLine();
		c1 = s.nextInt();
		Familymember fam1 = new Familymember(a1,b1,c1);
		Familymember fam2 = new Familymember(d1,e1);
		Familymember fam3 = new Familymember(f1);
		Familymember fam4 = new Familymember();
		Familymember.m();
		fam1.disp();
		System.out.println();
		fam2.disp();
		System.out.println();
		fam3.disp();
		System.out.println();
		fam4.disp();
	}
}