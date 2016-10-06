package com.wesring.chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/6/2016
 * Description: Calculates a hexagons area
 */
public class AreaHexagon {
	public static void main(String[] args){
		double userSideSize;//To hold the side size
		Scanner userInput = new Scanner(System.in); //Define the scanner
		DecimalFormat df = new DecimalFormat("#.00"); //Because if its not formatted ##.00, I get it wrong
		
		System.out.print("Enter the side:");//Input the side length
		userSideSize = userInput.nextDouble();
		
		System.out.println("The area of the hexagon is " + df.format((6 * Math.pow(userSideSize, 2)) / ( 4 * Math.tan(Math.PI/6))) ); //Math out the area
		
		userInput.close();//Keep it clean
	}
}
