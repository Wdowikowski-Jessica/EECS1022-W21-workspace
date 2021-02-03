package console_apps;

import java.util.Scanner;

import model.Utilities;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * Your submission will only be graded against JUnit tests.
		 * 
		 * If you wish to test your utility methods quickly,
		 * you may use this console application class by calling them.
		 * 
		 * However, you must make sure that you do not introduce 
		 * any compilation errors here. 
		 * 
		 * Reminders:
		 *  - Write `System.out.println` to prompt user inputs and output result to the console. 
		 * 	- Write `input.nextInt()` to read an integer from user.
		 *  - Write `input.nextDouble()` to read a double from user.   
		 */
		System.out.println("Weight: Enter 'p' (for pounds) or 'k' (for kilograms): ");
		char weightUnit = input.next().charAt(0);
		
		System.out.println("Enter your weight in terms of the value above: ");
		double w = input.nextDouble();
		
		System.out.println("Weight: Enter 'f' (for foot) or 'i' (for inch): ");
		char heightUnit = input.next().charAt(0);
		
		System.out.println("Enter your height in terms of the value above: ");
		double h = input.nextDouble();
		
		/* Stage 2: Invoke the relevant utility method with the user input(s) */
		String result = Utilities.getBMIReport(weightUnit, w, heightUnit, h);
		System.out.println(result);
		input.close();
		
		System.out.println("Enter coffee type: either 'L' (for light type), 'R' (for regular type) or 'D' (for dark type)");
		char coffeeType = input.next().charAt(0);
		
		System.out.println("Enter coffee size: either 'S' (for small size), 'M' (for medium size) or 'L' (for large size)");
		char cupSize = input.next().charAt(0);
		
		System.out.println("Enter number of cups: ");
		int numberofCup = input.nextInt();
		
		String result2 = Utilities.getCoffeeTime(coffeeType, cupSize, numberofCup);
		System.out.println(result2);
		input.close();

		System.out.println("Enter car speed: ");
		int carSpeed = input.nextInt();
		
		System.out.println("Enter road speed: ");
		int roadSpeed = input.nextInt();
		
		System.out.println("Enter time of day: ");
		char whenItHappen = input.next().charAt(0);
		
		String result3 = Utilities.getTicketValue(carSpeed, roadSpeed, whenItHappen);
		System.out.println(result3);
		input.close();
		/* Stage 3: Output the returned value back to the user over the console. */
	
	}

}
