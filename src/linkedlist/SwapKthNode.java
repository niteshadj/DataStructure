/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         Given a singly linked list of size N, and an integer K. You need to
 *         swap the Kth node from beginning and Kth node from the end in the
 *         linked list. Note: You need to swap the nodes through the links and
 *         not changing the content of the nodes.
 *
 */
public class SwapKthNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node swapkthnode(Node head, int num, int k) {

		if (k > num)
			return head;

		int count = 0;
		Node kthNodeFromStart = head;
		Node kthNodeFromEnd = head;
		Node prevNodeFromStart = null;
		Node prev = null;

		while (count < k - 1 && kthNodeFromStart != null) {
			prevNodeFromStart = kthNodeFromStart;
			kthNodeFromStart = kthNodeFromStart.next;
			count++;

		}
		count = 0;
		while (count < num - k && kthNodeFromEnd != null) {

			prev = kthNodeFromEnd;
			kthNodeFromEnd = kthNodeFromEnd.next;
			count++;
		}

		if (prevNodeFromStart != null)
			prevNodeFromStart.next = kthNodeFromEnd;
		else
			head = kthNodeFromEnd;
		Node temp = kthNodeFromStart.next;
		if (prev != null)
			prev.next = kthNodeFromStart;
		else
			head = kthNodeFromStart;
		kthNodeFromStart.next = kthNodeFromEnd.next;
		kthNodeFromEnd.next = temp;

		return head;
	}

}
