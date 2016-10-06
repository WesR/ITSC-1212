package com.wesring.lecturework;

import java.util.Random;//To generate a random number
import java.util.Scanner;//To get user input

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 10/5/2016
 */
public class ArmstrongNumberChecker {
	public static void main(String[] args) {
		int userNum;//To hold the number to be tested
		
		Scanner userInput = new Scanner(System.in); //Define the scanner
		Random r = new Random();//Defining a random

		System.out.println("Armstrong number checker");
		System.out.print("Would you like to use your own number? (Y/N)\n>");//Checking to see if we need to generate our own number
		if(userInput.next().equalsIgnoreCase("y")){
			System.out.println("Please enter your number? (1-9999)\n>");//Getting the user number
			userNum = userInput.nextInt();
		}else{
			System.out.println("A number will be generated");//Generating our number
			userNum = r.nextInt(1000);
		}
		System.out.println("Your number is " + userNum);
		
		
		switch(String.valueOf(userNum).length()){//Now we do the checks
		case 1://One digit
			if (cube(userNum) == userNum){ //We check to see if the cube and the number  are the same
				System.out.println("Congrats! " + userNum + " is an armstrong number!");
			} else { 
				System.out.println("Sorry, " + userNum + " is not an armstrong number.");
			}
			break;
		case 2://Two digit
			if (cube(userNum % 10) + cube(userNum/10) == userNum){ //We check to see if the cube of both numbers and the original number are the same
				System.out.println("Congrats! " + userNum + " is an armstrong number!");
			} else { 
				System.out.println("Sorry, " + userNum + " is not an armstrong number.");
			}
			break;
		case 3://Three digit
			if (cube(userNum % 10) + cube((userNum / 10)%10)+ cube((userNum/100)%10) == userNum){ //We check to see if the cube and the number  are the same
				System.out.println("Congrats! " + userNum + " is an armstrong number!");
			} else { 
				System.out.println("Sorry, " + userNum + " is not an armstrong number.");
			}
			break;
		case 4://Four digit
			//I would just like to add that this is supposed to be to the fourth, even though I was asked to cube it
			if (cube(userNum % 10) + cube((userNum / 10)%10) + cube((userNum/100)%10)  + cube((userNum/1000)%10) == userNum){ //We check to see if the cube and the number  are the same
				System.out.println("Congrats! " + userNum + " is an armstrong number!");//It works!
			} else { 
				System.out.println("Sorry, " + userNum + " is not an armstrong number.");
			}
			break;
		default://Error
		System.out.print("Error! " + userNum + " is not between 0-9999");//Wrong input
			break;		
		}
		
		
		System.out.println("Goodbye!");//I was told to say goodbye
		
		userInput.close();//Preventing memory leaks since 2014
	}
	
	public static int cube(int n){
		return (int) Math.pow(n, 3);//Takes a number, and cubes it | Since Math.pow is made for doubles I force the outcome to an int
	}
}
