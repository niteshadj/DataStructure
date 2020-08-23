/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya Given a singly linked list. The task is to find the length
 *         of the linked list, where length is defined as the number of nodes in
 *         the linked list.
 */
public class SimpleOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	Node insertAtBeginning(Node head, int x) {
		Node temp = new Node(x);
		temp.next = head;
		head = temp;

		return head;
	}

	// Should insert a node at the end
	Node insertAtEnd(Node head, int x) {
		Node curr = head;
		Node temp = new Node(x);
		temp.next = null;
		if (curr == null) {
			return temp;
		}
		while (curr.next != null)
			curr = curr.next;
		curr.next = temp;

		return head;
	}

	// Given a doubly-linked list, a position p, and an integer x. The task is
	// to add a new node with value x at the position just after pth node in the
	// doubly linked list.
	void addNode(Node head_ref, int pos, int data) {
		int count = 0;
		Node temp = new Node(data);
		temp.next = null;
		temp.prev = null;
		if (head_ref != null) {

			Node prev = head_ref;
			Node curr = head_ref.next;
			while (curr != null && count < pos) {
				count++;
				prev = curr;
				curr = curr.next;
			}

			prev.next = temp;
			temp.prev = prev;
			temp.next = curr;

			if (curr != null)
				curr.prev = temp;

		}

	}

	// Given a linked list of size N and a key. The task is to insert the key in
	// the middle of the linked list.
	public Node insertInMid(Node head, int data) {
		Node slow = head;
		Node fast = head;
		Node temp = new Node(data);
		while (fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		temp.next = slow.next;
		slow.next = temp;
		return head;
	}

}
