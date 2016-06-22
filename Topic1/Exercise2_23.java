import java.util.*;
public class Exercise2_23 {

	public static void main(String[] args) {
		/* Calculate cost for driving based on user input distance, fuel efficiency, and
		 * fuel cost per gallon, Chapter 2 Exercise 2.23
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter in the total distance in miles for the trip");
		double distance = input.nextDouble();
		System.out.print("Please enter in the fuel efficiency of the vehicle in miles per gallon");
		double fuelEfficiency = input.nextDouble();
		System.out.print("Please enter in the cost per gallon of fuel");
		double fuelCost = input.nextDouble();
		double totalCost = distance / fuelEfficiency * fuelCost;
		System.out.println("The total cost for the trip is $" + totalCost);

	}

}
