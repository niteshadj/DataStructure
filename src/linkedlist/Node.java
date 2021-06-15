/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya 
 * Common node class for all programs
 *
 */
class Node {
	int data;
	Node next;
	Node prev;
	Node arb;
	int key;

	Node(int a) {
		data = a;
		next = null;
		prev = null;

	}

	Node(int a, int b) {
		data = b;
		key = a;
		next = null;
		prev = null;

	}
}
