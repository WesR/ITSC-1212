package com.wesring.reveltest;

import java.util.Scanner;

public class InsideTheTriangle {
	public static void main(String[] args) {
		  Scanner userInput = new Scanner(System.in);
		 
		  System.out.print("Enter a point's x and y coordinates: ");
		  double x = userInput.nextDouble();
		  double y = userInput.nextDouble();
		  double y2 = -x / 2 + 100;
		 
		  if (x < 0 || x > 200 || y < 0 || y > 100 ||  y > y2) {
			  System.out.println("The point is not in the triangle");
		  } else {
			  System.out.println("The point is in the triangle");
		  }
		 userInput.close();
	 }
}
