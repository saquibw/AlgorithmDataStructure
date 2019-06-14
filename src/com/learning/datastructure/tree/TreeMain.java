package com.learning.datastructure.tree;

public class TreeMain {

	public static void main(String[] args) {
		TreeMain main = new TreeMain();
		
		Node head = main.createNode(15);
		
		Node six = main.createNode(6);
		Node five = main.createNode(5);
		Node eighteen = main.createNode(18);
		Node fourteen = main.createNode(14);
		Node seven = main.createNode(7);
		Node two = main.createNode(2);
		Node nine = main.createNode(9);
		Node three = main.createNode(3);
		Node one = main.createNode(1);
		Node nineteen = main.createNode(19);
		Node thirteen = main.createNode(13);
		Node twelve = main.createNode(12);
		Node ten = main.createNode(10);
		Node twentyOne = main.createNode(21);
		Node eleven = main.createNode(11);
		Node seventeen = main.createNode(17);
		Node twentyFive = main.createNode(25);
		Node twentyEight = main.createNode(28);
		
		head.setLeft(six);
		head.setRight(nineteen);
		six.setLeft(five);
		six.setRight(eighteen);
		five.setLeft(fourteen);
		five.setRight(seven);
		fourteen.setLeft(nine);
		fourteen.setRight(three);
		seven.setRight(one);
		eighteen.setLeft(two);
		nineteen.setLeft(thirteen);
		nineteen.setRight(twelve);
		twelve.setLeft(ten);
		twelve.setRight(twentyOne);
		ten.setLeft(eleven);
		twentyOne.setRight(seventeen);
		eleven.setLeft(twentyFive);
		eleven.setRight(twentyEight);	
		
		PreorderTarversal pre = new PreorderTarversal();
		//pre.doPreorderTraverse(head);
		
		PostOrderTraversal post = new PostOrderTraversal();
		//post.doPostOrderTraverse(head);
		
		InOrderTraversal in = new InOrderTraversal();
		in.doInorderTraverse(head);

	}
	
	public Node createNode(int item) {
		Node node = new Node();
		
		node.setData(item);
		node.setLeft(null);
		node.setRight(null);
		
		return node;
	}

}
