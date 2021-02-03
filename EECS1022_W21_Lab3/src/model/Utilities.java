package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `lower` is the lower bound
	 *  - `upper` is the upper bound
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.   
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getNumbers(int lower, int upper) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		 int difference = upper - lower;
		if (lower <= upper && lower >= 0 && upper >= 0) {
					if (difference == 0) {
						difference ++;
						result += difference + " number between " + lower + " and " + upper + ": <";
					} else {
						difference ++;
						result += difference + " numbers between " + lower + " and " + upper + ": <";
					} for (int i = lower; i <= upper; i++) {
						if (i%3 == 0) {
							result += "(" + i + ")";
						} else if ((i-1)%3 == 0) {
							result += "[" + i + "]";
						} else {
							result += "{" + i + "}";
						} if (i < upper) {
							result += ", ";
				} 
			} result += ">";
		} else if (lower > upper && lower >= 0 && upper >= 0) {
			result += "Error: lower bound " + lower + " is not less than or equal to upper bound " + upper;					
		} else {
			result += "Error: both bounds must be non-negative";
		}
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft`, `d`, `n` are the first term, common difference, and size of an arithmetic sequence.
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only. 
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		result += "{";
		String numberOfTerms = "";
		int sumOfTerms = 0;
		double avgOfTerms = 0.0;
		for (int i = 0; i < n; i++) {
			numberOfTerms += ft + (i*d);
			sumOfTerms += ft + (i*d);
			avgOfTerms = (double) sumOfTerms/(i+1);
			result += "[sum of <" + numberOfTerms + ">: " + sumOfTerms + " ; avg of <" + numberOfTerms + ">: " + String.format("%.2f", avgOfTerms) + "]";
			if ((i+1) < n) {
				numberOfTerms += ", ";
				result += ", ";
			}
		} result += "}";
		
		
		/* Your implementation ends here. */
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence.
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.  
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		result += "<";
		int termOne = 0;
		int termTwo = 0;
		if (n1==n2) {
			for (int a=0; a<n1; a++) {
				termOne = (ft1 + (a*d1));
				termTwo = (ft2 + (a*d2));
				result += "(" + termOne + "), [" + termTwo + "]";
				if ((a+1)<n2) {
					result += ", ";
				}
			}
		} else if (n1<n2 && n1 != 0) {
			int b = 0;
			for ( ; b<n1; b++) {
				termOne = ft1 + (b*d1);
				termTwo = ft2 + (b*d2);
				result += "(" + termOne + "), [" + termTwo + "], ";
			} for ( ; b<n2; b++) {
				termTwo = ft2 + (b*d2);
				result += "[" + termTwo + "]";
				if ((b+1)<n2) {
					result += ", ";
				}
			}
		} else if (n2<n1 && n2 != 0) {
			int c = 0;
			for ( ; c<n2; c++) {
				termOne = ft1 + (c*d1);
				termTwo = ft2 + (c*d2);
				result += "(" + termOne + "), [" + termTwo + "], ";
			} for ( ; c<n1; c++) {
				termOne = ft1 + (c*d1);
				result += "(" + termOne + ")";
				if ((c+1)<n1) {
					result += ", ";
				}
			}
		} else if (n1 == 0 && n2 > n1) {
			for (int d = 0; d < n2; d++) {
				termTwo = ft2 + (d*d2);
				result += "[" + termTwo + "]";
				if ((d+1)<n2) {
					result += ", ";
				}
			}
		} else if (n2 == 0 && n1 > n2) {
			for (int e = 0; e < n1; e++) {
				termOne = ft1 + (e*d1);
				result += "(" + termOne + ")";
				if ((e+1) < n1) {
					result += ", ";
				}
			}
		} result += ">";
		
		/* Your implementation ends here. */
		return result;
	}	
}
