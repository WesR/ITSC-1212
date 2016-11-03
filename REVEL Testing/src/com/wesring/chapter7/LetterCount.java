package com.wesring.chapter7;

import java.util.Scanner;

public class LetterCount {
	public static void main(String[] args) {
		  Scanner userInput = new Scanner(System.in);
		  int total = 0;
		  
		  System.out.print("Enter a string of letter, numbers, spaces, and symbols:");
		  String userStr = userInput.nextLine();
		  System.out.print("The number of letters in the string is: " + totalLetters(userStr));
		 }
	 
	 public static int totalLetters(String strIdk){
		 int total = 0;
		 for(int i = 0; i < strIdk.length(); i++){
		  if(((strIdk.charAt(i) <= 'z' && strIdk.charAt(i) >= 'a') || (strIdk.charAt(i) <= 'Z' && strIdk.charAt(i) >= 'A') )){
				  total++;
		  }
		 }
		 return total;
	 }

}
