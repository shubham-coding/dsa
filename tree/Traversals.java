package tree;

class Node{
	
	int data;
	Node left, right;
	
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class Traversals {

	Node root;
	
	static void preOrder(Node root) {
		
		if(root==null)
			return;
		
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void inOrder(Node root) {
		
		if(root==null)
			return;
		
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
		
	}
	
	static void postOrder(Node root) {
		
		if(root==null)
			return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	
	public static void main(String[] args) {
		
		Traversals traversals = new Traversals();
		traversals.root= new Node(1);
		traversals.root.left = new Node(2);
		traversals.root.right = new Node(3);
		traversals.root.left.left = new Node(4);
		traversals.root.left.right = new Node(5);
		
		System.out.println("pre order traversals -");
		preOrder(traversals.root);
		
		System.out.println("in order traversals -");
		inOrder(traversals.root);
		
		System.out.println("post order traversals -");
		postOrder(traversals.root);
	}
}
