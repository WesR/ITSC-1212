package com.wesring.lab6;

import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/20/2016
 * 
 */

public class act1 {
	
	private static int add(int a, int b) //add
	{
		return (a + b); 
	}
	
	private static int subtract(int a, int b)//subtract
	{
		return a - b; 
	}
	
	private static int multiply(int a,int b)//Multiply
	{ 
		return (a * b);
	}
	
	private static double division(double a, double b)//division
	{
		return (a/b);
	}
	
	private static int power(int a, int b)//Raise to power
	{
		return (a^b);
	}	
	
	private static double squareroot(double a)//Square root
	{
		return Math.sqrt(a);
	}
	
	private static int absolute(int a)//Absolute value
	{
		return (Math.abs(a));
	}
	
	
	public static void main(String[] args){
		int first, second, userSelect;
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		  System.out.println("Caculator");
		  System.out.println("Enter the first number, followed by the second");
		  System.out.print(">");
		  first = userInput.nextInt();
		  second = userInput.nextInt();
		  
		  do {
		  System.out.println("\nMenu");
		  System.out.println(" 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Square \n 6. Absolute Value\n 7. Square root\n 8. Exit"); //Am i missing a option here?
		  System.out.print(">");
		  userSelect = userInput.nextInt();
		  switch (userSelect)
		  {
		  case 1 : 
			  System.out.println(add(first,second));//Add
		   break;
		  case 2:
			  System.out.println(subtract(first,second)); //subtract
		   break;
		  case 3:
			  System.out.println(multiply(first,second)); //multiply
		   break;
		  case 4: 
			  System.out.println(division(first,second)); //divide. 
		   break;
		  case 5:
			  System.out.println(power(first,second)); //raise first to the power of second
		  break;
		  case 6:
			  System.out.println(absolute(first)); //absolute value
		  break;
		  case 7:
			  System.out.println(squareroot(first)); //Square root
		  break;
		  default:
			  break;
		  }
		} while (userSelect != 8);
	}
}
