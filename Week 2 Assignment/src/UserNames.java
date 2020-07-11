//************************************************
//  UserNames.java			Author: Ben Callen
//
//  Constructs a username for people based on
//  their name and a randomly generated number
//************************************************
import java.util.Scanner;
import java.util.Random;

public class UserNames {

	public static void main(String[] args) {
		String firstname, lastname, usernameletter, first4last, firstfirst, usernamefinal;
		int number;
		Random generator = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		//------------------------------------------------
		//Allows user to enter their first and last name.
		//------------------------------------------------
		
		System.out.print("Enter your first name: ");
		firstname = scan.nextLine();
		
		System.out.print("Enter your last name: ");
		lastname = scan.nextLine();
		
		//------------------------------------------------
		//Appends the user input to specified length.
		//------------------------------------------------
		
		first4last = lastname.substring(0,4);
		firstfirst = firstname.substring(0,1);
		
		
		//-----------------------------------------------
		//Generates random number to go along.
		//-----------------------------------------------
		
		number = generator.nextInt(90) + 10;
		
		//-----------------------------------------------
		//Creates a username based on specifications.
		//Also converts username to all uppercase.
		//-----------------------------------------------
		
		usernameletter = first4last + firstfirst;
		usernamefinal = usernameletter.toUpperCase();
		
		System.out.println("Your username is: " + usernamefinal + number);

	}

}
