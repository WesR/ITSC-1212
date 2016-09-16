package com.wesring.lab3;

import java.util.Random;
import java.util.Scanner;

/*
 * @Author Wes Ring 
 * @Version 0.0.1
 * @Date 9/15/2016
 */
public class ZodiacSigns {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); // Define the scanner
		Random r = new Random();//Random number generator
		
		// Define the digits
		int randDay, randMonth;//Generated vals
		int inputDay, inputMonth;//Input vals

		// Inputs
		System.out.print("Please input your month of birth\n>"); // Prompt the user
		inputMonth = userInput.nextInt();// Grab one
		System.out.print("Please input your day of birth\n>"); // Prompt the user
		inputDay = userInput.nextInt();// Grab Two
		
		//Random user
		randDay = (r.nextInt(31)+1);//Dont want a day 0
		randMonth = (r.nextInt(12)+1);//Dont want a month 0
		
		//User inputed
		System.out.print("\n\n\n\n\nYou are");
		whatAmI(inputMonth,inputDay);//Say the thing for user
		
		//Saying the Rand user things
		System.out.println("\nIf you were born on the " + randDay + " of month " + randMonth);
		System.out.print("You would be");
		whatAmI(randMonth,randDay);
		
		userInput.close();//Don't want to spring a leak
	}
	
	private static void whatAmI(int inputMonth, int inputDay){//Say the Z stuff
		if((inputMonth == 1 && inputDay >= 20) || (inputMonth ==2 && inputDay <=18)){
			System.out.println(" Aquarius");
			System.out.println("Aquarius is the eleventh astrological sign in the Zodiac, originating from the constellation Aquarius. The water carrier represented by the zodiacal constellation Aquarius is Ganymede, a beautiful Phrygian youth.");
		} else if((inputMonth == 2 && inputDay >= 19) || (inputMonth ==3 && inputDay <=20)) {
			System.out.println(" Pisces");
			System.out.println("Pisces is the twelfth astrological sign in the Zodiac, originating from the Pisces constellation.");
		} else if((inputMonth == 3 && inputDay >= 21) || (inputMonth ==4 && inputDay <=19)){
			System.out.println(" Aries");
			System.out.println("Aries is the first astrological sign in the Zodiac, spanning the first 30 degrees of celestial longitude. ");
		} else if((inputMonth == 4 && inputDay >= 20) || (inputMonth == 5 && inputDay <=20)){
			System.out.println(" Taurus");
			System.out.println("Practical, artistic, stable and trustworthy, the Taurus are loyal and dedicated in their work and relationships alike.");
		} else if((inputMonth == 5 && inputDay >= 21) || (inputMonth == 6 && inputDay <=20)){
			System.out.println(" Gemini");
			System.out.println("Gemini is represented by The Twins Castor and Pollux.");
		} else if((inputMonth == 6 && inputDay >= 21) || (inputMonth == 7 && inputDay <=22)){
			System.out.println(" Cancer");
			System.out.println("Cancer is the fourth astrological sign, which is associated with the constellation Cancer.");
		} else if((inputMonth == 7 && inputDay >= 23) || (inputMonth == 8 && inputDay <=22)){
			System.out.println(" Leo");
			System.out.println("Sun, the heart of our solar system is the ruling planet of Leo natives. Hence, they are prone to the ailments of the heart and spine, which is considered the heart of our nervous system.");
		} else if((inputMonth == 8 && inputDay >= 23) || (inputMonth == 9 && inputDay <=22)){
			System.out.println(" Virgo");
			System.out.println("The Virgo lucky stone is Topaz.");
		} else if((inputMonth == 9 && inputDay >= 23) || (inputMonth == 10 && inputDay <=22)){
			System.out.println(" Libra");
			System.out.println("The Libra-born are very balanced by nature, diplomatic, just and charming to the core.");
		} else if((inputMonth == 10 && inputDay >= 23) || (inputMonth == 11 && inputDay <=21)){
			System.out.println(" Scorpio");
			System.out.println("Scorpio-born are passionate and assertive people. They are determined and decisive, and will research until they find out the truth.");
		} else if((inputMonth == 11 && inputDay >= 22) || (inputMonth == 12 && inputDay <=21)){
			System.out.println(" Sagittarius");
			System.out.println("Sagittarius is one of the biggest travelers among all zodiac signs. Their open mind and philosophical view motivates them to wander around the world in search of the meaning of life.");
		} else if((inputMonth == 12 && inputDay >= 22) || (inputMonth == 1 && inputDay <=19)){
			System.out.println(" Capricorn");
			System.out.println("Capricorn is practical and is considered to be the most serious sign of the zodiac, who possess an independence that enables significant progress both on the personal level and in business.");
		} else {
			System.out.println(" unknown");
		}
	}
}
