package tree;
class Node4{
	int data;
	Node4 left, right;
	
	public Node4(int data) {
		this.data= data;
		this.left=null;
		this.right=null;
	}
}
public class LeastCommonAncester {

	Node4 root;
	static int lca;
	
	static int lca(Node4 root,int a, int b) {
		
		if(root==null)
			return 0;
		
		if(root.data ==a  || root.data ==b)
			return root.data;
		
		
		int left =lca(root.left, a, b);
		int right = lca(root.right, a, b);
		
		if(left!=0 &&right!=0)
			return root.data;
		
		else
		{
			if(left!=0)
				return left;
			else return right;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		LeastCommonAncester ancester = new LeastCommonAncester();
		ancester.root = new Node4(1);
		ancester.root.left = new Node4(2);
		ancester.root.left.left = new Node4(4);
		ancester.root.left.left.left = new Node4(8);
		ancester.root.left.left.right = new Node4(9);
		ancester.root.left.left.right.left = new Node4(17);
		ancester.root.left.left.right.right = new Node4(18);
		
		ancester.root.left.right = new Node4(5);
		ancester.root.left.right.left = new Node4(10);
		ancester.root.left.right.right = new Node4(11);
		
		ancester.root.right = new Node4(3);
		ancester.root.right.left = new Node4(6);
		ancester.root.right.left.left = new Node4(12);
		ancester.root.right.left.right = new Node4(13);
		
		ancester.root.right.right = new Node4(7);
		ancester.root.right.right.right = new Node4(14);
		ancester.root.right.right.right.left = new Node4(15);
		ancester.root.right.right.right.right = new Node4(16);
	
	
	int l = lca(ancester.root,17,16);
	System.out.println(l);
	}
}
