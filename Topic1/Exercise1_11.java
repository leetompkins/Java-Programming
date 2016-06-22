
public class Exercise1_11 {

	public static void main(String[] args) {
		// Population projection Chapter 1 Exercise 1.11
		
		double curPop = 312032486;
		double immigrant = 31536000 / 45.0;
		double death = 31536000 / 13.0;
		double birth = 31536000 / 7.0; 
		double yearOne = curPop + immigrant + birth - death;
		double yearTwo = curPop + (2 * immigrant) + (2 * birth) - (2 * death);
		double yearThree = curPop + (3 * immigrant) + (3 * birth) - (3 * death);
		double yearFour = curPop + (4 * immigrant) + (4 * birth) - (4 * death);
		double yearFive = curPop + (5 * immigrant) + (5 * birth) - (5 * death);
		
		System.out.println("The year one population is " + yearOne);
		System.out.println("The year two population is " + yearTwo);
		System.out.println("The year three population is " + yearThree);
		System.out.println("The year four population is " + yearFour);
		System.out.println("The year five population is " + yearFive);
		
		
	}

}
