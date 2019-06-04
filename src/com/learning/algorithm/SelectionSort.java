package com.learning.algorithm;

public class SelectionSort {

	public static void main(String[] args) {
		
		Integer[] numbers = {5,2,6,9,88,54,12,16,116,15,45,1,32,37,48,65};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Ineration " + i + " :");
			for(int  k=0;k<numbers.length;k++) {
				System.out.print(numbers[k] + " ");
			}
			System.out.println(" ");
			
			
			int num = numbers[i];
			int smallerIndex = 0;
			for(int j = i+1; j<numbers.length; j++) {
				if(numbers[j] < num) {
					num = numbers[j];
					smallerIndex = j;
				}
			}
			if(numbers[i] > num) {
				int temp = numbers[i];
				numbers[i] = num;
				numbers[smallerIndex]=temp;
			}
			
		}

	}

}
