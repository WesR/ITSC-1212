package com.wesring.lab4;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/22/2016
 */

public class act3 {
	public static void main(String[] args) {
		String userName, userPassword;//Saved passes
		String loginName, loginPassword;//Input passes
		Scanner userInput = new Scanner(System.in); // Define the scanner
		
		System.out.println("Create user account:");
		System.out.print("Please input your username \n>"); //Prompt the user
		userName = userInput.nextLine();
		System.out.print("Please input your password \n>"); //Prompt the user
		userPassword = getHash(userInput.nextLine());//Hashing before saving
		
		System.out.println("Account created: " + userName);//Output the new username
		
		System.out.println("Login user:");
		System.out.print("\n\nPlease input your username \n>"); //Prompt the user
		loginName = userInput.nextLine();
		System.out.print("Please input your password \n>"); //Prompt the user
		loginPassword = getHash(userInput.nextLine());//Hashing before saving

		if(userName.equals(loginName) && userPassword.equals(loginPassword)){
			System.out.println("User sucessfuly logged in,");
			System.out.println("Welcome " + userName);
		} else {
			System.out.println("ERROR, account not found!");
		}
		
		userInput.close();//Close the scanner
	}
	public static String getHash(String text){
		//Data security is important, Thats why I hashed
	        MessageDigest m;
			try {
				m = MessageDigest.getInstance("MD5");
				m.update(text.getBytes(),0,text.length());
				//System.out.println(new BigInteger(1,m.digest()).toString(16));
			    return (new BigInteger(1,m.digest()).toString(16));
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "ERROR";
	}
}
