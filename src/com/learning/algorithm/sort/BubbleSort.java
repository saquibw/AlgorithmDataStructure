package com.learning.algorithm.sort;

public class BubbleSort {
	public static final int[] sort(int[] data) {
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
