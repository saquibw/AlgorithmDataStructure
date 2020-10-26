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
		for (int i = 0; i < this.data.length; i++) {
			if (this.data[i].equals(item)) {
				System.out.println("Item found at index: " + i);
				return item;
			}
		}
		System.out.println("Item not found!");
		return null;
	}
}
