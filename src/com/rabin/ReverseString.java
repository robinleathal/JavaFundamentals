package com.rabin;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "There are our people.";
		String revStr = "";
		char[] finalArray = str.toCharArray();
		/*
		for (int i=0; i< finalArray.length; i++) {
			System.out.println(finalArray[i]);
		}
		This block is just to check whether str is converted to char array
		*/
		for (int i = finalArray.length-1; i >=0; i--) {
			revStr = revStr + finalArray[i];
		}
		
		System.out.println(revStr);
	}

}
