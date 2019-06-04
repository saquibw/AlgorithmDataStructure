package com.learning.datastructure;

// Circular queue
public class Queue {
	private static int MAX_CAPACITY = 10;
	private int head = 0;
	private int tail = 0;
	
	int[] numbers = new int[MAX_CAPACITY];

	public void enqueue(int num) {
		int diff = tail-head;
		if(diff == -1 || diff+1==MAX_CAPACITY) {
			alertFull();
		} else {
			numbers[tail] = num;
			System.out.println("Number " + num + " enqueued at index: " + tail);
			if(tail == MAX_CAPACITY-1) {
				tail=0;
			} else {
				tail++;
			}	
		}
		
	}
	
	public int dequeue() {
		if(head == tail) {
			alertEmpty();
			return -1;
		}
		int num = numbers[head];
		System.out.println("Number " + num + " dequeued from index: " + head);
		if(head == MAX_CAPACITY-1) {
			head = 0;
		} else {
			head++;
		}
		
		
		return num;
	}
	
	private void alertFull() {
		System.out.println("Queue is full!");
	}
	
	private void alertEmpty() {
		System.out.println("Queue is empty!");
	}
}
