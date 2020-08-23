/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 *
 */
public class IsPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	boolean isPalindrome(Node head) {

		Node middle = findMiddle(head);

		Node head2 = reverseList(middle.next);

		while (head2 != null) {
			if (head.data != head2.data)
				return false;
			head = head.next;
			head2 = head2.next;
		}

		return true;
	}

	static Node reverseList(Node head) {

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

	private Node findMiddle(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			if (fast != null)
				slow = slow.next;
		}

		return slow;
	}

}
