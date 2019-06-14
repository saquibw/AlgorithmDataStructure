package com.learning.datastructure.tree;

public class InOrderTraversal {

	public void doInorderTraverse(Node head) {
		leftTraverse(head.getLeft());
		System.out.println(head.getData());
		rightTraverse(head.getRight());
	}
	
	public void leftTraverse(Node left) {
		if(left != null) {
			doInorderTraverse(left);
		}
	}
	
	public void rightTraverse(Node right) {
		if(right != null) {
			doInorderTraverse(right);
		}
	}
}
