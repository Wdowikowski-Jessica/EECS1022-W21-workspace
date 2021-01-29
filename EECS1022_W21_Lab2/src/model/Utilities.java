package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 *  
	 * Refer to you lab instructions for what the method should return.
	 * 
	 * See this short tutorial video illustrating how to compute tax:
	 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double firstTax1 = (income * 0.10);
		double secondTax1 = (income - 8350) * 0.15;
		double thirdTax1 = (income - 33950) * 0.25;
		double taxSum = 0.0;
		double secondTax2 = (income - 16700) * 0.15;
		double thirdTax2 = (income - 67900) * 0.25;
		if (status == 1) {
			if (0 <= income && income <= 8350) {
				String ft = String.format("%.2f", firstTax1);
				result += "Single Filing: $" + ft + " (Part I: $" + ft + ")";
			} else if (income > 8350 && income <= 33950) {
				taxSum = 835.00 + secondTax1;
				String ts = String.format("%.2f", taxSum);
				String st = String.format("%.2f", secondTax1);
				result += "Single Filing: $" + ts + " (Part I: $835.00, Part II: $" + st + ")";
			} else if (income > 33950) {
				taxSum += 4675.00 + thirdTax1;
				String ts = String.format("%.2f", taxSum);
				String tt = String.format("%.2f", thirdTax1);
				result += "Single Filing: $" + ts + " (Part I: $835.00, Part II: $3840.00, Part III: $" + tt + ")";
			}
		}
		else if (status == 2) {
			if (0 <= income && income <= 16700) {
				String ft = String.format("%.2f", firstTax1);
				result += "Married Filing: $" + ft + " (Part I: $" + ft + ")";
			} else if (income > 16700 && income <= 67900) {
				taxSum = 1670.00 + secondTax2;
				String ts = String.format("%.2f", taxSum);
				String st = String.format("%.2f", secondTax2);
				result += "Married Filing: $" + ts + " (Part I: $1670.00, Part II: $" + st + ")";
			} else if (income > 67900) {
				taxSum += 9350.00 + thirdTax2;
				String ts = String.format("%.2f", taxSum);
				String tt = String.format("%.2f", thirdTax2);
				result += "Married Filing: $" + ts + " (Part I: $1670.00, Part II: $7680.00, Part III: $" + tt + ")";
			}
		}
		else {
			result += "Illegal Status: " + status;
		}

		/* Your implementation ends here. */

		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 *     
	 * Hints:
	 *  - Compare character values using the relational operator ==.
	 *  - Study the 9 test cases in TestUtilites: they are arranged in a systematic (yet not exhaustive) way.
	 *    Q. In order to exhaustively test this game, considering how two players may play in two rounds,
	 *    	 how many tests do we need? (Optionally, you may write extra test yourself as an exercise.)
	 *    
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		String winner = "";
		String round1 = "";
		String round2 = "";
		int p1count = 0;
		int p2count = 0;
		
		if (p1r1 == 'R') {
			if (p2r1 == 'P') {
			round1 += "[Round 1: " + p2 + " wins (P vs. R) ; ";
			p2count ++;
		} else if (p2r1 == 'S') {
			round1 += "[Round 1: " + p1 + " wins (R vs. S) ; ";
			p1count ++;
		} else {
			round1 += "[Round 1: Tie (R vs. R) ; ";
		}
		}
		else if (p1r1 == 'S') {
			if (p2r1 == 'R') {
			round1 += "[Round 1: " + p2 + " wins (R vs. S) ; ";
			p2count ++;
			} else if (p2r1 == 'P') {
				round1 += "[Round 1: " + p1 + " wins (S vs. P) ; ";
				p1count ++;
			} else {
				round1 += "[Round 1: Tie (S vs. S) ; ";
		}
		}
		else if (p1r1 == 'P') {
			if (p2r1 == 'S') {
			round1 += "[Round 1: " + p2 + " wins (S vs. P) ; ";
			p2count ++;
			} else if (p2r1 == 'R') {
				round1 += "[Round 1: " + p1 + " wins (P vs. R) ; ";
				p1count ++;
			} else {
				round1 += "[Round 1: Tie (P vs. P) ; ";
		}
		}
		if (p1r2 == 'R') {
			if (p2r2 == 'P') {
			round1 += "Round 2: " + p2 + " wins (P vs. R)]";
			p2count ++;
		} else if (p2r2 == 'S') {
			round1 += "Round 2: " + p1 + " wins (R vs. S)]";
			p1count ++;
		} else {
			round1 += "Round 2: Tie (R vs. R)]";
		}
		}
		else if (p1r2 == 'S') {
			if (p2r2 == 'R') {
			round1 += "Round 2: " + p2 + " wins (R vs. S)]";
			p2count ++;
			} else if (p2r2 == 'P') {
				round1 += "Round 2: " + p1 + " wins (S vs. P)]";
				p1count ++;
			} else {
				round1 += "Round 2: Tie (S vs. S)]";
		}
		}
		else if (p1r2 == 'P') {
			if (p2r2 == 'S') {
			round1 += "Round 2: " + p2 + " wins (S vs. P)]";
			p2count ++;
			} else if (p2r2 == 'R') {
				round1 += "Round 2: " + p1 + " wins (P vs. R)]";
				p1count ++;
			} else {
				round1 += "Round 2: Tie (P vs. P)]";
		}
		}
		if (p1count >= 1 && p2count < 1) {
			winner += p1 + " wins! ";
		} else if (p1count < 1 && p2count >= 1) {
			winner += p2 + " wins! ";
		} else {
			winner += "Tie! ";
		}
		result += "Game over: " + winner + round1 + round2;
		/* Your implementation ends here. */

		return result;
	}
}
