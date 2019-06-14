package com.learning.datastructure.tree;

public class PreorderTarversal {

	public void doPreorderTraverse(Node head) {
		System.out.println(head.getData());
		doLeftTraverse(head.getLeft());
		doRightTraverse(head.getRight());
		
	}
	
	public void doLeftTraverse(Node left) {
		if(left != null) {
			doPreorderTraverse(left);
		}
	}
	
	public void doRightTraverse(Node right) {
		if(right != null) {
			doPreorderTraverse(right);
		}
	}
}
