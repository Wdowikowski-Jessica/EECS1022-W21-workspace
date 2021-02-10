package model;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getMultiplesOf3(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int number = 0;
		for (int a = 0; a<numbers.length; a++) {
			if (numbers[a]%3 == 0) {
				number++;
			}
		}
		int[] answer = new int[number];
		int b = 0;
		for (int a = 0; a<numbers.length; a++) {
			if (numbers[a]%3 == 0) {
				answer[b] = numbers[a];
				b++;
			}
		}
		result = answer;
		/* Your implementation ends here. */
		
		return result;
	}	
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int number = 0;
		for (int a = 0; a<numbers.length; a++) {
			if (numbers[a] != n) {
				number++;
			}
		}
		int[] answer = new int[number];
		int b = 0;
		for (int a = 0; a<numbers.length; a++) {
			if (numbers[a] != n) {
				answer[b] = numbers[a];
				b++;
			}
		}
		result = answer;
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		String number = "";
		String[] answer = new String[numbers.length];
		for (int a = 0; a<numbers.length; a++) {
			number += numbers[a];
			String box = "["+number+"]";
			answer[a] = box;
			if (a<=numbers.length) {
				number += ", ";
			}
		}
		result = answer;
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int number = 0;
		int[] answer = new int[numbers.length];
		for (int a = 0; a<numbers.length; a++) {
			if (numbers[a]%3 == 0) {
				answer[number] = numbers[a];
				number++;
			}
		}
		for (int a = 0; a<numbers.length; a++) {
			if (numbers[a]%3 == 1) {
				answer[number] = numbers[a];
				number++;
			}
		}
		for (int a = 0; a<numbers.length; a++) {
			if (numbers[a]%3 == 2) {
				answer[number] = numbers[a];
				number++;
			}
		}
		result = answer;
		
		/* Your implementation ends here. */
		
		return result;
	}
}
