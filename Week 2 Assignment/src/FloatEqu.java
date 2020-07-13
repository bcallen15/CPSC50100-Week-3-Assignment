//*************************************************
//  FloatEqu.java			Author: Ben Callen
//
//  Checks equivalency of variables
//*************************************************

public class FloatEqu {

	public static void main(String[] args) {
		double var1, var2;
		
		var1 = (1.0/10.0) * (1.0/10);
		var2 = (1.0/100);
		
		if (var1 == var2 || var1 - var2 < 0.001 ) {
			System.out.println("EQUAL");
		}else {
			System.out.println("NOT EQUAL");
		}
	}

}
