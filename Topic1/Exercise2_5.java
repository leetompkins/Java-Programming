import java.util.*;
public class Exercise2_5 {

	public static void main(String[] args) {
		/* Calculate tips, requests amount and gratuity rate outputs
		 *  gratuity and total amount, Chapter 2 Exercise 2.5
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in the total before gratuity");
		double price = input.nextDouble();
		System.out.print("Please enter the desired gratuity rate, for example, for 15% enter, 15");
		double gratuityRate = input.nextDouble();
		double gratuityTotal = price * (gratuityRate / 100);
		double totalPrice = price + gratuityTotal;
		System.out.println("With a gratuity rate of " + gratuityRate + "% the total tip comes to $" + gratuityTotal + " for a grand total of $" + totalPrice);
		
	}

}
