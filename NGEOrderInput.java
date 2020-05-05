package practice;

import java.util.Stack;

public class NGEOrderInput {
	
	public static void main(String[] args) {
		int a[]= {4,5,2,25,25,2,4};
		int a1[] = new int[a.length];
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=a.length-1;i>=0;i--) {
			
			while(!stack.isEmpty() && stack.peek()<=a[i])
				stack.pop();
			
			if(stack.isEmpty())
				a1[i]=-1;
			else
			a1[i]=stack.peek();
			
			stack.push(a[i]);
		}
		for(int i=0;i<a1.length;i++)
		System.out.println(a1[i]);
	}

}
