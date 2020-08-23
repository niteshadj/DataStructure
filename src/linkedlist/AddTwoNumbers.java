/**
 * 
 */
package linkedlist;

import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given two numbers represented by two linked lists of size N and M.
 *         The task is to return a sum list. The sum list is a linked list
 *         representation of the addition of two input numbers.
 *
 */
public class AddTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t != 0) {
			t--;
			int n = sc.nextInt();
			int val = sc.nextInt();
			Node first = new Node(val);
			Node tail = first;

			for (int i = 0; i < n - 1; i++) {
				Node temp = new Node(sc.nextInt());
				tail.next = temp;
				tail = tail.next;
			}

			int m = sc.nextInt();
			val = sc.nextInt();
			Node second = new Node(val);
			tail = second;

			for (int i = 0; i < m - 1; i++) {
				Node temp = new Node(sc.nextInt());
				tail.next = temp;
				tail = tail.next;
			}
			Node head = addLists(first, second);

			while (head != null) {
				System.out.print(head.data);
				head = head.next;
			}
			System.out.println();
		}

	}

	static Node addLists(Node first, Node second) {
		first = reverseList(first);
		second = reverseList(second);
		Node head = null;
		int carry = 0;
		int sum = 0;
		while (first != null && second != null) {
			sum = first.data + second.data + carry;
			Node temp = new Node(sum % 10);
			carry = sum / 10;
			first = first.next;
			second = second.next;

			temp.next = head;
			head = temp;

		}

		while (first != null) {
			sum=first.data + carry;
			Node temp = new Node(sum % 10);
			carry = sum / 10;
			temp.next = head;
			head = temp;
			first = first.next;
		}
		while (second != null) {
			sum=second.data + carry;
			Node temp = new Node(sum % 10);
			carry = sum / 10;
			temp.next = head;
			head = temp;
			second = second.next;
		}

		if (carry != 0) {
			Node temp = new Node(carry);
			carry = 0;
			temp.next = head;
			head = temp;
		}

		return head;
	}

	static Node reverseList(Node head) {

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
