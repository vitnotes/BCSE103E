import java.util.Scanner;
import java.lang.Math;
abstract class Distance{
    double distance;
    Distance(double d){
        distance = d;
    }
    public abstract void distance_calculation();
    public double disp(double distance){
        return distance;
    }
}
class Euclidean extends Shape_Custom{
    double x1, y1, x2, y2;
    Euclidean(double distance, double x1, double y1, double x2, double y1){
        super(distance);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void distance_calculation(){
        distance = Math.sqrt(Math.pow((x - x1),2) + (Math.pow((y - y1), 2)));
        System.out.println(distance);
    }
}
class Manhattan extends Shape_Custom{
    double x1, y1, x2, y2;
    Manhattan(double distance, double x1, double y1, double x2, double y1){
        super(distance);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public void distance_calculation(){
        distance = Math.abs(x-x1) + Math.abs(y-y1);;
        System.out.println(distance);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		double x1, y1, x2, y2;
		x1 = obj.nextDouble();
		y1 = obj.nextDouble();
		x2 = obj.nextDouble();
		y2 = obj.nextDouble();
		Euclidean o1 = new Euclidean(0, x1, y1, x2, y2);
		o1.distance_calculation();
		Manhattan o2 = new Manhattan(0, x1, y1, x2, y2);
		o2.distance_calculation();
	}
}