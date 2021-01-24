package tree;

import java.util.LinkedList;
import java.util.List;

/**
 *  合并两个二叉树
 * @author Administrator
 *			
 *		Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example 1:
Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
 */
public class MergeTwoBinaryTrees {
	
	private List<Node> nodeList = null;
	
	private class Node{
		private int value;
		private Node leftNode;
		private Node rightNode;
		
		public Node(int value) {
			super();
			this.value = value;
			this.leftNode = null;
			this.rightNode = null;
			
		}
		
		
	}
	
	public Node insertTree(int[] array){
		nodeList = new LinkedList();
		for(int i = 0; i < array.length; i++){
			nodeList.add(new Node(array[i]));
		}
		
		for(int parentNode = 0; parentNode < array.length / 2 - 1; parentNode++){
			nodeList.get(parentNode).leftNode = nodeList.get(parentNode * 2 + 1);
			nodeList.get(parentNode).rightNode = nodeList.get(parentNode * 2 + 2);
		}
		
		int parentNode = array.length / 2 - 1;
		nodeList.get(parentNode).leftNode = nodeList.get(parentNode * 2 + 1);
		if(array.length % 2 == 1){
			nodeList.get(parentNode).rightNode = nodeList.get(parentNode * 2 + 2);
		}
		return nodeList.get(0);
	}
	
	public Node merge(Node nodeA, Node nodeB){
		if(nodeA == null){
			return nodeB;
		}
		if(nodeB == null){
			return nodeA;
		}
		nodeA.value += nodeB.value;
		nodeA.leftNode = merge(nodeA.leftNode, nodeB.leftNode);
		nodeA.rightNode = merge(nodeA.rightNode, nodeB.rightNode);
		return nodeA;
	}
	
	public void iterNode(Node node){
		if(node == null) return;
		iterNode(node.leftNode);
		System.out.println(node.value + " ");
		iterNode(node.rightNode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,3,2,5};
		int[] array2 = {2,1,3,4,7};
		MergeTwoBinaryTrees mtbt = new MergeTwoBinaryTrees();
		Node nodeA = mtbt.insertTree(array);
		Node nodeB = mtbt.insertTree(array2);
		nodeA = mtbt.merge(nodeA, nodeB);
		mtbt.iterNode(nodeA);
		
	}

}
