package dataTypes;

import java.util.Scanner;

public class ArithmeticOperators {
	public static void main(String[] args) {
		
		int a, b, result;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value of a and b: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		result = a+b;
			System.out.println("Result after addition: " + result );
			
		result = a-b;
			System.out.println("Result after subtraction: " + result);
			
		result = a*b;
			System.out.println("Result after multiplication: " + result);
			
		result = a/b;
			System.out.println("Result ater division: " + result);
			
		result =a%b;
			System.out.println("Result of reminder: " + result);
	}
}
