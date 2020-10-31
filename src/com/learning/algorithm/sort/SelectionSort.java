package com.learning.algorithm.sort;


/**
 * @author saquibul
 * @Description The complexity of selection sort algorithm is O(n^2)
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
