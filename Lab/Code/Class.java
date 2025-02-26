import java.util.*;
class Student{
    String name, dep;
	int rno, sem, m1, m2, m3;
	Student(int rno, String name, String dep, int sem, int m1, int m2, int m3){
	    this.rno = rno;
		this.name = name;
		this.dep = dep;
		this.sem = sem;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
    void calc(){
        System.out.println(m1 + m2 + m3);
        float avg = (m1 + m2 + m3)/3;
        System.out.println(avg);
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String name, dep;
		int rno, sem, m1, m2, m3;
		rno = obj.nextInt();
		name = obj.next();
		dep = obj.next();
		sem = obj.nextInt();
		m1 = obj.nextInt();
		m2 = obj.nextInt();
		m3 = obj.nextInt();
		Student o = new Student(rno, name, dep, sem, m1, m2, m3);
		o.calc();
	}
}