/**
 * 
 */
package linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nadjriya
 *
 */
public class DeleteDuplicateUnSorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node removeDuplicates(Node head) {
		Map<Integer, Integer> frequency = new HashMap<>();

		Node curr = head;
		Node prev = null;
		while (curr != null) {
			while (curr != null && frequency.get(curr.data) != null) {
				curr = curr.next;

			}
			if (prev != null)
				prev.next = curr;

			prev = curr;
			if (curr != null) {
				frequency.put(curr.data, 1);
				curr = curr.next;
			}

		}

		return head;
	}

}
