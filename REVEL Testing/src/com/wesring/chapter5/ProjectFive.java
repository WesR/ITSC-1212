package com.wesring.chapter5;

import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/14/2016
 * 
 */
public class ProjectFive {
	public static void main(String[] args){
		int userLimit;
		Scanner userInput = new Scanner(System.in); //Define the scanner
	
		System.out.println("Please enter the limiting number");//Prompt
		System.out.print(">");//Formatting user input
		userLimit = userInput.nextInt();//Get user Input start
	
		System.out.println("Pattern A:"); //Pattern A
		for(int i = 1; i <= userLimit; i++){
			for(int k = 1; k <= i; k++){
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Pattern B:");//Pattern B
        for(int i = userLimit; i >= 1; i--) {
            for(int k = 1; k < i + 1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Pattern C:");//Pattern C
		for(int i = 1; i <= userLimit; i++){
			for(int k = i; k >= 1; k--){
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Pattern D:");//Pattern D
        for(int i = userLimit; i >= 1; i--) {
            for(int k = 1; k < i + 1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
	}
}
