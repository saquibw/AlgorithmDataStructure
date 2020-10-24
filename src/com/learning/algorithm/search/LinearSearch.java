package com.learning.algorithm.search;

/**
 * @author saquibul
 * 
 * @param <E>
 * 
 * @Description Linear search time complexity is O(n) and space complexity is O(1)
 */
public final class LinearSearch<E> {
	private E[] data;
	
	public LinearSearch(E[] data) {
		this.data = data;
	}
	
	public E search(E item) {
		E result = null;
		for (int i = 0; i < this.data.length; i++) {
			if (this.data[i].equals(item)) {
				System.out.println("Data found at index: " + i);
				result = item;
			}
		}
		if (result == null) System.out.println("Data not found!");
		return result;
	}
}
