package com.learning.algorithm;

public class InsertionSort {

	public static void main(String[] args) {
		Integer[] numbers = {5,2,6,9,88,54,12,16,116,15,45,1,32,37,48,65};

		int temp;

		for(int i = 0; i < (numbers.length)-1; i++) {
			int j = i+1;
			temp = numbers[j];

			while(j>0) {
				j--;
				if(temp < numbers[j]) {
					numbers[j+1] = numbers[j];
				} else {
					if(numbers[j+1] != temp) {
						numbers[j+1] = temp;
					}
					break;
				}
				numbers[j] = temp;
			}
			
			for(int  k=0;k<numbers.length;k++) {
				System.out.print(numbers[k] + " ");
			}
			System.out.println(" ");
		}

	}

}
