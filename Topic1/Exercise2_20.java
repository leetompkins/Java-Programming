import java.util.*;
public class Exercise2_20 {

	public static void main(String[] args) {
		/* Calculate the interest for the next month from a user 
		/input balance and interest rate, Chapter 2 Exercise 2.20
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in the account balance");
		double balance = input.nextDouble();
		System.out.print("Please enter in the annual interest rate, for example, 7.25% would be input as 7.25");
		double interestRate = input.nextDouble(); 
		double nextMonthInterest = balance * (interestRate / 1200);
		System.out.println("The interest for next month is $" + nextMonthInterest);
		
	}

}
