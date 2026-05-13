package in.developer.yash.dsa.linkedlist;


public class reverseLLWithRecursion {
	public Node reverseLLWithRecursion(Node head) {
		if(head == null || head.next == null) return head;
		
		Node newHead = reverseLLWithRecursion(head.next);
		Node front = head.next;
		head.next = null;
		
	return newHead;
	}
}
