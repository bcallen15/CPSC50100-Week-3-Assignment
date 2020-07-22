//*********************************************
//	Box.java			Author: Ben Callen
//
//	Prints a box of asterisks with a number of
//	rows and columns via a single user input
//*********************************************

	public class Box {
		int size = 0;
		void printBox() {
	
			for (int r = 0; r<size; r++) { //increment rows to set value in boxsize variable
				for (int c = 0; c<size; c++) { //increment columns to set value in boxsize variable
				System.out.print("*");
		}
				System.out.println();
		}
	}

	public static void main(String[] args) {
		Box boxsize = new Box();
		boxsize.size = 5;
		boxsize.printBox();

	}

}
