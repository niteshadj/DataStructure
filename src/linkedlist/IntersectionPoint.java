/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 *
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
