package com.wesring.lab2;

import java.util.Scanner;//Imported scanner

/*
 * I was told to fix the errors
 */
public class act8 {
	public static void main(String[] args){   
		int numPets1;   
		int numPets2;   //Made this a int
		int total;//Added a ;
		Scanner scan = new Scanner(System.in);   
		
		System.out.println("How many pets do you own?");   
		numPets1 = scan.nextInt();      
		
		System.out.println("How many pets does your partner own?");//Made it start a new line, so it looked nicer.
		numPets2 = scan.nextInt();      
		
		total = numPets1 + numPets2;    //Removed the space between numPets and 1
   
		System.out.println("Together, you both have " + total + " pets.");//Added a space so it would look better, and a period
		}
}