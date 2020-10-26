package com.learning.algorithm.search;

import java.util.Scanner;

public class SearchImpl {

	public static void main(String[] args) {
		Integer[] array = {1,3,5,6,8,9,11,12,13,15,18,19,22,25,26,29,32,35,39,42,44,45,48,49,50,52,56,59,60,72,75,76,78,79,80,82,83};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select: 1 - Linear Search, 2 - Binary Search");
		int selection = sc.nextInt();
		
		if (selection == 1) {
			System.out.println("Linear search mode selected");
			System.out.println("Please select a number to search:");
			
			int num = sc.nextInt();
			System.out.println("Input number: " + num);
			
			LinearSearch<Integer> ls = new LinearSearch<>(array);
			System.out.println(ls.search(num));
		} else if (selection == 2) {
			System.out.println("Binary search mode selected");
			System.out.println("Please select a number to search:");
			
			int num = sc.nextInt();
			System.out.println("Input number: " + num);
			
			BinarySearch bs = new BinarySearch(array);
			System.out.println(bs.searchWithIteration(num));
			System.out.println(bs.searchWithRecursion(0, array.length-1, num));
		} else {
			System.out.println("Wrong input!");
		}
		
		sc.close();
		
		

	}

}
