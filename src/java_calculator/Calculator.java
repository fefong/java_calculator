package java_calculator;

import java.util.Random;
import java.util.Scanner;

	/**
	 * Example Application: calculator
	 * 
	 * @author Felipe Fong
	 * 
	 */
public class Calculator {

	public static void main(String[] args) {
		System.out.println("Simple Calculator");

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the value of X: ");
		double x = in.nextDouble();

		System.out.print("Enter the value of Y: ");
		double y = in.nextDouble();

		System.out.println("-- Calculator --");
		
		// Sum
		System.out.println(String.format("%.2f + %.2f = %.2f", x, y, x + y));

		// Subtraction
		System.out.println(String.format("%.2f - %.2f = %.2f", x, y, x - y));

		// Multiplication
		System.out.println(String.format("%.2f * %.2f = %.2f", x, y, x * y));

		// Division
		System.out.println(String.format("%.2f / %.2f = %.2f", x, y, x / y));

		// GET PI
		System.out.println("PI: " + Math.PI);

		// Exponent
		System.out.println(String.format("%.2f ^ %.2f = %.2f", x, y, Math.pow(x, y)));
		
		// Random
		System.out.println("Random Number: "+ new Random().nextInt(10));
	
		// Square Root of x
		System.out.println(String.format("Square Root of %.2f = %.2f", x, Math.sqrt(x)));
		
		
	}

}
