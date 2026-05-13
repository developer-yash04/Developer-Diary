package in.developer.yash.dsa.linkedlist;

public class DeleteMiddleInLL {
	public Node deleteMiddle(ListNode head) {
		Node temp = head;
		Node prev = null; 
		Node front = temp.next;
		Node fast = head;

        if(head == null || head.next == null) return null;

        while(fast != null && fast.next != null){
            prev = temp;
            temp = temp.next;
            front = front.next;
            fast = fast.next.next;
        }
        prev.next = front;
    return head;
    }
}
