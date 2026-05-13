package in.developer.yash.dsa.linkedlist;


public class Deletion {
	public static Node deleteAt(Node head, int node) {
		if(head == null) return null;
		
		if(node == 1) {
			return head.next;
		}
		
		int count = 0;
		Node mover = head;
		
		while(mover != null && count < node-1) {
			mover = mover.next;
			count++;
		}
		
		if(mover == null && mover.next == null) {
			return head;
		}
		
		mover.next = mover.next.next;
		
		return head;
	}
}
