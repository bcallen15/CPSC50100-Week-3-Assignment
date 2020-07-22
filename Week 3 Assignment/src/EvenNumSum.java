

import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		int num, sum, x;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = scan.nextInt();
		
		if (num<2) {
			System.out.println("Error, number is less than 2.");
			System.out.println("Please enter a number that is at least 2.");
			num = scan.nextInt();
		}
		
		if(num%2!=0) {  //checks remainder to see if number is even (even divided by two has no remainder)
			num--;
		}
		x = num/2;
		sum = x * (x+1);
		System.out.println("The sum of all even numbers from 2 to your number is: " + sum);

	}

}
