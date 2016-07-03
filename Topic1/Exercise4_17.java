import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercise4_17 {

	public static void main(String[] args) {
		/* Promts user to enter a year and first three letters of a month 
		 * then display the number of days in the month 
		 */
		
		List<Integer> leapYear = new ArrayList<Integer>();
		int MAX = 9999;
		for (int i = 0; leapYear.size() <= MAX; i = i + 4){
			leapYear.add(i);
		}
		
		List<String> month30 = new ArrayList<String>();
		month30.add("Apr");
		month30.add("Jun");
		month30.add("Sep");
		month30.add("Nov");
		
		List<String> month31 = new ArrayList<String>();
		month31.add("Jan");
		month31.add("Mar");
		month31.add("May");
		month31.add("Jul");
		month31.add("Aug");
		month31.add("Oct");
		month31.add("Dec");
		
		String Feb = "Feb";
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is the year and month you want to return # of days for? e.g. 2001 Jan");
		int year = input.nextInt();
		String month = input.next(); 
		String capMonth = month.substring(0, 1).toUpperCase() + month.substring(1);
		if (month31.contains(capMonth)) {
			System.out.println(capMonth + year + " Has 31 days");
		}
		if (capMonth.equals(Feb) && leapYear.contains(year)) {
			System.out.println(capMonth + year + " Has 29 days");
		}
		if (capMonth.equals(Feb) && !leapYear.contains(year)) {
			System.out.println(capMonth + year + " Has 28 days");
		}
		 
		if (month30.contains(capMonth)) {
			System.out.println(capMonth + year + " Has 30 days");
		}
	
	}

}