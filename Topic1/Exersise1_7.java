import java.math.BigDecimal;

public class Exersise1_7 {

	public static void main(String[] args) {
		// Approximate the value pi Chapter 1 exercise 1.7
		BigDecimal approxPi = new BigDecimal(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) ) );
		System.out.println(approxPi);
	}

}
