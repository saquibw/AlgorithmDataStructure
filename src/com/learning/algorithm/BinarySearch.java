package com.learning.algorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Integer[] array = {1,3,5,6,8,9,11,12,13,15,18,19,22,25,26,29,32,35,39,42,44,45,48,49,50,52,56,59,60,72,75,76,78,79,80,82,83};
		
		int startIndex = 0;
		int endIndex = array.length-1;
		
		int iteration = 1;
		
		System.out.println("Please enter the number to find: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("You entered: " + input);
		
		while (startIndex <= endIndex) {
			int midIndex = (endIndex + startIndex) / 2;
			/*if(iteration == 10) {
				return;
			}*/
			System.out.println("Interation: " + iteration);
			System.out.println("Start index: " + array[startIndex]);
			System.out.println("Mid index: " + array[midIndex]);
			System.out.println("End index: " + array[endIndex]);
			System.out.println("===============================");
			
			if(input == array[midIndex]) {
				System.out.println("Number found at index: " + midIndex);
				return;
			}
			
			if(array[midIndex] < input) {
				startIndex = midIndex+1;
			} else {
				endIndex = midIndex-1;
			}
			iteration++;
		}
		System.out.println("Number not found");
	}
	
	

}
