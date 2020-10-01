/**
 * 
 */
package tree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author nadjriya
 *
 *
 *         Given a Linked List Representation of Complete Binary Tree. The task
 *         is to construct the Binary tree. Note : The complete binary tree is
 *         represented as a linked list in a way where if root node is stored at
 *         position i, its left, and right children are stored at position
 *         2*i+1, 2*i+2 respectively.
 */
public class BinaryTreeFromLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ParseException {
		Node1 head = new Node1(1);
		head.next = new Node1(2);
		Node1 node = head.next;
		node.next = new Node1(3);
		node.next.next = new Node1(4);
		node.next.next.next = new Node1(5);

	}

	public static Tree convert(Node1 head, Tree node) {

		Queue<Tree> queue = new LinkedList<>();
		if (head == null)
			return null;
		Tree parentNode = new Tree(head.data);
		if (head.next != null) {
			parentNode.left = new Tree(head.next.data);
			queue.add(parentNode.left);
			head = head.next;
		}
		if (head.next != null) {
			parentNode.right = new Tree(head.next.data);
			queue.add(parentNode.right);
			head = head.next.next;
		}

		while (head != null && !queue.isEmpty()) {
			Tree currNode = queue.poll();

			currNode.left = new Tree(head.data);
			queue.add(currNode.left);
			head = head.next;

			if (head != null) {
				currNode.right = new Tree(head.data);
				queue.add(currNode.right);
				head = head.next;
			}

		}

		while (!queue.isEmpty()) {
			Tree currNode = queue.poll();
			currNode.left = null;
			currNode.right = null;
		}

		return parentNode;
	}

}

class Tree {
	int data;
	Tree left;
	Tree right;

	Tree(int d) {
		data = d;
		left = null;
		right = null;
	}
}

class Node1 {
	int data;
	Node1 next;

	Node1(int d) {
		data = d;
		next = null;
	}
}
