package com.linecomparison;

/**
 * 
 * @author Dipali
 *
 */
public class LineComparison {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Line Comparison Computation Program");

		// To give input of line Coordinates
		int x1 = 5;
		int x2 = 4;
		int y1 = 3;
		int y2 = 8;

		// To Calculate Line Length
		double lengthOfLine1 = Math.sqrt(((x2 - x1) ^ 2) + ((y2 - y1) ^ 2));
		System.out.println("The points x1= " + x1);
		System.out.println("The points x2= " + x2);
		System.out.println("The points y1= " + y1);
		System.out.println("The points y2= " + y2);
		System.out.println("Length of Line = " + lengthOfLine1);

	}
}
