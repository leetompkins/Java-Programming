import java.util.*;
public class Exercise24_1 {

	public static void main(String[] args) {
		/* A Program that creates to lists with set initial values 
		 * Then adds list2 to list1, displays result, recretes original lists
		 * displays result, Chapter 24 Exercise 24.1
		 */

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		list1.add("Tom");
		list1.add("George");
		list1.add("Peter");
		list1.add("Jean");
		list1.add("Jane");
		
		list2.add("Tom");
		list2.add("George");
		list2.add("Micheal");
		list2.add("Michael");
		list2.add("Daniel");
		
		System.out.println("List one contains " + list1 + " List two contains " + list2);
		
		list1.addAll(list2);
		
		System.out.println("List one contains " + list1 + " List two contains " + list2 );
		
		list1.removeAll(list2);
		list1.add(0, "Tom");
		list1.add(1, "George");
		
		list1.removeAll(list2);
		
		System.out.println("List one contains " + list1 + " List two contains " + list2);
		
		list1.add(0, "Tom");
		list1.add(1, "George");
		
		list1.retainAll(list2);
		
		System.out.println("List one contains " + list1 + " List two contains " + list2);
		
		
		
	}

}
