package com.learning.algorithm.sort;


/**
 * @author saquibul
 * @Description The time complexity of selection sort algorithm is O(n^2)
 * @Steps Find the smallest number in every iteration and put it in the early indexes.
 */
public class SelectionSort {
	
	public static final int[] sort(int[] data) {
		System.out.println("Applying selection sort algorithm");
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
		return data;		
	}
}
