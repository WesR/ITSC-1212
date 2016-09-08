package com.wesring.lab2;

public class act1 {
	public static void main(String[] args) {
		long milliseconds = System.currentTimeMillis();//
		long seconds = milliseconds /1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		
		System.out.println(milliseconds+ " Milliseconds"); //Display the milliseconds
		System.out.println(seconds + " Seconds");//Display seconds
		System.out.println(seconds % 60 + " Current Seconds");//Display current seconds
		System.out.println(minutes + " Minutes");//Display Minutes
		System.out.println(minutes % 60 + " Current Minutes");//Display current minutes
		System.out.println(hours + " Hours");//Display hours
		System.out.println(hours % 24 + " Current Hours");//Display current hours
		System.out.println("\nThe time is " + (hours % 24) +":"+ (minutes % 60) +":"+ (seconds % 60));//Display current time
	}
}
