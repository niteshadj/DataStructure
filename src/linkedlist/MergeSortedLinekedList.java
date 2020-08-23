/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         Given two sorted linked lists consisting of N and M nodes
 *         respectively. The task is to merge both of the list (in-place) and
 *         return head of the merged list. Note: It is strongly recommended to
 *         do merging in-place using O(1) extra space.
 *
 */
public class MergeSortedLinekedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node sortedMerge(Node headA, Node headB) {
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

}
