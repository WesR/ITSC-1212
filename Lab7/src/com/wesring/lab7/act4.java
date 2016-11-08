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
		
		System.out.println(Arrays.toString(userDeck));
	}

	private static String[] generateUserDeck(String[] cardSuit, String[] cardType) {
		String[] userDeck = new String[52];
		for(int i = 0; i < cardType.length; i++){
			for(int k = 0; k < cardSuit.length; k++){
				userDeck[i+k] = cardType[i] + " of " + cardSuit[k];
			}
		}
		return userDeck;
	}
}
