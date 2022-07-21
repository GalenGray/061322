package com.revature.arrPrac;

import java.util.Arrays;

public class ArrFull {

	/*
	 * ASSIGNMENT DUE ON MONDAY (06202022)
	Write a java program to create an array of 11 elements, In the array, do the following:
	1.	Assign value to individual array elements – random values  - Done 
	2.	Display the array using the enhanced for loop  - Done 
	3.	Calculate and display the sum of the elements of the array - Done
	4.	Display all the even numbers in the array
	5.	Display all the odd numbers in the array
	6.	Calculate and display the sum of even and odd numbers
	7.	Sort the array in descending and ascending order
	8.	Find the average of the array
	9.	Display the 3 greatest and smallest number

	 */

	//#1
	int [] arr = {12,1,19,7, 16, 5, 17, 11, 18,10,3};

	//#3
	public void sumArrs () {
		int semArr = 0;
		for(int wsemArr :arr) {
			semArr = semArr + wsemArr;
			System.out.println(semArr);
		}
	}
	
	//#2
	public  void  displayArray() {
	for(int a :arr) {
		
  System.out.println(a);
	}
	System.out.println("This array is : " + Arrays.toString(arr));
	}
	
	//#4
	public void displayEven() {
	for(int i = 0 ; i<arr.length; i++) {
		
		if(arr[i]%2 ==0) {
		System.out.println("The even numbers include : ");
		System.out.println(arr[i]);
		}
	}
	}
	//#5
	public void displayOdd() {
	for(int i = 0 ; i<arr.length; i++) {
		
		if(arr[i]%2 ==0) {
		System.out.println("The even numbers include : ");
		System.out.println(arr[i]);
		}
	}
	}
	//#6
	public void oddSum() {
		int sumOdd = 0;
		for(int i = 0; i< arr.length;++i) {
			if(arr[i]%2 !=0 ) {
				sumOdd = sumOdd + arr[i];
				
			}
		}
		System.out.println(sumOdd);
	}
	
	public void evenSum() {
		int sumEven = 0;
		for(int i = 0; i< arr.length;++i) {
			if(arr[i]%2 ==0 ) {
				sumEven = sumEven + arr[i];
				
			}
		}
		System.out.println(sumEven);
	}
	
	//#7
	public void  arrSort () {
	 //Ascending  
		Arrays.sort(arr); 
	System.out.println("The numbers in Ascendning order is : " +Arrays.toString(arr) );
	// Descending 
	StringBuilder remix = new StringBuilder();
	for(int d=arr.length; d>0; d--) {
   remix.append(arr[d-1]).append(" ");// Need space will interfere with printing! You will end up with one long line of numbers!!		
//Dont put it here! It will loop!!!	
	}
	String[] remixArr = remix.toString().split(" "); // need space will interfere with printing (will split the first number [19, 23, 11] vs [1 19 1 23 1 11]! 
	System.out.println("The numbers in Descending order is : "+ Arrays.toString(remixArr));
	}
	//#8 
	public void aveI() {
		double whole = 0;
		int i = 0;
		while(i< arr.length) {
			whole=+ arr[i];
					i++;
			}
		double wholeA = whole / arr.length;
			 System.out.println(wholeA);
	}
	//#9

	public static void main(String [] args) {
	ArrFull pt = new ArrFull();
	//#2
		pt.displayArray();
	//#3
	    pt.sumArrs();
	//#4
	pt.displayEven();	
	//#5	
	pt.displayOdd();	
	//#6
		pt.evenSum();
		pt.oddSum();
	//#7
		pt.arrSort();
	//#8
	pt.aveI();	
	//#9	
 }
}

 