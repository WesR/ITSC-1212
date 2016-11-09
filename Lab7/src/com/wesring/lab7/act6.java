package com.wesring.lab7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/3/2016
 * 
 */

public class act6 {
	public static void main(String[] args){
		String[] cardSuit = {"Hearts", "Spades", "Clubs", "Diamonds"};
		String[] cardType = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen","King"};
		String[] userDeck = generateUserDeck(cardSuit, cardType);
		Scanner userInput = new Scanner(System.in); //Define the scanner
		
		System.out.println("The unshuffled deck is " + Arrays.toString(userDeck));//Print the deck (Not required but helpful for debugging
		
		userDeck = shuffleDeck(userDeck, 100);//Pass the deck, and the shuffle times
		System.out.println("The shuffled deck is " + Arrays.toString(userDeck));//Print the deck (Not required but helpful for debugging	
		
		System.out.println("Please enter two index numbers (0-52)");
		int userCard1 = userInput.nextInt();
		int userCard2 = userInput.nextInt();
		System.out.println("Bigger Index " + compareTo(userDeck, userCard1, userCard2));
		System.out.println("Bigger Index card: " + userDeck[compareTo(userDeck, userCard1, userCard2)]);
	}

	
	private static int compareTo(String[] userDeck, int cardIndex1, int cardIndex2){
		String userCard1Suit = userDeck[cardIndex1].toLowerCase().substring(userDeck[cardIndex1].length() - 2, userDeck[cardIndex1].length());	
		String userCard2Suit = userDeck[cardIndex2].toLowerCase().substring(userDeck[cardIndex2].length() - 2, userDeck[cardIndex2].length());
		String userCard1Val = userDeck[cardIndex1].toLowerCase().substring(0,1);
		String userCard2Val = userDeck[cardIndex2].toLowerCase().substring(0,1);
		int userCard1 = 0, userCard2 = 0;
		
		switch(userCard1Val){
		case "a":
			userCard1 = 1;
			break;
		case "2":
			userCard1 = 2;
			break;
		case "3":
			userCard1 = 3;
			break;
		case "4":
			userCard1 = 4;
			break;
		case "5":
			userCard1 = 5;
			break;
		case "6":
			userCard1 = 6;
			break;
		case "7":
			userCard1 = 7;
			break;
		case "8":
			userCard1 = 8;
			break;
		case "9":
			userCard1 = 9;
			break;
		case "1":
			userCard1 = 10;
			break;
		case "j":
			userCard1 = 11;
			break;
		case "q":
			userCard1 = 12;
			break;
		case "k":
			userCard1 = 13;
			break;
		}
		
		switch(userCard2Val){
		case "a":
			userCard2 = 1;
			break;
		case "2":
			userCard2 = 2;
			break;
		case "3":
			userCard2 = 3;
			break;
		case "4":
			userCard2 = 4;
			break;
		case "5":
			userCard2 = 5;
			break;
		case "6":
			userCard2 = 6;
			break;
		case "7":
			userCard2 = 7;
			break;
		case "8":
			userCard2 = 8;
			break;
		case "9":
			userCard2 = 9;
			break;
		case "1":
			userCard2 = 10;
			break;
		case "j":
			userCard2 = 11;
			break;
		case "q":
			userCard2 = 12;
			break;
		case "k":
			userCard2 = 13;
			break;
		}
		
		switch(userCard1Suit){
		case "es"://Spades
			if (userCard2Suit.equals("es")){
				if(userCard1 > userCard2){
					return cardIndex1;
				} else {
					return cardIndex2;
				}
			} else {
				return cardIndex1;
			}
		case "ds"://Diamonds
			if (userCard2Suit.equals("es")){
				return cardIndex2;
			} else {
				if (userCard2Suit.equals("ds")){
					if(userCard1 > userCard2){
						return cardIndex1;
					} else {
						return cardIndex2;
					}
				} else {
					return cardIndex1;
				}
			}
		case "bs"://Clubs
			if (userCard2Suit.equals("es")){
				return cardIndex2;
			} else {
				if (userCard2Suit.equals("ds")){
					return cardIndex2;
				} else {
					if (userCard2Suit.equals("bs")){
						if(userCard1 > userCard2){
							return cardIndex1;
						} else {
							return cardIndex2;
						}
					} else {
						return cardIndex1;
					}
				}
			}
		case "ts"://Hearts
			if (userCard2Suit.equals("ts")){
				if(userCard1 > userCard2){
					return cardIndex1;
				} else {
					return cardIndex2;
				}
			} else {
				return cardIndex2;
			}
		}
		return 1000;
	}
	
	private static String[] shuffleDeck(String[] userDeck, int shuffleTimes) {
		Random r = new Random();//Random number generator
		int index1, index2;//The index numbers
		String temp;//Card Storage
		
		for(int i = 0; i < shuffleTimes; i++){
			index1 = r.nextInt(52);//Generate location 1 
			index2 = r.nextInt(52);//Generate location 2
			
			//Rotating the cards
			temp = userDeck[index1];
			userDeck[index1] = userDeck[index2];
			userDeck[index2] = temp;
		}
		return userDeck;//Give back the shuffled deck
	}

	private static String[] generateUserDeck(String[] cardSuit, String[] cardType) {
		int tempPlace = 0;//To keep track of where we already have values
		String[] userDeck = new String[52];
		for(int i = 0; i < cardSuit.length; i++){//Rotate the card suit
			for(int k = 0; k < cardType.length; k++){//Rotate the card type
				userDeck[tempPlace] = cardType[k] + " of " + cardSuit[i];//Place it in the array
				tempPlace++;//Move up an array index
			}
		}
		return userDeck;//Pass the deck back
	}
}
