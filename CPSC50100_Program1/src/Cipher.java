//*************************************************
//	Cipher.java			Author: Ben Callen
//	Class: CPSC-50100
//	Summer 2 2020
//	Programming Assignment 1: Cipher
//*************************************************

import java.util.Scanner;
import java.util.Random;

public class Cipher {

	public static void main(String[] args) {
		int Number, First, Second, Third, Fourth, Fifth, Total, RandomKey, Encoded;
		Random generator = new Random();
		RandomKey = generator.nextInt(10);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Programming Fundamentals" + '\n' + "NAME: Ben Callen" + '\n' + "PROGRAMMING ASSIGNMENT 1");
		
		System.out.println();
		
		System.out.println("Welcome to the Cipher Program." + '\n' + "Please enter 5 numbers between 0 and 19: ");
		
		
		System.out.print("1st number: ");
		First = scan.nextInt();
		
		if(First<0||First>19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		
		System.out.print("2nd number: ");
		Second = scan.nextInt();
		
		if(Second<0||Second>19) {
			System.out.println("Please read directions and try again!");
			System.exit(1);
		}
		
		System.out.print("3rd number: ");
		Third = scan.nextInt();
		
		if(Third<0||Third>19) {
			System.out.println("Please read directions and try again!");
			System.exit(2);
		}
		
		System.out.print("4th number: ");
		Fourth = scan.nextInt();
		
		if(Fourth<0||Fourth>19) {
			System.out.println("Please read directions and try again!");
			System.exit(3);
		}
		
		System.out.print("5th number: ");
		Fifth = scan.nextInt();
		
		if(Fifth<0||Fifth>19) {
			System.out.println("Please read directions and try again!");
			System.exit(4);
		}
		
		System.out.println();

		Total = First + Second + Third + Fourth + Fifth;
		
		System.out.println("Total = " + Total);
		
		System.out.println("Your random key is " + RandomKey);
	
		if (Total <10) {
			int Single = (Total + RandomKey) % 10; //single refers to a single digit total
			Single = (RandomKey * 10) + Single;
			System.out.println("Your encoded number is " + Single);
		}
		else {
			int Encode1 = Total/10; //generates value for first number in cipher
			int Encode2 = Total%10; //generates value for second number in cipher
			Encode1 = (RandomKey + Encode1) % 10;
			Encode2 = (RandomKey + Encode2) % 10;
			Encoded = Encode1 * 10 + Encode2;
			System.out.println("Your encoded number is " + Encoded);
		}

	}

}
