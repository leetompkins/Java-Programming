import java.util.*; 
public class Exercise2_4 {

	public static void main(String[] args) {
		// Prompts user for pounds, converts to kilograms, Chapter 2 Exercise 2.4
		
		final double poundsToKilograms = 0.454;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of pounds");
		double userPounds = input.nextDouble();
		double kilograms = userPounds * poundsToKilograms;
		System.out.println(userPounds + " pounds is equal to " + kilograms + " kilograms");
		
		
		
				
	}

}
