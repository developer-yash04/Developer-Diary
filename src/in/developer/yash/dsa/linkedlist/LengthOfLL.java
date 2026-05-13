package in.developer.yash.dsa.linkedlist;

import java.util.HashMap;

public class LengthOfLL {
	public int LengthOfLL(Node head) {
		int count = 0;
		Node temp = head;
		
		HashMap<Node, Integer> map = new HashMap<>();
		while(temp != null) {
			map.put(temp, (map.containsKey(temp)) ? temp.data - count: count++);	
			temp = temp.next;
		}
		return count;
	}
}
