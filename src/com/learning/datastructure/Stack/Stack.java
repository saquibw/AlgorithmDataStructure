package com.learning.datastructure.Stack;

import java.util.ArrayList;
import java.util.List;

public final class Stack<T> {
	
	private static int top = 0;
	private List<T> stack;
	
	public Stack() {
		stack = new ArrayList<T>();
	}
	
	public boolean push(T element) {
		stack.add(top, element);
		incr();
		
		return true;
	}
	
	public T pop() {
		T item = null;
		if (top > 0) {
			decr();
			item = stack.get(top);
		}
		
		return item;
	}
	
	private void incr() {
		top++;
	}
	
	private void decr() {
		top--;
	}
}
