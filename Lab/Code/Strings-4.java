// 
public class Main
{
	public static void main(String[] args) {
		String str = "Vellore Institute of Technology";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        char[] ch = new char[10];
        str.getChars(6, 16, ch, 0);
        System.out.println(ch);
        byte[] b = str.getBytes();
        for (byte c: b){
            System.out.print(c+", ");
        }
        System.out.println(str.toCharArray());
        System.out.println(ch.equals(str));
        System.out.println("Hello, ".concat(str));
        
	}
}


