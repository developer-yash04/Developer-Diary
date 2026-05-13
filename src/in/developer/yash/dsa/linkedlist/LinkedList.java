package in.developer.yash.dsa.linkedlist;

public class LinkedList {
	
	private static Node tail;
	private static Node head;
	
	public Node add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			return head;
		}
		tail.next = newNode;
		tail = newNode;
		return newNode;
	}

	//Print the LL from the given array
	public void printLL(Node node) {
		Node mover = node;
		
		while(mover != null) {
			System.out.print(mover.data + " ");
			mover = mover.next;
		}
	}

	//Construct the LL from the given array
	public Node constructLL(int[] arr) {
		if (arr.length == 0) return null;
        Node node = new Node(arr[0]);
        	Node mover = node;
			for(int i = 1; i< arr.length; i++) {
				Node temp = new Node(arr[i]); 		//Converted the array elements into Nodes
				mover.next = temp;					//Linked to the node ahead
				mover = temp;						//moved the pointer(mover) ahead
			}
		return node;
	}
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
        int []arr = {12,3,6,5,4};
        Node head = ll.constructLL(arr);
        System.out.println("Before Insertion: ");
		ll.printLL(head);
		
		System.out.println();
		
		System.out.println("After Insertion: ");
		head = Insertion.insertAt(head, 1, 9);
		ll.printLL(head);
		
		System.out.println();
		
		System.out.println("After Deletion");
		head = Deletion.deleteAt(head, 3);
		ll.printLL(head);
		
		System.out.println();
		
		System.out.println("Deleting the last Node");
		head = Deletion.deleteAt(head, 1);
		ll.printLL(head);
	}

}
