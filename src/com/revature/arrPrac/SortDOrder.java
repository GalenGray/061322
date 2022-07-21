package com.revature.arrPrac;

import java.util.Arrays;
import java.util.Collections;

public class SortDOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {12,10,17,2,1,8,15,19,13,20,7};
		Arrays.sort(arr,Collections.reverseOrder());
		 System.out.println("Descending : " + Arrays.toString(arr));
	}

}
