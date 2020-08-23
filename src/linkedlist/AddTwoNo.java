/**
 * 
 */
package linkedlist;

import java.util.LinkedList;

/**
 * @author nadjriya
 * 
 *         Given two numbers represented by two linked lists, write a function
 *         that returns Sum list. The sum list is linked list representation of
 *         addition of two input numbers.
 */

//Pending
public class AddTwoNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node cur; // Dont change the variable name, its used in main function
	int carry; // Dont change the variable name, its used in main function

	void addCarryToRemaining(Node head, LinkedList res) {
		// Write code here
	}

	void addSameSize(Node head1, Node head2, LinkedList res) {
		head1 = reverseList(head1);
		head2 = reverseList(head2);
		Node head = null;
		int carryTemp = 0;
		int sum = 0;
		while (head1 != null && head2 != null) {
			sum = head1.data + head2.data + carryTemp;
			Node temp = new Node(sum % 10);
			carryTemp = sum / 10;
			head1 = head1.next;
			head2 = head2.next;

			temp.next = head;
			head = temp;

		}
		carry=carryTemp;
//		res.
	}

	Node reverseList(Node head) {

		Node prev = null;
		Node temp = null;

		while (head != null) {
			temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
	}

}
