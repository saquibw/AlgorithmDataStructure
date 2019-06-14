package com.learning.datastructure.tree;

public class PostOrderTraversal {

	public void doPostOrderTraverse(Node main) {
		leftTraverse(main.getLeft());
		rightTraverse(main.getRight());
		System.out.println(main.getData());
	}
	
	public void leftTraverse(Node left) {
		if(left != null) {
			doPostOrderTraverse(left);
		}
	}
	
	public void rightTraverse(Node right) {
		if(right != null) {
			doPostOrderTraverse(right);
		}
	}
}
