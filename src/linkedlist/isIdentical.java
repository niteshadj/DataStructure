/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 * 
 *         Given two Singly Linked List of N and M nodes respectively. The task
 *         is to check whether two linked lists are identical or not. Two Linked
 *         Lists are identical when they have same data and with same
 *         arrangement too.
 *
 */
public class isIdentical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public boolean isIdentical(Node head1, Node head2) {
	
		while (head1 != null || head2 != null) {
			if(head1.data!=head2.data)
				return false;
			head1=head1.next;
			head2=head2.next;
		}
		if (head1 == null && head2 == null)
			return true;
		

		return false;
	}

}
