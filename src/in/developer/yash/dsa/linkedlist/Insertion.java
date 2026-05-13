package in.developer.yash.dsa.linkedlist;


public class Insertion {
	public static Node insertAt(Node head, int node, int val) {
		
		if(head == null) return new Node(val);
		
		if(head.next == null) {
			Node newNode = new Node(val);
			head.next = newNode;
			return head;
		}
		
		int count = 0;
		Node mover = head;
		Node prev = null;
		Node newNode = new Node(val);
			
		while(mover != null) {
			count += 1;
			if(count-1 == node) {
				prev.next = newNode;
				newNode.next = mover;
				return head;
			}
			prev = mover;
			mover = mover.next;
		}
		
		return head;
	}
	
}
