package model;
public class Utilities
{
	/* 
	 * 	Requirements:
	 * 	- It is strictly forbidden for you to use: 
	 * 		+ Any Java library method (e.g., Arrays.sort)
	 * 		  (That is, there must not be an import statement in the beginning of this class.)
	 * 		+ arrays
	 * 	- You will receive an immediate zero for this task if the requirement is violated. 
	 * 
	 * Only write lines of code within the methods given to you.
	 * Do not add any new helper methods. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests 
	 * 	  (therefore it is important that you test your own methods
	 *     by either the console application class App or your own JUnit tests) 
	 */

	/*	Task 1.
	 * 	
	 * 	Input Parameters:
	 *	- `weightUnit`	: either 'p' (for pound) or 'k' (for kilogram)
	 *	- `w`			: the weight value
	 *	- `heightUnit`	: either 'f' (for foot) or 'i' (for inch)
	 *	- `h`			: the height value
	 *
	 *	Error conditions (in order of priority):
	 *	1. When the `weightUnit` is neither 'p' nor 'k' (case sensitive).
	 *	2. When the `heightUnit` is neither 'f' nor 'i' (case sensitive).
	 *	3. When not both weight value and height value are positive.
	 *	If multiple error conditions hold, return a message related to the error with the highest priority.
	 *	e.g., invoking getBMIReport('q', -154.3, 'I', -66.92) has all inputs invalid,
	 *			but only an error message about weight unit is returned.
	 *
	 *  What to return?
	 *  - Return an error message if there is any error.
	 *  - Otherwise, calculate the Body Mass Index (BMI) by: weight (in kilogram) divided by the square of height (in meters).
	 *  	+ Use the following conversion rates (when needed):
	 *  		1 inch is 0.0254 meter 			(use it when `heightUnit` is 'i')
	 *  		1 foot is 0.3048 meter
	 *  		1 pound is 0.453592 kilogram
	 *  	+ The calculation result must be formatted with 2 digits after the decimal:
	 *  		Use String.format("%.2f", someNumber)
	 *  	+ Also, include an interpretation message (case sensitive) according to the following scheme:
	 *  		BMI < 18.5 			means "Underweight"
	 * 			18.5 <= BMI < 25.0 	means "Normal"
	 * 			25.0 <= BMI < 30.0 	means "Overweight"
	 * 			30.0 <= BMI 		means "Obese"
	 * 
	 * See the JUnit tests related to this method for the precise format of the string return value.
	 */
	public static String getBMIReport(char weightUnit, double w, char heightUnit, double h) {
		String result = "";
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		double weight = 0.0;
		double height = 0.0;
		if (weightUnit == 'k') {
			weight += w;
		} else if (weightUnit == 'p') {
			weight += w*2.2;
		} else {
			result += "Error: " + weightUnit + " is not a valid weight unit";
		}
		if (heightUnit == 'f') {
				height += h*0.3048;
			} else if (heightUnit == 'i') {
				height += h*0.0254;
			} else {
				result += "Error: " + heightUnit + " is not a valid height unit";
			}
		if (w < 0 && h < 0) {
			result += "Error: both weight and height must be positive";
		} else if (w <0) {
			result += "Error: both weight and height must be positive";
		} else if (h<0) {
			result += "Error: both weight and height must be positive";
		}
		double bmi = weight/(height*height);
		String bMI = String.format("%.2f", bmi);
		if (bmi < 18.5) {
			result += "BMI is: " + bMI + " (Underweight)";
		} else if (18.5 <= bmi && bmi < 25.0) {
			result += "BMI is: " + bMI + " (Normal)";
		} else if (25.0 <= bmi && bmi < 30.0) {
			result += "BMI is: " + bMI + " (Overweight)";
		} else if (30.0 <= bmi) {
			result += "BMI is: " + bMI + " (Obese)";
		}
		// Do not modify this return statement. 
		return result;
	}
	
	
	/*
	 * Task 2.
	 * 
	 * Input Parameters: 
	 * - `coffeeType` 	: either 'L' (for light type), 'R' (for regular type) or 'D' (for dark type)
	 * - `cupSize`		: either 'S' (for small size), 'M' (for medium size) or 'L' (for large size)
	 * - `numberofCup`	: integer represent number of cups ordered
	 * 
	 * Assumptions:
	 * 	- the numberofCups is positive value greater than zero.
	 *	- `coffeeType` and `cupSize` characters are valid (no error checking is needed).
	 *
	 * What to return? - First you need to determine the preparation time  
	 * of single cup of coffee in term of minutes and seconds  according to the following facts
	 * If coffee type is light coffee then the initial preparation time of single cup of any size is 25 seconds.
	 * If coffee type is regular coffee then the initial preparation time of single cup of any size is 45 seconds.
	 * If coffee type is dark coffee then the initial preparation time of single cup of any size is 65 seconds.
	 * 
	 * Now, consider the size 
	 * if the cup size is small then add 15 seconds. 
	 * if the cup size is medium then add 35 seconds.
	 * if the cup size is large then add 45 seconds.
	 * 
	 * Do not forget to consider the number of cup to determine the final preparation time of coffee order
	 * 
	 * The output string should include  message with case sensitive. For example:
	 * 
	 * "You ordered 5 cups of type light and size small, then your time is 3 minutes 20 seconds" 
	 * "You ordered 1 cup of type light and size small, then your time is 0 minutes 40 seconds" 
	 * "You ordered 7 cups of type dark and size large, then your time is 12 minutes 50 seconds" 
	 * 
	 * Note: we use cup  when the order is for single cup and 
	 *  we use cups  when the order is for more than one cup
	 * 
	 *  
	 * See the JUnit tests related to this method for the precise format of the
	 * string return value.
	 */ 
	public static String getCoffeeTime(char coffeeType, char cupSize, int numberofCup) {
		String result2 = "";
		/*
		 * Your task is to implement this method, so that running TestUtilities.java
		 * will pass all JUnit tests.
		 * 
		 * Recall from Week 1's tutorial videos: 1. No System.out.println statements
		 * should appear here. Instead, an explicit, final `return` statement is placed
		 * for you. 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 * Instead, refer to the input parameters of this method. 3. Do not re-assign
		 * any of the parameter/input variables.
		 */
		int time = 0;
		String coffee1 = "";
		String coffee2 = "";
		if (coffeeType == 'L' || coffeeType == 'l') {
			coffee1 += "light";
			time += 25*numberofCup;
		} else if (coffeeType == 'R' || coffeeType == 'r') {
			coffee1 += "regular";
			time += 45*numberofCup;
		} else if (coffeeType == 'D' || coffeeType == 'd') {
			coffee1 += "dark";
			time += 65*numberofCup;
		}
		if (cupSize == 'S' || cupSize == 's') {
			coffee2 += "small";
			time += 15*numberofCup;
		} else if (cupSize == 'M' || cupSize == 'm') {
			coffee2 += "medium";
			time += 35*numberofCup;
		} else if (cupSize == 'L' || cupSize == 'l') {
			coffee2 += "large";
			time += 45*numberofCup;
		}
		int timeMin = time/60;
		int timeSecs = time%60;
		result2 += "You ordered " + numberofCup + " cups of type " + coffee1 + " and size " + coffee2 + ", then your time is " + timeMin + " minutes " + timeSecs + " seconds";
		// Do not modify this return statement.
		return result2;
	}
	
	
	/*
	 * Task 3.
	 * 
	 * Input Parameters: 
	 * - `carSpeed` 	: integer value represents car speed in kilometer per hour at time of ticket
	 * - `roadSpeed`	: integer value represents the road speed limit in kilometer per hour regulated by the City
	 * - `whenItHappen`	: either 'M' (for Morning day time), 'A' (for Afternoon day time) or 'E' (for Evening day time)
	 * 
	 * Assumptions:
	 * 	- `carSpeed` is greater than `roadSpeed` always
	 *	- `whenItHappen` character is valid (no error checking is needed).
	 *
	 * What to return? - First you need to determine speed ticket value in dollars according to the following facts
	 * If difference between car speed and road speed limit is less than 20 kilometer/hour 
	 * then the initial ticket value is 80 dollars.
	 * 
	 * If difference between car speed and road speed limit is between 20 and 40 kilometer/hour inclusive 
	 * then the initial ticket value is 250 dollars.
	 * 
	 * If difference between car speed and road speed limit is more than 40 kilometer/hour 
	 * then the initial ticket value is 800 dollars.
	 * 
	 * Now, consider the when ticket happen. 
	 * if speeding ticket happened during morning day time then add 150 dollars to the initial speeding ticket value
	 * if speeding ticket happened during afternoon day time then add 100 dollars to the initial speeding ticket value
	 * if speeding ticket happened during evening day time then add 540 dollars to the initial speeding ticket value
	 * 
	 * The output string should include  message with case sensitive. For example:
	 * 
	 * "In the morning, your speed was 25 over the limit then your ticket value is 400$" 
	 * 
	 * "In the afternoon, your speed was 10 over the limit then your ticket value is 180$"
	 *  
	 * See the JUnit tests related to this method for the precise format of the
	 * string return value.
	 */

	public static String getTicketValue(int carSpeed, int roadSpeed, char whenItHappen) {
		String result3 = "";

		/*
		 * Your task is to implement this method, so that running TestUtilities.java
		 * will pass all JUnit tests.
		 * 
		 * Recall from Week 1's tutorial videos: 1. No System.out.println statements
		 * should appear here. Instead, an explicit, final `return` statement is placed
		 * for you. 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 * Instead, refer to the input parameters of this method. 3. Do not re-assign
		 * any of the parameter/input variables.
		 */
		int ticket = 0;
		int difference = carSpeed - roadSpeed;
		String time = "";
		if (difference < 20) {
			ticket += 80;
		} else if (difference >= 20 && difference < 40) {
			ticket += 250;
		} else if (difference >= 40) {
			ticket += 800;
		}
		if (whenItHappen == 'M') {
			ticket += 150;
			time += "morning";
		} else if (whenItHappen == 'A') {
			ticket += 100;
			time += "afternoon";
		} else if (whenItHappen == 'E') {
			ticket += 540;
			time += "evening";
		}
		result3 += "In the " + time + ", your speed was " + difference + " over the limit then your ticket value is " + ticket + "$";
		

		// Do not modify this return statement.
		return result3;
	}

}

