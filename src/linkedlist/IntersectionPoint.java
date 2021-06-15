/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 *
 *         Given two singly linked lists of size N and M, write a program to get
 *         the point where two linked lists intersect each other.
 * 
 *         LinkList1 = 3->6->9->common LinkList2 = 10->common common =
 *         15->30->NULL Output: 15
 */
public class IntersectionPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int intersectPoint(Node headA, Node headB) {
		int a = getCount(headA);
		int b = getCount(headB);
		int n = Math.abs(a - b);
		int i = 0;
		if (a > b) {
			while (i < n) {

				if (headA == null)
					return -1;
				headA = headA.next;
				i++;
			}
		} else {
			while (i < n) {
				if (headB == null)
					return -1;
				headB = headB.next;
				i++;
			}

		}
		while (headA != null && headB != null) {
			if (headA == headB)
				return headA.data;
			headA = headA.next;
			headB = headB.next;
		}

		return -1;
	}

	public static int getCount(Node head) {
		Node curr = head;
		int count = 0;
		while (curr != null) {
			curr = curr.next;
			count++;
		}

		return count;
	}
}
