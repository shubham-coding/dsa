package tree;

class Node1{
	
	int data;
	Node1 left,right;
	
	public Node1(int data) {
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
public class LevelOrder {
	
	Node1 root = null;
	
	static int height(Node1 root) {
		
		if(root==null)
		return 0;
		
		int lheight = height(root.left);
		int rheight = height(root.right);
		
		if(lheight>rheight)
			return lheight+1;
		else
			return rheight+1;
	}
	
	static void levelOrder(Node1 root,int height) {
		// for spiral
		boolean ltr = false;
		for(int i=1;i<=height;i++) {
			printLevel(root, i,ltr);
			ltr = !ltr;
		}
	}
	
	static void printLevel(Node1 root, int level,boolean ltr) {
		
		if(root==null)
			return ;
		
		if(level==1)
			System.out.println(root.data);
		else if(level>1) {
			if(ltr) {
			printLevel(root.left, level-1,ltr);
			printLevel(root.right, level-1,ltr);
		}else {
			printLevel(root.right, level-1,ltr);
			printLevel(root.left, level-1,ltr);
		}
			}
	}
	
	public static void main(String[] a) {
		
		LevelOrder levelOrder = new LevelOrder();
		levelOrder.root = new Node1(1);
		levelOrder.root.left = new Node1(2);
		levelOrder.root.right = new Node1(3);
		levelOrder.root.left.left = new Node1(5);
		levelOrder.root.left.right= new Node1(4);
		levelOrder.root.right.right = new Node1(6);
		levelOrder.root.right.left = new Node1(7);
		
		System.out.println("height is -");
		int h=height(levelOrder.root);
		System.out.println(h);
		
		System.out.println("level order traversal -");
		levelOrder(levelOrder.root,h);
		
	}

}
 