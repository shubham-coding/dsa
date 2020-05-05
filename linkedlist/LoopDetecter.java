package LoopDetectAndIndex;

class Node{

	Node next;
	int data;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}

public class LoopDetecter {
	
	Node head;
	
	public static boolean detectLoop(Node head) {
		
		Node slow = head;
		Node fast = head;
		
		while(fast!=null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) {
				return true;
			}
		}
		
		return false;
	}
	
	public static int loopIndex(Node head) {
		
		Node slow = head;
		Node fast = head;
		
		while(fast!=null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) {
				slow=head;	
				break;
			}
		}
			while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
			
			if(slow==fast)
				return slow.data;
			}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		LoopDetecter loop = new LoopDetecter();
		
		loop.head = new Node(1);
		loop.head.next = new Node(2);
		
		loop.head.next.next = new Node(1);
		loop.head.next.next.next = new Node(3);
		loop.head.next.next.next.next = new Node(4);
		loop.head.next.next.next.next.next = new Node(5);
		loop.head.next.next.next.next.next.next = new Node(6);
		loop.head.next.next.next.next.next.next.next = new Node(1);
		loop.head.next.next.next.next.next.next.next.next = loop.head.next.next.next;
		
		System.out.println(detectLoop(loop.head));
		
		System.out.println(loopIndex(loop.head));
		
	}

}
