/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         You are given a linked list of N nodes. The task is to remove the
 *         loop from the linked list, if present.
 *
 */
public class RemoveLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void removeLoop(Node head) {

		Node slow = head;
		Node fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				if (slow == head) {
					while (fast.next != slow)
						fast = fast.next;
				} else {
					slow = head;
					while (slow.next != fast.next) {
						slow = slow.next;
						fast = fast.next;
					}
				}
				fast.next = null;
			}
		}

		if (head.next == head)
			head.next = null;

	}

}
