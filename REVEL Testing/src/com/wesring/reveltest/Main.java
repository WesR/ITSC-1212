package com.wesring.reveltest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double lol = userInput.nextDouble();
		System.out.print(lol+ " feet is " + lol*0.305+" meters");
	}
}
