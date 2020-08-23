/**
 * 
 */
package stack;

/**
 * @author nadjriya
 * 
 *         You have a linked list and you have to implement the functionalities
 *         push and pop of stack using this given linked list.
 *
 */
public class StackUsingLinkedList {

	/**
	 * @param args
	 */

	class StackNode {
		int data;
		StackNode next;

		StackNode(int a) {
			data = a;
			next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	StackNode top;

	void push(int a) {
		StackNode temp = top;
		top = new StackNode(a);
		top.next = temp;
	}

	int pop() {
		if (top == null)
			return -1;
		int res = top.data;
		top = top.next;
		return res;
	}

}
