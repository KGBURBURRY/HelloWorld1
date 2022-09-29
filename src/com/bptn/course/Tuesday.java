package com.bptn.course;

import java.lang.reflect.Array;

public class Tuesday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = { 5, 1, 12, -5, 16, 2, 12, 14};
		
		for (int i = 0; i < arr.length -1; i++);
		
		int index = i;	
		
		for (int j = i + 1; j < arr.length; j++) {
			
			if (arr[j] < arr [index]) {
				index = j;
			}
			
		}
		
	}

}
