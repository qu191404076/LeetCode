package tree;

import java.util.LinkedList;
import java.util.List;

public class MaximumBinaryTree {
	
	private Node root = null;
	
	public int getMax(int[] array, int start, int end){
		int maxIndex = start;
		for(int i = start; i < end; i++){
			if(array[i] > array[maxIndex]){
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	

	public Node getTree(int[] array){
		return createBinaryTree(array, 0, array.length);
	}
	
	public Node createBinaryTree(int[] array, int start, int end){
		if(start == end) return null;
		int maxIndex = getMax(array,start,end);
		root = new Node(array[maxIndex]);
		root.leftChildNode = createBinaryTree(array,start,maxIndex);
		root.rightChildNode = createBinaryTree(array,maxIndex + 1,end);
		return root;
	}
	
	private class Node{
		private int value;
		private Node leftChildNode;
		private Node rightChildNode;
		
		public Node(int value){
			this.value = value;
		}
		
		public Node(int value, Node leftChildNode, Node rightChildNode) {
			super();
			this.value = value;
			this.leftChildNode = leftChildNode;
			this.rightChildNode = rightChildNode;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,2,1,6,0,5};
		
	}

}
