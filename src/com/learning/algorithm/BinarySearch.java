package com.learning.algorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Integer[] array = {1,3,5,6,8,9,11,12,13,15,18,19,22,25,26,29,32,35,39,42,44,45,48,49,50,52,56,59,60,72,75,76,78,79,80,82,83};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number: ");
		int num = sc.nextInt();
		System.out.println("Input number: " + num);
		
		int left = 0;
		int right = array.length-1;
		
		
		//System.out.println("Initial mid: " + mid);
		
		while(left <= right) {
			int mid = (left + right)/2;
			System.out.println("Middle number: " + array[mid]);
			if(array[mid] == num) {
				System.out.println("The number found at index " + mid);
				return;
			}
			
			if(num > array[mid]) {
				left = mid+1;
			} else {
				right = mid-1;
			}			
		}
	System.out.println("Number not found!");
	return;
	
	}
}
