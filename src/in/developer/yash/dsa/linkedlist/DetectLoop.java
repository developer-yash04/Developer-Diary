package in.developer.yash.dsa.linkedlist;

import java.util.HashMap;

public class DetectLoop {
	//Detect Loop with Hashmaps(Brute Force)
	public Node reverseLL(Node head) {
		HashMap<Node,Integer> map = new HashMap<>();
		Node temp = head;
		int count = 0;
		while(temp != null) {
			map.put(temp, count++);
			if(map.containsKey(temp) ) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
}
