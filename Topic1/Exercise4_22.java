import java.util.*;
import java.lang.String;
public class Exercise4_22 {

	public static void main(String[] args) {
		/* A program that prompts a user to enter two strings and report 
		 * whether the second string is a substring of the first 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string");
		String string1 = input.next();
		System.out.print("Enter a second string");
		String string2 = input.next();
		
		
		if(string1.contains(string2)); {
			System.out.println("String2 is a substring");
		}
		if(!string1.contains(string2)); {
			System.out.println("String2 is not a substring");
		}
	
	}

}
