package com.wesring.lab6;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/20/2016
 * 
 */

public class act3 {
	
	public static int getHighest(int grades[]){
		Arrays.sort(grades);
		return grades[2];
	}
	public static int getLowest(int grades[]){
		Arrays.sort(grades);
		return grades[0];
	}
	public static int getAverage(int grades[]){
		return ((grades[0] + grades[1] + grades[2])/3);
	}
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); // Define the scanner		
		int grades[] = {0,0,0};
		
	System.out.println("Please enter the three numbers");
	System.out.print(">");
	grades[0] = userInput.nextInt();
	grades[1] = userInput.nextInt();
	grades[2] = userInput.nextInt();
	
	System.out.println("Highest Grade: " + getHighest(grades));
	System.out.println("Lowest Grade: " + getLowest(grades));
	System.out.println("Average Grades: " + getAverage(grades));
	}
}
