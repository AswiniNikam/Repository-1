package com.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Node{
	int data;
	Node left;
	Node right;
}
class BST{
	public Node insert(Node node, int val) {
		if(node==null) {
			return createNewNode(val);
		}
		if(val<node.data) {
			node.left=insert(node.left, val);
		}
		else if(val>node.data){
			node.right=insert(node.right, val);
		}
		return node;
	}
	public Node createNewNode(int val) {
		Node node=new Node();
		node.data=val;
		node.left=null;
		node.right=null;
		return node;
	}
	public boolean checkIfPresent(Node node, int val) {
		if(node==null) {
			return false;
		}
		while(node!=null) {
			if(val<node.data) {
				node=node.left;
			}
			else if(val>node.data) {
				node=node.right;
			}else {
				return true;
			}
		}
		return false;
	}
	public Node getParent(Node node, int val) {
		if(node==null || node.data==val) {
			return null;
		}
		Node parent=null;
		while(node!=null) {
			if(val<node.data) {
				parent=node;
				node=node.left;
			}
			else if(val>node.data) {
				parent=node;
				node=node.right;
			}else {
				return parent;
			}
		}
		return null;
	}
	public void getSiblings(Node node, int val) {
		Node parent=null;
		while(node!=null) {
			if(val<node.data) {
				parent=node;
				node=node.left;
			}
			else if(val>node.data) {
				parent=node;
				node=node.right;
			}
			else {
				break;
			}
		}
		if(parent.left.data==val) {
			System.out.println(parent.right.data);
		}
		if(parent.right.data==val) {
			System.out.println(parent.left.data);
		}
	}
	public Node getInorderSuccessor(Node node, int val) {
		Node parent=null;
		while(node!=null) {
			if(val<node.data) {
				parent=node;
				node=node.left;
			}
			else if(val>node.data) {
				node=node.right;
			}
			else {
				if(node.right!=null) {
					node=node.right;
					parent=getSuccessor(node);
				}
			}
		}
		return parent;
		
	}
	public Node getSuccessor(Node node) {
		while(node.left!=null) {
			node=node.left;
		}
		return node;
	}
	public int getDifference(Node node) {
		if(node==null) {
			return 0;
		}
		return node.data-getDifference(node.left)-getDifference(node.right);
	}
	public Node getAnscestor(Node node, int val1, int val2) {
		while(node!=null) {
			if(val1<node.data && val2<node.data) {
				node=node.left;
			}
			else if(val1>node.data && val2>node.data) {
				node=node.right;
			}
			else {
				return node;
			}
		}
		return node;
	}
	public void bulildFromBSTPost() {
		int[] arr={2, 5, 9, 8, 4, 12, 20, 15, 10};
		buildTree(arr, 0, arr.length-1);
		
	}
	public void bulildFromBSTPre() {
		int[] arr = {10, 4, 2, 8, 5, 9, 15, 12, 20};
		buildTreePre(arr, 0, arr.length-1);
		
	}
	public Node buildTreePre(int[] arr, int start, int end) {
		if(start>end) {
			return null;
		}
		Node node=createNewNode(arr[start++]);
		int i=0;
		for(i=start+1;i<=end;i++) {
			if(arr[i]>node.data) {
				break;
			}
		}
		node.left=buildTreePre(arr, start+1, i-1);
		node.right=buildTreePre(arr, i, end);
		return node;
	}
	public Node buildTree(int[] arr, int start, int end) {
		if(start>end) {
			return null;
		}
		Node node=createNewNode(arr[end--]);
		int i=0;
		for(i=end-1;i>=start;i--) {
			if(arr[i]<node.data) {
				break;
			}
		}
		node.left=buildTree(arr, start, i);
		node.right=buildTree(arr, i+1, end-1);
		return node;
	}
	public Node getClosestValue(Node node, int val) {
		if(node==null) {
			return null;
		}
		int minDiff=Integer.MAX_VALUE;
		Node closestNode=null;
		while(node!=null) {
			int diff=Math.abs(node.data-val);
			if(minDiff>diff) {
				minDiff=diff;
				closestNode=node;
			}
			if(val<node.data) {
				node=node.left;
			}
			else if(val>node.data) {
				node=node.right;
			}
		}
		return closestNode;
	}
	List<Integer> list=new ArrayList<>();
	List<List<Integer>> ans= new ArrayList<>();
	public void printKPathEqualToSum(Node node,int sum) {
		if(node==null) {
			return;
		}
		list.add(node.data);
		if(node.left==null && node.right==null) {
			ans.add(new ArrayList<>(list));
		}else {
		printKPathEqualToSum(node.left, sum);
		printKPathEqualToSum(node.right, sum);
		}
		int total=0;
		for(int i=list.size()-1;i>=0;i--) {
			total=total+list.get(i);
			if(total==sum) {
				for(int j=i;j<list.size();j++) {
					System.out.print(list.get(j)+" ");
				}
				System.out.println();
			}
		}
		
		list.remove(list.size()-1);
	}

}

public class CreateBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST a = new BST();

	    Node root = a.createNewNode(2);
	    root.left = a.createNewNode(4);
	    root.left.left = a.createNewNode(1);
	    root.left.right = a.createNewNode(6);
	    root.right = a.createNewNode(5);
	    root.right.right = a.createNewNode(7);

	    a.printKPathEqualToSum(root, 6);
	    System.out.println(a.ans);

		
		
	   
	}

}
