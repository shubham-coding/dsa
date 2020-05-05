package LevelOrder;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	
	Node right, left;
	int data;
	
	public Node(int data) {
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
public class LevelOrderUsingQueue {
	
	Node root;
	
public static void main(String[] args) {
	LevelOrderUsingQueue level = new LevelOrderUsingQueue();
	
		
		  level.root = new Node(1); level.root.left = new Node(2); level.root.right =
		  new Node(3);
		  
		  level.root.left.left = new Node(4); level.root.left.right = new Node(5);
		  
		  level.root.right.left = new Node(6);
		  
		  level.root.right.left.right = new Node(8); level.root.right.right = new
		  Node(7); level.root.right.right.right = new Node(9);
		 
	
	
		/*
		 * level.root=new Node(1);
		 * 
		 * level.root.left=new Node(2); level.root.right=new Node(3);
		 * 
		 * level.root.left.left=new Node(4); level.root.left.right=new Node(5);
		 * 
		 * level.root.right.left=new Node(6); level.root.right.right=new Node(7);
		 * 
		 * level.root.right.right.left=new Node(8); level.root.right.right.right=new
		 * Node(9);
		 * 
		 * level.root.left.left.left=new Node(10); level.root.left.left.right=new
		 * Node(11);
		 * 
		 * level.root.left.left.left.right=new Node(12);
		 * level.root.left.left.left.right.right=new Node(13);
		 */
	
	
	printLevel(level.root);
	
}

private static void printLevel(Node root) {
	
	Queue<Node> q = new LinkedList<>();
	
	q.add(root);
	
	while(true) {
		
		int size = q.size();
		if(size==0)
			break;
		
		while(size>0) {
			
			Node temp = q.peek();
			System.out.println(temp.data);
			
			q.poll();
			
			if(null!=temp.left)
				q.add(temp.left);
			
			if(null!=temp.right)
				q.add(temp.right);
			
			size--;
		}
	}
}

}
