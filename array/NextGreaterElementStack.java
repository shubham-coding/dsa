package practice;

import java.util.Stack;

public class NextGreaterElementStack {
	
	public static void main(String[] ar) {
	
		int a[]= {5,3,2,10,6,8,1,4,12,7,21};
	
		Stack<Integer> stack = new Stack<Integer>();
	
		stack.push(a[0]);
		
		for(int i=1;i<a.length;i++) {
			while(!stack.isEmpty()) {
			if(a[i]>stack.peek()) {
				System.out.println(stack.peek()+"---->"+a[i]);
				stack.pop();
			}else {
				stack.push(a[i]);
				break;
			}
			}
			
			if(stack.isEmpty()) {
				stack.push(a[i]);
			}
		
		
		}
		
		if(!stack.isEmpty()) {
			for(int i=0;i<stack.size();i++) {
				System.out.println(stack.get(i)+"--->"+"-1");
			}
		}
	
	}

}
