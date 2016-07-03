import java.util.*;



public class Exercise24_4 {

	public static void main(String[] args) {
		/* Write a program to display the first 50 prime numbers
		 * Use a stack to store the prime numbers 
		 * Chapter 24 Exercise 24.4
		 */
		Stack<Integer> primeStack = new Stack<Integer>();
		
		
		for (int i = 2; primeStack.size() <= 50; i++){
			boolean isPrime = true;
			
			for (int a = 2; a < i; a++) {
				if (i % a == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primeStack.add(i);
			}
		}
		System.out.println(primeStack);
	}
}


