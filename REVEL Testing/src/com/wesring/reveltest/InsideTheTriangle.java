package com.wesring.reveltest;

import java.util.Scanner;

public class InsideTheTriangle {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter a point's x- and y-coordinates:");
		  double x = input.nextDouble();
		  double y = input.nextDouble();
		  double y2 = -x / 2 + 100;
		 
		  if (x < 0 || x < 100 || y < 0 || y > 200 ||  y > y2) {
			  System.out.println("The point is not in the triangle");
		  } else {
			  System.out.println("The point is in the triangle");
		  }
		 
	 }
}
