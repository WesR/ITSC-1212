package com.wesring.lab2;

import java.util.Scanner;
//I found 11 Errors, they were marked so I could count
public class act9 {
	public static void main(String[] args) {
		int total = 0;
		int tempNum;
		Scanner scan = new Scanner(System.in); // ERROR
		System.out.println("Personality Quiz: What Animal Are You?");
		System.out.println("Taken from a random YouTube video."); // ERROR
		System.out.println("Type in the number associated for each answer.");// ERROR
		System.out.println();
		System.out.println("How would you describe yourself?");
		System.out.println("Fun and loud (30), Cute and lazy (10), Calm and Serious (20),\n" + "Smart and bossy (50), Mean and mysterious (60), or \n" + "Loyal and adventurous (40)"); // ERROR
		tempNum = scan.nextInt();
		total += tempNum; // ERROR
		System.out.println();
		System.out.println("If you could travel through time where would you go?");
		System.out.println("In the future, I love technology (30)");
		System.out.println("My favorite time period (60)");
		System.out.println("In my dreams (10)");
		System.out.println("When Julius Caesar was alive (50)");
		System.out.println("Just before humans conquered the Earth (20)");
		System.out.println("When werewolves will rule the world (40)");
		tempNum = scan.nextInt();
		total += tempNum;// ERROR
		System.out.println();
		System.out.println("Your best friend has told your enemy one of" + " your secrets. What now?");
		System.out.println("What friend? (20)"); // ERROR
		System.out.println("Whatever, who cares? (10)");
		System.out.println("Why? I don't know but they will be sorry! (40)");
		System.out.println("Yell at them and get a new best friend (30)");
		System.out.println("Well, that's it. They are no longer my friend. (50)");
		System.out.println("I will tear them apart! (so violent) (60)");
		tempNum = scan.nextInt(); // ERROR
		total = tempNum + total;// ERROR
		System.out.println();
		System.out.println("Your points are: " + total); // ERROR
		System.out.println("If you got between...");
		System.out.println("30-59: Koala");
		System.out.println("60-89: Bear");
		System.out.println("90-119: Monkey");
		System.out.println("120-149: Lion"); // ERROR
		System.out.println("150-180: Tiger");
	}
}