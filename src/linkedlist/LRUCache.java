/**
 * 
 */
package linkedlist;

import java.util.HashMap;

/**
 * @author nadjriya
 *
 */
public class LRUCache {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	HashMap<Integer, Node> map;

	int capicity = 0;
	Node head;
	Node tail;

	LRUCache(int cap) {
		// Intialize the cache capacity with the given
		// cap
		map = new HashMap<>(cap);
		capicity = cap;
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.prev = head;

	}

	// This method works in O(1)
	public int get(int key) {

		return map.get(key).data;
	}

	// This method works in O(1)
	public void set(int key, int value) {

		Node r = map.get(key);
		if (r == null) {
			r = new Node(value);
			if (map.size() == capicity) {
				map.remove(tail.key);
				if (tail.prev != null)
					tail.prev.next = null;
				tail = tail.prev;

			}
			r.next = head.next;
			head = r;

		} else {
			if (r.next != null)
				r.next.prev = r.prev;
			if (r.prev != null)
				r.prev.next = r.next;
			r.next = head.next;
			head = r;
		}
		map.put(key, r);
	}

}
