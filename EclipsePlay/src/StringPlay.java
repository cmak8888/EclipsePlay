import java.awt.Point;

public class StringPlay {
	
	public static void main(String[] args) {
		String play = "C++ is cool";
		String play2 = "I love Java";
		String newString = play2.substring(7, 11) + play.substring(3, 11);
		System.out.println(newString);
		Point p = new Point(1,2);
		Point q = new Point(1,2);
		System.out.println(p == q);
		System.out.println(p.equals(q));
		String str = "one";
		String str2 = "OnE";
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str + "is " + str.equals(str2) + " with " + str2 + " but, " + str + " is " + str.equalsIgnoreCase(str2));
			
	}
}
