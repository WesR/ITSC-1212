package com.wesring.reveltest;

import java.util.Scanner;

public class FindFutureDates{
public static void main(String[] args) {
Scanner userInput = new Scanner(System.in); 
System.out.print("Enter today's day:");
int day = userInput.nextInt();
System.out.print("Enter the number of days elapsed since today:");
int futureDay = userInput.nextInt();
int whatday = ((futureDay + day)% 7);
System.out.print("Today is " +WHATISDAY(day) + " and the future day is " + WHATISDAY(whatday));
}
public static String WHATISDAY(int day){
	switch(day){
		case 0:
		return "Sunday";
	case 1:
		return "Monday";
	case 2:
		return "Tuesday";
	case 3:
		return "Wednesday";
	case 4:
		return "Thursday";
	case 5:
		return "Friday";
	case 6:
		return "Saturday";
	default:
		return "invalid starting day. Today's day must be 0-6.";
	}
}
}