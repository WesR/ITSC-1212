package com.wesring.lab7;

import java.util.Arrays;

/*
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/3/2016
 * 
 */

public class act4 {
	public static void main(String[] args){
		String[] cardSuit = {"Hearts", "Spades", "Clubs", "Diamonds"};
		String[] cardType = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen","King"};
		String[] userDeck = generateUserDeck(cardSuit, cardType);
		
		System.out.println(Arrays.toString(userDeck));//Print the deck (Not required but helpful for debugging
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
