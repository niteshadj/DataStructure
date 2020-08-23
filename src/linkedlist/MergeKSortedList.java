/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 *
 */
public class MergeKSortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	Node mergeKList(Node[] a, int N) {
		if (N < 1)
			return null;

		if (N == 1)
			return a[0];

		Node head = a[0];
		int i = 1;
		while (i < N) {
			head = sortedMerge(head, a[i]);
			i++;
		}

		return head;
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
