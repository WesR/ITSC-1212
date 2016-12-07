package com.wesring.lecturework4;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Wes Ring 
 * @Version 0.0.1
 * @Date 12/6/2016
 * 
 */

public class Assignment4 {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);//A scanner for user input
		Random r = new Random();//To generate random numbers
		Boolean mainLoop = true;//To exit the menu
		int userBookID;//The book's  ID
		int userBookIndex;//Where it is in the array
				
		//All the book data
		String[] bookTitle = {"Starting out with Java", "Java Programming", "Software Structures", "Design and Analysis of Algorithms", "Computer Graphics", "Artificial Intelligence: A Modern Approach", "Probability and Statistics", "Cognitive Science", "Modern Information Retrieval", "Speech and Language Processing"};
		int[] bookID = {1101, 1211, 1333, 1456, 1567, 1642, 1699, 1755, 1800, 1999};
		double[] bookPrice = {112.32, 73.25, 54.00, 67.32, 135.00, 173.22, 120.00, 42.25, 32.11, 123.75};

		int[] userRand = new int[1000];//Define
		
		do{
			System.out.println("Main Menu (1/2/3/4/5)");//Main menu
			System.out.println("1) Linear Search ");
			System.out.println("2) Binary Search");
			System.out.println("3) Bubble Sort");
			System.out.println("4) Selection Sort");
			System.out.println("5) Quit");
			
			switch(userInput.nextInt()){
			case 1://linear search
				displayBookData(bookTitle, bookID, bookPrice);
				System.out.println("Please enter the book ID you would like to buy: ");//Get the book ID
				userBookID = userInput.nextInt();
				userBookIndex = linearSearch(bookID, userBookID);//Find the book
				if(userBookIndex == -1){System.out.println("Sorry that book was not found"); break;}//If the book is not found
				System.out.println("Your book has been found!");
				System.out.println(String.format("%-10s", bookID[userBookIndex]) + String.format("%-45s", bookTitle[userBookIndex]) + String.format("%-5s", bookPrice[userBookIndex]));//Output the book stats
				System.out.println("How many would you like to buy for $" + bookPrice[userBookIndex] + "?");//Ask for the buy count
				System.out.println("The total cost of your purchase is $" + userInput.nextInt() * bookPrice[userBookIndex]);//Output the total
				System.out.println();
				break;
			case 2://Binary search
				displayBookData(bookTitle, bookID, bookPrice);
				System.out.println("Please enter the book ID you would like to buy: ");//Get the book ID
				userBookID = userInput.nextInt();
				userBookIndex = binarySearch(bookID, userBookID);//Find the book
				if(userBookIndex == -1){System.out.println("Sorry that book was not found"); break;}
				System.out.println("Your book has been found!");
				System.out.println(String.format("%-10s", bookID[userBookIndex]) + String.format("%-45s", bookTitle[userBookIndex]) + String.format("%-5s", bookPrice[userBookIndex]));//Output the book stats
				System.out.println("How many would you like to buy for $" + bookPrice[userBookIndex] + "?");//Ask for the buy count
				System.out.println("The total cost of your purchase is $" + userInput.nextInt() * bookPrice[userBookIndex]);//Output the total
				System.out.println();
				break;
			case 3://Bubble sort
				for(int i = 0; i < 1000; i++){//fill the 1000 random numbers
					userRand[i] = r.nextInt(500);
				}
				
				System.out.println("Un-sorted:");
				displayArray(userRand);//Display the array
				System.out.println("Sorted:");
				userRand = bubbleSort(userRand);//bubble sort the array
				break;
			case 4://Selection sort
				for(int i = 0; i < 1000; i++){//fill the 1000 random numbers
					userRand[i] = r.nextInt(500);
				}
				
				System.out.println("Un-sorted:");
				displayArray(userRand);//Display the array
				System.out.println("Sorted:");
				userRand = selectionSort(userRand);//bubble sort the array
				break;
			case 5://Exit
				mainLoop = false;
				break;
			default:
				System.out.println("Error - Incorrect input");//incorrect input
				break;
					
			}
			
		}while(mainLoop);
		System.out.println("Goodbye");//Goodbye
	}

	private static int[] selectionSort(int[] userRand) {
		long tStart = System.currentTimeMillis();//Start timer
		int min = 0;

	    for(int i = 0; i < userRand.length; i++){
	        for(int k = i + 1; k < userRand.length; k++){
	            if(userRand[k] < userRand[min]){//Find the min
	            	min = k;
	            }
	        }
			
	        int temp = userRand[i];//Do the flips
	        userRand[i] = userRand[min];
	        userRand[min] = temp;
	    }
	    long tEnd = System.currentTimeMillis();//end time
	    displayArray(userRand);//Display the array
	    System.out.println("Time taken: " + ((tEnd - tStart) / 1000.00));//Caculate the time
		return userRand;
	}

	private static int[] bubbleSort(int[] userRand) {
		long tStart = System.currentTimeMillis();//Start timer
	    int temp = 0;

	    for (int i = 0; i < userRand.length; i++) {
	        for (int k = 1; k < (userRand.length - i); k++) {
	            if (userRand[k - 1] > userRand[k]) {//Flip the ints
	                temp = userRand[k - 1];
	                userRand[k - 1] = userRand[k];
	                userRand[k] = temp;
	            }

	        }
	    }
	    long tEnd = System.currentTimeMillis();//end time
	    displayArray(userRand);//Display the array
	    System.out.println("Time taken: " + ((tEnd - tStart) / 1000.00));//Caculate the time
	    return userRand;
	}

	private static void displayArray(int[] userRand) {
		System.out.println();//Space
		for(int i = 0; i < userRand.length; i++){
			System.out.print(String.format("%-4s", userRand[i]));//Output the ints
			if(((i+1)%20) == 0){System.out.println();}//So we have rows
		}
		System.out.println();//Space
	}

	private static int binarySearch(int[] bookID, int userBookID) {
		long tStart = System.currentTimeMillis();//Start timer
		int low = 0;
		int middle = 0;
		int high = bookID.length-1;
		
		while(low <= high){
			middle = (low+high) / 2; //get the middle
			 if ( userBookID > bookID[middle]){//if uid is greater
			        low = middle +1;
			      } else if (userBookID < bookID[middle]){//if uid is less
			        high = middle -1;
			      } else {//if uid is just right
			    	  long tEnd = System.currentTimeMillis();//end time
			        return middle;//return thte index
			      }
		}
		long tEnd = System.currentTimeMillis();//end time
	    System.out.println("Time taken: " + ((tEnd - tStart) / 1000.00));//Caculate the time
		return -1;
	}

	private static int linearSearch(int[] bookID, int userBookID) {//Finds the book ID, if not returns -1
		long tStart = System.currentTimeMillis();//Start timer
		int bookIndex = -1;
		for(int i = 0; i < bookID.length; i++){//look through all ints
			if(bookID[i] == userBookID){
				bookIndex = i;
			}
		}
		long tEnd = System.currentTimeMillis();//end time
	    System.out.println("Time taken: " + ((tEnd - tStart) / 1000.00));//Caculate the time
		return bookIndex;
	}

	private static void displayBookData(String[] bookTitle, int[] bookID, double[] bookPrice) {
		System.out.println("Library");
		
		for(int i = 0; i < bookTitle.length; i++){//Prints every item, with padding
			System.out.println(String.format("%-10s", bookID[i]) + String.format("%-45s", bookTitle[i]) + String.format("%-5s", bookPrice[i]));
		}
		
	}
}
