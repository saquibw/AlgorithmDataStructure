package com.learning.algorithm.sort;

import java.time.LocalDateTime;

import com.learning.util.Util;

/**
 * @author saquibul
 * @Description The time complexity of selection sort algorithm is O(n^2)
 * @Steps Find the smallest number in every iteration and put it in the earliest index.
 */
public class SelectionSort {
	
	public static final int[] sort(int[] data) {
		System.out.println("Applying selection sort algorithm");
		LocalDateTime t = LocalDateTime.now();
		
		for (int i = 0; i < data.length - 1; i++) {
			int minIndex = i;
			
			for (int j = i+1; j < data.length; j++) {
				if(data[minIndex] > data[j]) {
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
				int temp = data[i];
				data[i] = data[minIndex];
				data[minIndex] = temp;
			}
		}
		Util.printTimeElapsed(t);
		return data;		
	}
}
