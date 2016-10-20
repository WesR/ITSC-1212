package com.wesring.lab6;

import java.util.Random;
import java.util.Scanner;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 10/20/2016
 * 
 */

public class act4 {
	public static void main(String[] args){
		String userQuestion;
		boolean chat = true;
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.println("Hello, want to have a chat? Type a question! (Say goodbye to leave!)");
		
		do{
			System.out.print(">");//Formatting user input
			userQuestion = userInput.nextLine();//Get user Input
			if (userQuestion.toLowerCase().equals("goodbye")){//Check for the leave flag
				System.out.println("Goodbye! \nHave a nice day!");
				chat = false;
			} else {
				System.out.println("Bot> " + getResponce(userQuestion));//Write a response
			}
			
			
		}while(chat);
	}
	
	public static String getResponce(String question){
		if (question.toLowerCase().contains("i want to buy")){
			return "Would you be happy if you had" + question.substring(question.toLowerCase().indexOf("i want") + 13);
		}
		if (question.toLowerCase().contains("i want")){
			return "Why do you want" + question.substring(question.toLowerCase().indexOf("i want") + 6);
		}
		if (question.toLowerCase().contains("i like to")){
			return "Why do you like to" + question.substring(question.toLowerCase().indexOf("i like") + 9);
		}
		if (question.toLowerCase().contains("father") || question.toLowerCase().contains("mother")){
			return "Oh! What about your parents?";
		}
		if (question.toLowerCase().contains("brother") || question.toLowerCase().contains("sister")){
			return "Oh! I have a Brother. His name is JAKE";
		}
		if (question.toLowerCase().contains("do you like to")){
			return "I do enjoy" + question.substring(question.toLowerCase().indexOf("do you like to") + 14);
		}
		if (question.toLowerCase().contains("do you want to")){
			return "Sure! Lets" + question.substring(question.toLowerCase().indexOf("do you want to") + 14);
		}
		if (question.toLowerCase().contains("do you know about")){
			return "What about" + question.substring(question.toLowerCase().indexOf("do you know about") + 17);
		}
		return randomResponce();
	}
	
	public static String randomResponce(){
		Random r = new Random();//We need a random number
		
		switch(r.nextInt(4)){//Pick a random response
		case 0:
			return "I dont know, what do you think?";
		case 1: 
			return "How cool!";
		case 2: 
			return "But why?";
		case 3:
			return "Ask NASA!";
		case 4: 
			return "Who knows!";
		}
		return "ERROR";
	}
	
}
