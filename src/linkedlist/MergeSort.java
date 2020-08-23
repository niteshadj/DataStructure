/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         Given Pointer/Reference to the head of the linked list, the task is
 *         to Sort the given linked list using Merge Sort. Note: If the length
 *         of linked list is odd, then the extra node should go in the first
 *         list while splitting.
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static Node mergeSort(Node head) {

		if (head == null || head.next == null)
			return head;

		Node middle = findMiddle(head);
		Node h2 = middle.next;
		middle.next = null;

		Node h1 = mergeSort(head);
		h2 = mergeSort(h2);

		Node result = sortedMerge(h1, h2);

		return result;
	}

	static Node sortedMerge(Node headA, Node headB) {
		Node head = headA;
		Node prev = null;
		Node temp = null;
		while (headA != null && headB != null) {
			if (headA.data > headB.data) {
				temp = headB.next;
				headB.next = headA;
				if (prev == null) {
					head = headB;
				} else {
					prev.next = headB;

				}
				prev = headB;
				headB = temp;
			} else {
				prev = headA;
				headA = headA.next;
			}
		}

		if (headB != null) {
			prev.next = headB;
		}

		return head;
	}

	private static Node findMiddle(Node head) {
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
