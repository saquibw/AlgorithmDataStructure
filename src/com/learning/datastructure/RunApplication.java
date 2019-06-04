package com.learning.datastructure;

public class RunApplication {

	public static void main(String[] args) {
		//runStack();
		runQueue();

	}
	
	public static void runStack() {
		Stack stack = new Stack();
		for(int i = 0; i<110; i++) {
			stack.push(i);
		}
		
		for(int j=0; j<102; j++) {
			stack.pop();
		}
	}
	
	public static void runQueue() {
		Queue q = new Queue();
		
		for(int i=0; i< 20; i++) {
			int rand = (int) (Math.random() * 100);
			q.enqueue(rand);
		}
		
		for(int i=0; i< 20; i++) {
			q.dequeue();
		}
	}

}
