//******************************************************
//AgeGuessEx4.java      Author: Ben Callen
//
//Allows user to input a name and guess the age of the
//person. Program displays user guess and correct guess.
//******************************************************

import java.util.Random;
import java.util.Scanner;

public class AgeGuessEx4 {

	public static void main(String[] args) {
		String name;
		int ageGuess, age;
		Random generator = new Random();
		
		//---------------------------------------
		//Generates random number for age
		//---------------------------------------
		age = generator.nextInt(101);
		
		Scanner scan = new Scanner(System.in);
		
		//---------------------------------------
		//User can enter a name
		//---------------------------------------
		System.out.print("Enter a name: ");
		name = scan.nextLine();
		
		//---------------------------------------
		//User can guess the age of the person
		//---------------------------------------
		System.out.print("Guess the age: ");
		ageGuess = scan.nextInt();
		
		//-----------------------------------------
		//Displays the user guess and correct age
		//-----------------------------------------
		System.out.println("Your guess: " + ageGuess);
		System.out.println("Correct answer: " + age);
		
		//-----------------------------------------
		//If the guess is younger or older, a
		//string will print telling the user.
		//-----------------------------------------
		
		if (ageGuess != age) {
			System.out.print("You guessed wrong! ");
		}if (ageGuess > age) {
				System.out.println(name + " is younger");
		}else {
				System.out.print(name + " is older");
		}

	}

}