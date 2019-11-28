package dataTypes;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a Character");
		char character = scanner.next().charAt(0);
		
		switch (character){
		case 'A':
			System.out.println("You have typed letter A.");
		break;
		
		case 'B':
			System.out.println("You have typed letter B");
		break;
		
		case 'C':
			System.out.println("You have typed letter C");
		break;
		
		case 'D':
			System.out.println("You have typed letter D");
		break;
		
		default:
			System.out.println("You have typed a letter other than (A B C D)");
		break;	
		}
		
		scanner.close();
			System.out.println("End of program");
	}
	

}
