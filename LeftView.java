package tree;

import java.util.LinkedList;
import java.util.Queue;


class Node3{
	
	int data;
	Node3 left, right;
	
	public Node3(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class LeftView {

	Node3 root;
	static boolean again = true;

	
	static int height(Node3 root) {
		
		if(root==null)
			return 0;
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		if(lh>rh)
			return lh+1;
		else
			return rh+1;
		
	}
	
	static void leveOrder(Node3 root, int h) {
		
		
		for(int i=1;i<=h;i++) {
			printLeft(root, i,i);
			again =true;
		}
	}
	
	static void printLeft(Node3 root,int level,int maxLevel) {
	
		if(root==null)
			return;
		
		if(level==1) {
			System.out.println(root.data);
			again = false;
		}
		
		if(level>1)
		{
			if(again)
			printLeft(root.left, level-1,maxLevel);
			if(again)
			printLeft(root.right, level-1,maxLevel);
		}
	}
	public static void printQueue(Node3 root) {
		
		 Queue<Node3> q = new LinkedList<>();
		
		if(root==null)
		return ;
		
		q.add(root);
		
		
		while(true) {
			
			int size = q.size();
			if(size==0)
				break;
			
			while(size>0) {
				
				Node3 temp= q.peek();
				System.out.println(temp.data);
				
				q.poll();
				if(temp.left!=null)
					q.add(temp.left);
					if(temp.right!=null)
						q.add(temp.right);
				
					size--;
				
			}
		}
	}
	
	public static void main(String[] args) {
		LeftView leftview = new LeftView();
		leftview.root = new Node3(1);
		leftview.root.left = new Node3(2);
		leftview.root.right = new Node3(3);
		
		leftview.root.left.left = new Node3(4);
		leftview.root.left.right = new Node3(5);
		
		leftview.root.right.left = new Node3(6);
		
		leftview.root.right.left.right = new Node3(8);
		leftview.root.right.right = new Node3(7);
		leftview.root.right.right.right = new Node3(9);
	
	int h = height(leftview.root);
	
	//System.out.println(h);
	
	//leveOrder(leftview.root, h);
		printQueue(leftview.root);
	}
}
