package com.learning.algorithm.sort;


/**
 * @author saquibul
 * @Description The time complexity of Bubble sort algorithm is O(n^2) and space complexity is O(1)
 * @Steps Move bigger numbers to end of array just like a bubble in every iteration.
 */
public class BubbleSort {
	public static final int[] sort(int[] data) {
		System.out.println("Applying bubble sort algorithm");
		int len = data.length;
		
		while(len > 0) {
			for (int i = 0; i < len-1; i++) {
				if(data[i] > data[i+1]) {
					int temp = data[i+1];
					data[i+1] = data[i];
					data[i] = temp;
				}
			}
			len--;
		}
		return data;
	}
}
