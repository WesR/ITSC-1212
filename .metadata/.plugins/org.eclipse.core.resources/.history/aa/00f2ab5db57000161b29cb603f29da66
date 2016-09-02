package com.wesring.tipcalculator;

import java.util.Scanner;

public class TipCalculatorMain {
	public static void main(String[] args){
		System.out.println("-------Tip Calculator-----");
		System.out.println("What was the meal cost?");
		System.out.print(">");
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("Your bill with 15% tip is $" + (input.nextDouble() * 1.15));
		} catch (IndexOutOfBoundsException e) {
			System.out.print("Thats not valid money.");
		}
		System.out.println("---------Good Bye---------");
	}
}
