package practice;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int a[]= {7,10,20,65,-18,7,4,3};
		
		int k=3;
		
		Deque<Integer> deque = new LinkedList<Integer>();
		
		deque.push(a[0]);
		int start=0;
		int end=0;
		for(int i=1;i<a.length;i++) {
				
			if(a[i]>deque.peek()) {
				deque.pop();
				deque.addFirst(a[i]);
				start=i;
			}else {
				if(deque.getLast()<a[i])
					deque.removeLast();
				deque.addLast(a[i]);
				end=i;
			}
			
			if(deque.size()>1)
			{
				int diff=end-start;
				if(k<=diff)
					deque.pop();
				for(int j=start+1;j<=end;j++) {
					if(deque.peek()==a[j]) {
						start=j;
					break;
					}
				}
			}
			System.out.println(deque.peek());
		}
	}
}
