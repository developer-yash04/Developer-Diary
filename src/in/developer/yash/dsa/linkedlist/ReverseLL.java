package in.developer.yash.dsa.linkedlist;

import java.util.HashMap;

public class ReverseLL {
	//The Optimal approach: iterative
	public Node reverse(Node head) {
		Node prev = null, mover = head, front = head;
		
		while(mover != null) {
			front = mover.next;
			mover.next = prev;
			
			prev = mover;
			mover = front;
		}
	return prev;
	}
}
