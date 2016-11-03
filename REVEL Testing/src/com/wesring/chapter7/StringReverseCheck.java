package com.wesring.chapter7;

public class StringReverseCheck {
	public static void main(String[] args){
	int[] lol = {1,2,3};
	int[] non = {3,2,1};
	if(isReverse(lol,non)){
		System.out.println("lol");
	}
}
	public static Boolean isReverse(int[] arr1, int[] arr2){
	    if (arr1.length == arr2.length){
	    for(int i = 0; i < arr1.length -1 ; i++){
	            if (arr1[i] != arr2[arr1.length - 1 - i]){
	            	return false;
	            }
	                    
	        }return true;
	        } else {return false;}    
	}
}
