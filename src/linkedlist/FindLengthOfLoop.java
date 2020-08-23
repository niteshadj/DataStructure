/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         Given a linked list of size N. The task is to complete the function
 *         countNodesinLoop() that checks whether a given Linked List contains a
 *         loop or not and if the loop is present then return the count of nodes
 *         in a loop or else return 0.
 *
 */
public class FindLengthOfLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	static int countNodesinLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				Node temp = slow;
				int count = 1;
				while (slow.next != temp) {
					count++;
					slow = slow.next;
				}

				return count;

			}
		}

		return 0;
	}

}
