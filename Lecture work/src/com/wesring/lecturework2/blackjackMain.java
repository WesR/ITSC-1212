package com.wesring.lecturework2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/7/2016
 * 
 * 
 * PsudoCode: (I did a flow chart but Visio decided to crash and delete it, when I was almost done.... I don't want to waste another half hour
 * Start: main game loop
 * Display the game rules
 * 
 * Generate user card 1, add it it to the total (0)
 * Generate user card 2, add it to the user total
 * 
 * Generate a dealer card, add it to the total
 * If its under 17, generate another ( Repeat until over)
 * If it generates an ace, chose 11 unless that would put you over 21
 * 
 * Ask the user if they want to generate a new card
 * If they say Yes, Generate one
 * When they say yes, enable the score counter statment
 * 
 * In the score counter method, if the user is over 21, bust
 * If the dealer is is over 21, bust
 * If the user is over the dealer, then they win
 * Else the dealer wins
 * 
 * Display the winner
 * 
 * Ask if they want to play again
 * If true, restart the main loop, else wise say goodbye
 * 
 * NOTES:
 * 
 * Use a switch statement to match the card value to the human name
 * 
 * If the user draws an ace card, ask if they would like it to be a 1 or 11
 * If they choose 1, make it 1
 * Else make it 11
 * 
 * Again, sorry about the lack of an awesome flow chart. 
 * It bummed me that all my work was gone, and my time wasted. PsudoCode is harder to read, but quicker to write
 * 
 **/

public class blackjackMain {
	static Random r = new Random();//We need a  random	
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);//A scanner for userinput
		
		do{//Full program loop
			Boolean gameRun = true, doneDrawing = false;//The main game flag and a drawing done flag
			int userPoints = 0, dealerPoints;//Keeping track of the scores
			
			System.out.println("Blackjack Game\n");//Game Name
			displayInstructions();//Display the game instructions (Required method)
			
			System.out.println("Player draws two cards");//Generating the users first two cards 
			userPoints = userDrawCard(userPoints);//Drawing a card
			userPoints = userDrawCard(userPoints);//Drawing the second card
	
			dealerPoints = dealerDraw();//Drawing the dealers deck
			System.out.println("\nThe dealer has drawn\n");//Telling the player (Feedback is important!)
			
			do {
				System.out.println("Would you like to draw another card? (Choice Y/N)");
				if(userInput.nextLine().toLowerCase().equals("y")){
					//System.out.println("LOG: USER " + userPoints);
					userPoints = userDrawCard(userPoints);
					//System.out.println("LOG: USER " + userPoints);
				} else {
					doneDrawing = true;//Time to compare points
				}
				
				
				if (doneDrawing){//Only evaluate the winner if the user is done drawing
					if (userPoints == dealerPoints){
						System.out.println("The game was a Tie!");
					} else {
						
						if (determineWinner(userPoints, dealerPoints)){//User wins
							System.out.println("You Won!");
						} else {//user loses
							if (userPoints > 21){//Checking for a bust
								System.out.println("You busted!");//The user was over 21
							} else {
								System.out.println("You lost!");//The user lost
							}
						}
					}
					
					System.out.println("The dealer had " + dealerPoints);
					gameRun = false;
				}
			} while(gameRun);//Loop for user card drawing
			System.out.println("\nWould you like to play again? (Y/N)");
		} while(userInput.nextLine().toLowerCase().equals("y"));//Loop while the user wants to play
		System.out.println("\nHave a nice day!");
	}
	
	public static int userDrawCard(int userPoints){
		int tempCard;
		String tempCardName;
		Boolean hadAce = false;
		
		tempCard = generateCard();//Generate card
		tempCardName = nameCard(tempCard);//Name card
		
		if (tempCard == 1){//Check for ace
			tempCard = aceValue();
			hadAce = true;
		}
		
		if(tempCard == 11 || tempCard == 12 || tempCard == 13){//Normalizing for face cards not 10
			tempCard = 10;
		}
		
		userPoints += tempCard;//Add total user points
		displayHand(userPoints, tempCardName);//Display user hand
		
		return userPoints;//Return the new user points
	}
	
	public static int dealerDraw(){//The dealer draws their hand value
		int dealerPoints = 0, tempCard;
		
		do{
			tempCard = generateCard();//Generate card
			
			if (tempCard == 1){//Ace check
				if ((dealerPoints + 11) > 21){
					tempCard = 1;
				} else {
					tempCard = 11;
				}
			}
		
			if(tempCard == 11 || tempCard == 12 || tempCard == 13){//Normalizing for face cards not 10
				tempCard = 10;
			}
			
			dealerPoints += tempCard;//Add points
		} while (dealerPoints < 17);//Loop while we are under 17
		
		return dealerPoints;
	}
	
	public static Boolean determineWinner(int userPoints, int dealerPoints){//Returns true if user wins
		if (userPoints > 21){return false;}//User bust
		else if (userPoints == 21){return true;}//User wins 21 in case you get 21 v 21
		else if (userPoints > dealerPoints){return true;}//User Win
		else if (dealerPoints > 21){return true;}//Dealer Bust
		else {return false;}//Dealer Win
	}
	
	public static void displayHand(int userTotal, String tempCardName){//displays the users hand
		System.out.println("You drew a " + tempCardName + ", your new total is " + userTotal);
	}
	
	public static int aceValue(){
		Scanner userInput = new Scanner(System.in);//A global scanner for userinput
		System.out.println("You drew an ace, would you like it to be a 1 or an 11? (Choice 1/11)");
		if (userInput.nextInt() == 1){//Return one if they selected 1, else 11
			System.out.println("You chose a 1\n");
			return 1;
		} else {
			System.out.println("You chose 11\n");
			return 11;
		}
	}
	
	public static void displayInstructions(){//Displays the game instructions
		System.out.println("First, the dealer and player each gets two cards.");
		System.out.println("The goal of the game is to get as close, or equal, to 21 as possible without going over. Whoever is closest to 21 is the winner. If anyone goes over 21, they automatically lose.");
		System.out.println("After the first two cards are drawn, you may decide whether or not to draw again.");
		System.out.println("Aces may either be 1 or 11. Good luck user!");
		System.out.println();
	}
	
	public static String nameCard(int cardValue){
		switch(cardValue){//Output the card name, mapped from value
		case 1:
			return "Ace";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		case 10:
			return "10";
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		default:
			return "ERROR";
		}
	}
	
	public static int generateCard(){//Returns a random card draw
		return (r.nextInt(12) + 1);
	}
}
