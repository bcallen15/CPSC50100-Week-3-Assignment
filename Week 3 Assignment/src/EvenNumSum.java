

import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = scan.nextInt();
		
		if (num<2) {
			System.out.println("Error, number is less than 2.");
			System.out.println("Please enter a number that is at least 2.");
			num = scan.nextInt();
		}

	}

}
