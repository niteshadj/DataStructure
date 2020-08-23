/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 *
 *         Given a linked list of N nodes. The task is to check if the the
 *         linked list has a loop. Linked list can contain self loop.
 * 
 * 
 */
public class DetectLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean detectLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}

		return false;
	}

}
