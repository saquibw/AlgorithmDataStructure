package com.learning.algorithm.sort;

public class SortImpl {

	public static void main(String[] args) {
		int[] numbers = {5,2,6,9,88,54,12,16,116,15,45,1,32,37,48,65};
		
		SortImpl sortImpl = new SortImpl();
		
		sortImpl.print(SelectionSort.sort(numbers));
		sortImpl.print(BubbleSort.sort(numbers));
		sortImpl.print(InsertionSort.sort(numbers));

	}
	
	private void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}

}
