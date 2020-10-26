package com.learning.algorithm.search;

public class BinarySearch {
	private Integer[] data;
	
	public BinarySearch(Integer[] data) {
		this.data = data;
	}

	public Integer searchWithIteration(int num) {
		int left = 0;
		int right = this.data.length - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if(this.data[mid] == num) {
				System.out.println("Item found at index: " + mid);
				return num;
			}
			
			if(num < this.data[mid]) {
				right = mid - 1;
			} else if(num > this.data[mid]) {
				left = mid + 1;
			}
		}
		
		System.out.println("Item not found!");
		return null;
	}
	
	public Integer searchWithRecursion(int left, int right, int num) {
		if(left <= right) {
			int mid = (left + right) / 2;
			if(this.data[mid] == num) {
				System.out.println("Item found using recustion at index: " + mid);
				return num;
			}
			if(num < this.data[mid]) {
				right = mid - 1;
			} else if(num > this.data[mid]) {
				left = mid + 1;
			}
			return searchWithRecursion(left, right, num);
		}
		System.out.println("Item not found!");
		return null;		
	}
}
