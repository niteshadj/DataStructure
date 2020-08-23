/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         Given a singly linked list of size N. The task is to rotate the
 *         linked list counter-clockwise by k nodes, where k is a given positive
 *         integer smaller than or equal to length of the linked list.
 *
 */
public class RotateLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node rotate(Node head, int k) {
		int count = 0;
		Node curr = head;
		while (count < k - 1) {
			count++;
			curr = curr.next;

		}

		Node temp = curr.next;
		curr.next = null;
		curr = temp;
		if(curr==null)
			return head;
		while (curr.next != null) {
			curr = curr.next;

		}
		curr.next = head;

		return temp;
	}

}
