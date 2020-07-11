//************************************************
//  DistCalc.java		Author: Ben Callen
//
//  Calculates the distance between two pair
//  of (x,y) coordinates
//************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class DistCalc {

	public static void main(String[] args) {
		double coordinatex1, coordinatex2, coordinatey1, coordinatey2;
		double x1, x2, y1, y2, xfinal, yfinal, xdist, ydist, dist;
		
		Scanner scan = new Scanner (System.in);
		
		//------------------------------------------------------------------
		//Allows user to input x coordinates one at a time
		//------------------------------------------------------------------
		System.out.print("Enter x coordinate of first point: ");
		coordinatex1 = scan.nextDouble();
		
		System.out.print("Enter x coordinate of second point: ");
		coordinatex2 = scan.nextDouble();
		
		x1 = coordinatex1;
		x2 = coordinatex2;
		
		
		//------------------------------------------------------------------
		//Allows user to input y coordinates one at a time
		//------------------------------------------------------------------
		
		System.out.print("Enter y coordinate of first point: ");
		coordinatey1 = scan.nextDouble();
		
		System.out.print("Enter y coordinate of second point: ");
		coordinatey2 = scan.nextDouble();
		
		y1 = coordinatey1;
		y2 = coordinatey2;
		
		xfinal = x2-x1;
		yfinal = y2-y1;
		xdist = Math.pow(xfinal, 2);
		ydist = Math.pow(yfinal, 2);
		
		dist = Math.sqrt(xdist + ydist);
		
		//-----------------------------------------------------------------
		//Formats the decimal to go out three places
		//-----------------------------------------------------------------
		
		DecimalFormat fmt = new DecimalFormat ("0.###");
		
		System.out.print("Distance between the two points: " + fmt.format(dist));
		
	}

}
