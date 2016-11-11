package com.wesring.lab8;

import java.util.Scanner;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 11/10/2016
 * 
 */

public class Challange {
	public static void main(String[] args){
		String[][] gameBoard = {{" ", " ", " "},{" ", " ", " "},{" ", " ", " "}};
		
		printGrid(gameBoard);
		do{
			playerTurn(gameBoard, "X");
			printGrid(gameBoard);
			if(!hasSpace(gameBoard)){break;}
			playerTurn(gameBoard, "O");
			printGrid(gameBoard);
		}while(hasSpace(gameBoard));
		//printGrid(gameBoard);
		System.out.println("Game Over");
	}
	
	public static Boolean hasSpace(String[][] gameBoard){
		for(int i = 0; i < gameBoard.length; i++){
			for(int p = 0; p < gameBoard[0].length; p++){
				if(gameBoard[i][p].equals(" ")){
					return true;//Return that there is a blank space
				}
			}
		}
		return false;//If we go through the whole array and find nothing
	}
	
	public static void printGrid(String[][] gameBoard){
		for(int i = 0; i < gameBoard.length; i++){
			for(int p = 0; p < gameBoard[0].length; p++){
				System.out.print(gameBoard[i][p] + ".");//Print
			}
			System.out.println("\n------");//Return line
		}
	}
	
	public static String[][] playerTurn(String[][] gameBoard, String playerSymbol){
		Scanner userInput = new Scanner(System.in);//A scanner for user input
		Boolean isPlaceing = true;
		do{
			int row, column;
			System.out.println("Player Turn (" + playerSymbol + ")");
			System.out.println("Where would you like to go? (Column, Row) (ex, 1 3)");
			column = (userInput.nextInt()-1);
			row = (userInput.nextInt()-1);
			if(gameBoard[row][column].equals(" ")){
				isPlaceing = false;
				gameBoard[row][column] = playerSymbol;
			} else {
				System.out.println("This spot has been taken");
				printGrid(gameBoard);
			}
		}while(isPlaceing);

		return gameBoard;
	}
}
