/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         Given a linked list of N positive integers. You need to swap elements
 *         pairwise. Your task is to complete the function pairwise_swap().
 *
 */
public class PairwiseSwap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node pairwiseSwap(Node node) {

		Node curr = node;
		Node head = node;
		Node prev = null;

		while (curr != null && curr.next != null) {
			Node temp = curr.next;
			if (head == node)
				head = curr.next;
			curr.next = curr.next.next;
			temp.next = curr;
			if (prev != null)
				prev.next = temp;
			prev = curr;
			curr = curr.next;
		}

		return head;

	}

}
