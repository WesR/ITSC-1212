package com.wesring.lab7;

import java.util.Arrays;
import java.util.Random;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/3/2016
 * 
 */

public class act5 {
	public static void main(String[] args){
		String[] cardSuit = {"Hearts", "Spades", "Clubs", "Diamonds"};
		String[] cardType = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen","King"};
		String[] userDeck = generateUserDeck(cardSuit, cardType);
		
		System.out.println("The unshuffled deck is " + Arrays.toString(userDeck));//Print the deck (Not required but helpful for debugging
		
		userDeck = shuffleDeck(userDeck, 100);//Pass the deck, and the shuffle times
		System.out.println("The shuffled deck is " + Arrays.toString(userDeck));//Print the deck (Not required but helpful for debugging
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
