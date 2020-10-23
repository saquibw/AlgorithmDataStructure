package com.learning.datastructure.Stack;

public class StackImpl {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < 100; i++) {
			stack.push(i);
		}
		
		for (int i = 0; i < 101; i++) {
			System.out.println(stack.pop());
		}
	}
	
	

}
