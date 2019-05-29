package com.learning.algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] numbers = {5,2,6,9,88,54,12,16,116,15,45,1,32,37,48,65};
		
		int length = numbers.length;
		for(int i=0; i<length; i++) {
			//int min_index = 0;
			for(int j=0; j<length-i -1; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
				
			}
			/*for(int k=0; k < numbers.length; k++) {
				System.out.print(numbers[k] + " ");
			}
			System.out.println("");*/
		}
	}

}
