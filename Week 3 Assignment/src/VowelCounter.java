//*************************************************
//	VowelCounter.java		Author: Ben Callen
//
//	Tally the number of each vowel (A,E,I,O,U)
//	as well as the number of non-vowel characters
//	in a user-input string
//*************************************************

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		
		String userstring, endstring;
		int a=0, e=0, i=0, o=0, u=0, nonvowel=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a sentence.");
		userstring = scan.nextLine();
		
		endstring = userstring.toLowerCase(); //change string to all lowercase for ease of calculation
		
		//set increment for that references length of string entered
		for (int x=0; x<endstring.length(); x++) {
			char y = endstring.charAt(x); //reads character at spot 'x' in the string
			
			if (y=='a')
				a++;
			else if (y=='e')
				e++;
			else if (y=='i')
				i++;
			else if (y=='o')
				o++;
			else if (y=='u')
				u++;
			else nonvowel++;
		}
		
		System.out.println("Total a: " + a);
		System.out.println("Total e: " + e);
		System.out.println("Total i: " + i);
		System.out.println("Total o: " + o);
		System.out.println("Total u: " + u);
		System.out.println("Total nonvowel characters: " + nonvowel);

	}

}
