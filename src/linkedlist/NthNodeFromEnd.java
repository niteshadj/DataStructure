/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         Given a linked list consisting of L nodes and given a number N. The
 *         task is to find the Nth node from the end of the linked list.
 *
 */
public class NthNodeFromEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	int getNthFromLast(Node head, int n) {
		Node nthNode = head;
		for (int i = 0; i < n; i++) {
			if (head == null)
				return -1;
			head = head.next;
		}

		while (head != null) {
			head = head.next;
			nthNode = nthNode.next;
		}

		return nthNode.data;
	}

}
