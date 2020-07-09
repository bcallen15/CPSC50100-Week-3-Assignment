import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		String name;
		int ageGuess;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		name = scan.nextLine();
		
		System.out.print("Guess the age: ");
		ageGuess = scan.nextInt();

	}

}
