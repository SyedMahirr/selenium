package com.Syed.encapsulation;

public class basicArtihmatics {
	int x, y;
	int sum, sub;

	protected int addition(int x, int y) {

		sum = x + y;
		return sum;
		// System.out.println("Sum is: " + sum);
	} // end of additon

	int substration(int a, int b) {
		// x = 15;
		// y = 5;
		sub = a - b;
		return sub;
		// System.out.println( "Sub is: " + sub);
	}// end of subtration

}
