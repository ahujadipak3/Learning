package com.dipak.datastructure.binarytree;

public class BinaryTreeExample {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		/*
		 * 					7
		 * 			4				9
		 * 		1		6		8		10
		 */
		tree.insert(7);
		tree.insert(4);
		tree.insert(9);
		tree.insert(1);
		tree.insert(6);
		tree.insert(8);
		tree.insert(10);
		tree.insert(11);
//		tree.insert(13);
		//System.out.println(tree.find(1));
		
		//tree.traverse();
		System.out.println(tree.findMinimum());
		
		//System.out.println(tree.calculateHeight());
		//System.out.println(tree.isBinarySearchTree());
		
		BinaryTree tree1 = new BinaryTree();
		tree1.insert(7);
		tree1.insert(4);
		tree1.insert(9);
		tree1.insert(1);
		tree1.insert(6);
		tree1.insert(8);
		tree1.insert(10);
		
		System.out.println(tree.equals(tree1));
	}
}
