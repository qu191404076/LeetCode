package interview;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MagicCoin {
	
	private static Node rootNode = null;
	private static int[] array = null;
	private static List<Node> nodeList = null;
	
	private class Node{
		private int value;
		private Node leftChildNode;
		private Node rightChildNode;
		
		public Node(int value) {
			this.value = value;
		}
		
	}
	
	private void getNodeTree(){
		System.out.println("输入要获得的魔法币:");
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		nodeList = new LinkedList();
		array = new int[Integer.valueOf(scanner.next()) + 1];
		array[0] = 0;
		nodeList.add(new Node(array[0]));
		for(int i = 1; i < array.length; i++){
			array[i] = i;
			nodeList.add(new Node(array[i]));
		}
		
		
		
		for(int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++){
			nodeList.get(parentIndex).leftChildNode = nodeList.get(parentIndex * 2 + 1);
			nodeList.get(parentIndex).rightChildNode = nodeList.get(parentIndex * 2 + 2);
		}
		
		int lastParentIndex = array.length / 2 - 1;
		nodeList.get(lastParentIndex).leftChildNode = nodeList.get(2 * lastParentIndex + 1);
		if(array.length % 2 == 1){
			nodeList.get(lastParentIndex).rightChildNode = nodeList.get(2 * lastParentIndex + 2);
		}
	}
	
	private void preNode(Node node,int i){
		if(node.value == i){
			System.out.println(node.value);
		}
		preNode(node.leftChildNode,i);
		preNode(node.rightChildNode,i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicCoin mc = new MagicCoin();
		mc.getNodeTree();
		rootNode = nodeList.get(0);
		mc.preNode(rootNode, 10);
	}

}
