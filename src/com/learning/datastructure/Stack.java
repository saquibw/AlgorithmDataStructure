package com.learning.datastructure;

public class Stack {
	private static int MAX_CAPACITY = 100;
	private int top = 0;
	
	private int[] container = new int[MAX_CAPACITY];
	
	public void push(int data) {
		if(top < MAX_CAPACITY) {
			System.out.println("Data inserted at index: " + top);
			container[top] = data;
			top++;
		} else {
			System.out.println("Stack is full!");
		}
		
	}
	
	public int pop() {
		if(top == 0) {
			System.out.println("Stack is empty!");
			
			return -1;
		} else {
			top--;
			int result = container[top];
			System.out.println("Data poped from index: " + top);
			
			return result;
		}		
	}

}
