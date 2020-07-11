import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		//Two variables will be needed for seconds in the program. 
		//One for the input prompt and one for calculation.
		int hours, minutes, seconds, sec;
		//secondsin is the input in seconds placed by the operator of the program
		Scanner secondsin = new Scanner(System.in);
		
		System.out.print("Enter a time in seconds: ");
		seconds = secondsin.nextInt();
		//I tried to make conversions based on 60 seconds in a minute
		//and 60 minutes in an hour, but could not get the calculation
		//to work properly. Instead I went with only seconds as the
		//division unit.
		sec = seconds%60;
		minutes = (seconds%3600)/60;
		hours = seconds/3600;
		//prints out converted time
		System.out.print("The time in H:M:S is: " + hours + ":" + minutes + ":" + sec);
		
	}

}
