package com.dipak.datastructure.binarytree;

public class BinaryTree {

	private Node rootNode;

	private class Node {
		private int value;
		private Node leftChild;
		private Node rightChild;

		Node(int value) {
			this.value = value;
		}

		public String toString() {
			return "Node - " + value;
		}
	}

	public void insert(int value) {
		Node node = new Node(value);
		if (rootNode == null) {
			rootNode = node;
			rootNode.leftChild = rootNode.rightChild = null; // this line is not required
			return;
		}

		Node currentNode = rootNode;
		while (true) {
			if (value < currentNode.value) {
				if (currentNode.leftChild == null) {
					currentNode.leftChild = node;
					break;
				}
				currentNode = currentNode.leftChild;
			} else if (value > currentNode.value) {
				if (currentNode.rightChild == null) {
					currentNode.rightChild = node;
					break;
				}
				currentNode = currentNode.rightChild;
			}
		}

		// currentNode = new Node(value);
	}

	public boolean find(int value) {
		Node currentNode = rootNode;
		while (currentNode != null) {
			if (currentNode.value == value) {
				return true;
			} else if (value < currentNode.value) {
				currentNode = currentNode.leftChild;
			} else {
				currentNode = currentNode.rightChild;
			}
		}
		return false;
	}

	public void traverse() {
		// Pre Order Root, Left, right
		Node current = rootNode;
		//preOrderTraversal(current);
		levelOrderTraversal(current);
	}

	public void preOrderTraversal(Node current) {
		if (current == null) {
			return;
		}
		System.out.println(current.value);
		preOrderTraversal(current.leftChild);
		preOrderTraversal(current.rightChild);
	}
	
	public void inOrderTraversal(Node current) {
		if (current == null) {
			return;
		}
		inOrderTraversal(current.leftChild);
		System.out.println(current.value);
		inOrderTraversal(current.rightChild);
	}
	
	public void levelOrderTraversal(Node current) {
		boolean isLeftChild =false;
		boolean isRightChild =false;
		if(current == null) {
			return;
		}
		System.out.println(current.value);
		if(current.leftChild!=null) {
			isLeftChild = true;
			System.out.println(current.leftChild.value);
		}
		
		if(current.rightChild!=null) {
			isRightChild = true;
			System.out.println(current.rightChild.value);
		}
		if(isLeftChild) {
			levelOrderTraversal(current.leftChild.leftChild);
			levelOrderTraversal(current.leftChild.rightChild);	
		}
		
		if(isRightChild) {
			levelOrderTraversal(current.rightChild.leftChild);
			levelOrderTraversal(current.rightChild.rightChild);	
		}
		
	}
	
	public int findMinimum() {
		return findMinimum(rootNode);
	}
	
	private int findMinimum(Node current) {
	
		if(current.leftChild!=null) {
			return findMinimum(current.leftChild);
		}
		return current.value;
	}
	
	
	
	public void postOrderTraversal(Node current) {
		if (current == null) {
			return;
		}
		postOrderTraversal(current.leftChild);
		postOrderTraversal(current.rightChild);
		System.out.println(current.value);
	}
	
	public int calculateHeight() {
		return calculateHeight(rootNode);
	}

	public int calculateHeight(Node current) {
		if(current==null || (current.leftChild ==null && current.rightChild == null)) {
			return 0;
		}
		return 1 + Math.max(calculateHeight(current.leftChild), calculateHeight(current.rightChild));
	}
	
	public boolean isBinarySearchTree() {
		return isBinarySearchTree(rootNode);
	}
	public boolean isBinarySearchTree(Node current) {
		boolean isValid = true;
		System.out.println("Node:"+ current.value);
		if(current==null || (current.leftChild ==null && current.rightChild == null)) {
			return true;
		}
		
		if(current.leftChild!=null && current.leftChild.value > current.value) {
			return false;
		}
		
		if(current.rightChild!=null && current.rightChild.value <current.value) {
			return false;
		}
		isValid = isValid && isBinarySearchTree(current.leftChild);
		isValid = isValid && isBinarySearchTree(current.rightChild);
		return isValid;
	}
	
	public boolean equals(BinaryTree tree) {
		return equals(this.rootNode, tree.rootNode);
	}
	
	private boolean equals(Node node1, Node node2) {
		boolean isValid = true;
		if(node1 ==null || node2 == null) {
			isValid = node1==null && node2 ==null ? true:false; 
			return isValid;
		}
		
		if(node1.value != node2.value) {
			isValid = false;
		}
		
		isValid = isValid && equals(node1.leftChild, node2.leftChild);
		isValid = isValid && equals(node1.rightChild, node2.rightChild);
		return isValid;
	}
	
	
}
