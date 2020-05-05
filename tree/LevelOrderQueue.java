package tree;

import java.util.LinkedList;
import java.util.Queue;

class NodeQeue{
	
	int data;
	 NodeQeue left, right ;
	 
	 public NodeQeue(int data) {
		 this.data = data;
		 this.left = null;
		 this.right = null;
	 }
}
public class LevelOrderQueue {
	
	NodeQeue root;
	
	
	static void printLevel( NodeQeue root) {
		
		
		Queue<NodeQeue> q = new LinkedList<NodeQeue>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			NodeQeue temp = q.poll();
		
		System.out.println(temp.data);
		}
	//	if(null!=temp.left) {
			//q.add(root.left);
			printLevel(root.left);
		//}
		//if(null!=temp.right)
			printLevel(root.right);
			//q.add(root.right);
			
		
		//}
	}

	public static void main(String[] args) {
		
		
		LevelOrderQueue levelQueue = new LevelOrderQueue();
		levelQueue.root = new NodeQeue(1);
		levelQueue.root.left = new NodeQeue(2);
		levelQueue.root.right = new NodeQeue(3);
		levelQueue.root.left.left = new NodeQeue(4);
		levelQueue.root.left.right = new NodeQeue(5);
		levelQueue.root.right.left = new NodeQeue(6);
		levelQueue.root.right.right = new NodeQeue(7);
		levelQueue.root.right.right.right = new NodeQeue(8);
		levelQueue.root.right.right.right.left = new NodeQeue(9);
		
		printLevel(levelQueue.root);
	}
}
