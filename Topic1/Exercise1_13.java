
public class Exercise1_13 {

	public static void main(String[] args) {
		// Algebra, use Cramer's rule, Chapter 1 Exercise 1.13
		double e = 44.5;
		double d = 0.55;
		double b = 50.2;
		double f = 5.9;
		double a = 3.4;
		double c = 2.1;
		
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
