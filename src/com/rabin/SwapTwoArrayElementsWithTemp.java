package com.rabin;

public class SwapTwoArrayElementsWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 5, 6};
		int[] arr2 = { 7,8,9};
		int temp;
		//Before swaping
		for (int i =0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for (int j =0; j<arr2.length; j++) {
			System.out.print(arr2[j]);
		}
		System.out.println();
		for (int i =0; i< arr1.length; i++) {
//			for (int j=0; j< arr2.length; j++) {
//				temp = arr1[i];
//				arr1[i] = arr2[j];
//				arr2[j] = temp;
//				
//			}
			arr1[i] = arr1[i]+arr2[i];
			arr2[i] = arr1[i]-arr2[i];
			arr1[i] = arr1[i]-arr2[i];
		}
		//After swaping
		for (int i =0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for (int j =0; j<arr2.length; j++) {
			System.out.print(arr2[j]);
		}
	}

}
