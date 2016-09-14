package com.wesring.reveltest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		int callsReceived;
		int operatorsOnCall;
		//callsReceived
		//operatorsOnCall
		//stdin
		callsReceived = stdin.nextInt();
		operatorsOnCall = stdin.nextInt();
		if(operatorsOnCall == 0){
			System.out.println("INVALID");
		} else {
			System.out.println(callsReceived / operatorsOnCall);
		}
		
	}
}
