package search;

class Node {
	Node left, right;
	int val;

	public Node(int data) {
		this.val = data;
		this.left = null;
		this.right = null;
	}
}

public class Search {

	Node root;

	static Node result = null;
	static Boolean flag = true;

	public static Node searchBST(Node root, int val) {
		if (root == null)
			return null;

		if (root.val == val) {
			flag = false;
			result = root;
		}

		if (flag) {
			searchBST(root.left, val);
			searchBST(root.right, val);
		}

		return result;
	}

	public static void main(String[] args) {

		Search leftView = new Search();
		/*
		 * leftView.root = new Node(1);
		 * 
		 * leftView.root.left = new Node(2); leftView.root.right = new Node(3);
		 * 
		 * leftView.root.left.left = new Node(4); leftView.root.left.right = new
		 * Node(5);
		 * 
		 * leftView.root.right.left = new Node(6); leftView.root.right.right = new
		 * Node(7);
		 * 
		 * leftView.root.right.right.left = new Node(8); leftView.root.right.right.right
		 * = new Node(9);
		 * 
		 * leftView.root.left.left.left = new Node(10); leftView.root.left.left.right =
		 * new Node(11);
		 * 
		 * leftView.root.left.left.left.right = new Node(12);
		 * leftView.root.left.left.left.right.right = new Node(13);
		 */
		
		leftView.root = new Node(4);
		
		leftView.root.left = new Node(2);
		leftView.root.right = new Node(7);
		
		leftView.root.left.left = new Node(1);
		leftView.root.left.right = new Node(3);

		System.out.println(searchBST(leftView.root, 5));

	}

}
