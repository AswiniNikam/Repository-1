package com.practice;

import java.util.ArrayList;
import java.util.List;

class Node{
	int data;
	Node left;
	Node right;
	Node next;
}
class BinaryTree{
	public Node createNewNode(int val) {
		Node node=new Node();
		node.data=val;
		node.left=null;
		node.right=null;
		return node;
	}
	public void getSum(Node node) {
		if(node==null) {
			return ;
		}
		if(node.left==null && node.right==null) {
			System.out.print(node.data+" ");
		}
		getSum(node.left);
		getSum(node.right);
	}
	int maxSum=0;
	public void printPath(Node node, int sum) {
		if(node==null) {
			return;
		}
		sum=sum+node.data;
		if(node.left==null && node.right==null && sum>maxSum) {
			maxSum=sum;
		}
		else {
		printPath(node.left,sum);
		printPath(node.right,sum);
		}
	}
	public Node getParent(Node node,int val) {
		if(node==null) {
			return null;
		}
		if((node.left!=null && node.left.data==val)) {
			return node.right;
		}
		if((node.right!=null && node.right.data==val)) {
			return node.left;
		}
		Node parent=getParent(node.left, val);
		if(parent!=null) {
			return parent;
		}
		parent=getParent(node.right, val);
		return parent;
			
		
	}
	Node prev;
	Node head;
	public void convertLinkedList(Node node) {
		if(node==null) {
			return;
		}
		convertLinkedList(node.left);
		if(prev==null) {
			prev=node;
			head=node;
		}
		else {
			node.left=prev;
			prev.right=node;
			prev=node;
		}
		convertLinkedList(node.right);
	}
	public void connectNextPointerToInorderSuccessor(Node node) {
		if(node==null) {
			return;
		}
		if(prev!=null) {
			prev.next=node;
		}
		prev=node;
		connectNextPointerToInorderSuccessor(node.right);
	}
}


public class Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryTree a = new BinaryTree();
		   Node root = a.createNewNode(12);
		    root.left = a.createNewNode(7);
		    root.left.left = a.createNewNode(6);
		    root.left.right = a.createNewNode(9);
		    root.right = a.createNewNode(24);
		    
	    
	}

}
