import java.util.*;
import java.lang.Math.*;
public class Exercise4_2 {

	public static void main(String[] args) {
		/* Calculate the great circle distance between two points (lat and longs
		 * convert degrees to into radians, Chapter 4 Exercise 4.2) 
		 */
		double earthRadius = 6371.01;
		Scanner input = new Scanner(System.in);
		System.out.print("What is the first lat & long coordinate? Seperate coords with a space");
		double lat1 = input.nextDouble();
		double lat2 = input.nextDouble();
		System.out.print("What is the Second lat & long coordinate? Seperate coords with a space");
		double lat3 = input.nextDouble();
		double lat4 = input.nextDouble();
		
		lat1 = Math.toRadians(lat1); // Converting degree lat and longs to radians
		lat2 = Math.toRadians(lat2);
		lat3 = Math.toRadians(lat3);
		lat4 = Math.toRadians(lat4);
		
		double distance = earthRadius * (Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lat3 - lat4)));
		
		System.out.println("The distance between the two sets of coordinates is " + distance + "km");
			
		
		
		
		
	}

}
