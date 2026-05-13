package in.developer.yash.dsa.linkedlist;


public class MiddleOfLL {
	
	public Node middleOfLL(Node head) {
		//We'll be using the Tortoise & Hare algorithm
		Node slow = head, fast = head;
		
		while(fast.next != null && fast != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
	return slow;
	}
	
}
