/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         You are given a Singly Linked List with N nodes where each node next
 *         pointing to its next node. You are also given M random pointers ,
 *         where you will be given M number of pairs denoting two nodes a and b
 *         i.e. a->arb = b. Input: N = 4, M = value = {1,2,3,4} pairs =
 *         {{1,2},{2,4}} Output: 1 Explanation: In this test case, there re 4
 *         nodes in linked list. Among these 4 nodes, 2 nodes have arbit pointer
 *         set, rest two nodes have arbit pointer as NULL. Third line tells us
 *         the value of four nodes. The fourth line gives the information about
 *         arbitrary pointers. The first node arbit pointer is set to node 2.
 *         The second node arbit pointer is set to node 4.
 *
 */
public class CloneLinkedListWithRandomPointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}

	Node copyList(Node head) {
		if (head == null)
			return null;
		if (head.next == null) {
			return new Node(head.data);
		}
		Node curr = head;
		while (curr != null) {
			Node newNode = new Node(curr.data);
			Node temp = curr.next;
			curr.next = newNode;
			newNode.next = temp;
			curr = temp;
		}
		curr = head;
		while (curr != null && curr.next != null) {
			Node temp = curr.next;
			if (curr.arb != null)
				temp.arb = curr.arb.next;
			curr = curr.next.next;
		}

		curr = head;
		Node cloned = curr.next;
		Node result = cloned;
		while (curr != null && curr.next != null && cloned != null) {
			curr.next = curr.next.next;
			curr = curr.next;
			if (curr != null) {
				cloned.next = curr.next;
				cloned = cloned.next;
			} else {
				cloned.next = null;
			}

		}

		return result;
	}

}
