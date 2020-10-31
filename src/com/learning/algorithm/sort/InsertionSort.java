package com.learning.algorithm.sort;

import java.time.LocalDateTime;

import com.learning.util.Util;

/**
 * @author saquibul
 * @Description Worst case time complexity in O(n^2) and space complexity in O(1). 
 * @Steps Pick one number and check with left ones. If left ones are greater, 
 * then shift them to right and insert the number where right is greater and left is smaller.
 */
public class InsertionSort {

	public static int[] sort(int[] data) {
		System.out.println("Applying insertion sort algorithm");
		LocalDateTime t = LocalDateTime.now();
		
		for (int i = 1; i < data.length; i++) {
			int item = data[i];
			int j = i-1;
			
			while(j >= 0 && data[j] > item) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = item;
		}
		Util.printTimeElapsed(t);
		return data;
	}
}
