package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Node2{
	int data;
	Node2 left,right;
	
	public Node2(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class VerticalLevel {

	Node2 root;
	static Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
	
	static void vertical(Node2 root,int count) {
		if(root==null)
			return ;
		
		if(map.containsKey(count))
		{
			List<Integer> value = map.get(count);
			value.add(root.data);
			Collections.sort(value);
		}else {
			List<Integer> list = new ArrayList<Integer>();
			list.add(root.data);
			Collections.sort(list);
			map.put(count, list);
		}
		
		
		vertical(root.left, count-1);
		vertical(root.right, count+1);
		
		
	}
	
	public static void main(String[] a) {
		VerticalLevel verticalLevel = new VerticalLevel();
		verticalLevel.root = new Node2(0);
		verticalLevel.root.left = new Node2(1);
		verticalLevel.root.right = new Node2(2);
		
		verticalLevel.root.left.left = new Node2(3);
		verticalLevel.root.left.left.left = new Node2(7);
		verticalLevel.root.left.left.right = new Node2(8);
		
		verticalLevel.root.left.right = new Node2(4);
		
		verticalLevel.root.left.right.left = new Node2(9);
		verticalLevel.root.left.right.left.left = new Node2(19);
		verticalLevel.root.left.right.left.right = new Node2(20);
		
		verticalLevel.root.left.right.right = new Node2(10);
		verticalLevel.root.left.right.right.left = new Node2(21);
		verticalLevel.root.left.right.right.right = new Node2(22);
		
		verticalLevel.root.right.left = new Node2(5);
		
		verticalLevel.root.right.left.left = new Node2(11);
		verticalLevel.root.right.left.left.left = new Node2(23);
		verticalLevel.root.right.left.left.right = new Node2(24);
		
		verticalLevel.root.right.left.right = new Node2(12);
		verticalLevel.root.right.left.right.left = new Node2(25);
		verticalLevel.root.right.left.right.right = new Node2(26);
		
		
		verticalLevel.root.left.left.left.left = new Node2(15);
		verticalLevel.root.left.left.left.right = new Node2(16);
		
		verticalLevel.root.right.right = new Node2(6);
		
		verticalLevel.root.right.right.left = new Node2(13);
		verticalLevel.root.right.right.left.left = new Node2(27);
		verticalLevel.root.right.right.left.right = new Node2(28);
		
		verticalLevel.root.right.right.right = new Node2(14);
		verticalLevel.root.right.right.right.left = new Node2(29);
		verticalLevel.root.right.right.right.right = new Node2(30);
		
		
		verticalLevel.root.left.left.right.left = new Node2(17);
		verticalLevel.root.left.left.right.right = new Node2(18);
		

		int count =0;
		 vertical(verticalLevel.root,count);
		
		System.out.println(map);
		//bottom view
		for(Map.Entry<Integer, List<Integer>> values:map.entrySet()) {
			System.out.print(values.getValue().get(values.getValue().size()-1)+ " ");
		}
	}
}
