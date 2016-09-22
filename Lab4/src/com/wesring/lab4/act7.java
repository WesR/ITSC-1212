package com.wesring.lab4;

import java.util.Scanner;

/** This class is to show you guys on how you can create your own methods for stuff
 * Here, we use methods to make simple calculator. There are errors here so fix them. 
 * I do not know what else to comment so ... w/e
 * @author Devansh Desai
 * @version 1.0
 * 
 * 
 * Edited by Wes Ring
 */

public class act7 {
	public static void main(String[] args)
	{
		  System.out.println("Welcome to world of Math Functions!!!");
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter 1st number : ");
		  int first = scan.nextInt();
		  System.out.println("Enter 2nd number : ");
		  int second = scan.nextInt();
		  
		  System.out.println("What would you like to do with those numbers?\nMenu \n");
		  System.out.println(" 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Square \n 6. Absolute Value\n 7. Square root"); //Am i missing a option here?
		  switch (scan.nextInt())
		  {
		  case 1 : 
			  System.out.println(add(first,second));
		   break;
		  case 2:
			  System.out.println(subtract(first,second)); //add code to subtract
		   break;
		  case 3:
			  System.out.println(multiply(first,second)); //add code to multiply
		   break;
		  case 4: 
			  System.out.println(division(first,second)); // add code to divide. 
		   break;
		  case 5:
			  System.out.println(square(first)); //add code to show square of number
		  break;
		  case 6:
			  System.out.println(absolute(first)); //add code to show square of number
		  break;
		  case 7:
			  System.out.println(squareroot(first)); //add code to show square of number
		  break;
		  default:
			  break;
		  }
	}
	
	private static int add(int a, int b) //This method will add integers a and b
	{
		return (a + b); //Something wrong with this line
	}
	
	private static int subtract(int a, int b)
	{
		return a - b; //It returns the subtraction of a and b.
	}
	
	private static int multiply(int a,int b) //hmm.. i wonder what is the error here.
	{
		return (a * b);
	}
	
	private static double division(int a, int b)
	{
		return (a/b);//I forgot what goes in here, so please help me. 
	}
	
	private static double square(int a)
	{
		return (a^2);
	}	
	
	private static double squareroot(int a)
	{
		return Math.sqrt(a);
	}
	
	private static double absolute(int a)
	{
		return (Math.abs(a));
	}
	
}
