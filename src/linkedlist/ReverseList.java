/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         Given a linked list of N nodes. The task is to reverse this list.
 *
 */
public class ReverseList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node reverseList(Node head) {

		Node prev = null;
		Node temp = null;

		while (head != null) {
			temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}

		return prev;
	}

}
