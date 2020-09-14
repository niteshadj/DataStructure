/**
 * 
 */
package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author nadjriya
 * 
 *         Given a Binary Tree, your task is to print its level order traversal
 *         such that each level is separated by $. For the below tree the output
 *         will be 1 $ 2 3 $ 4 5 6 7 $ 8 $.
 * 
 *         1 / \ 2 3 / \ / \ 4 5 6 7 \ 8
 *
 */
public class LevelOrderLineByLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/*
	 * static void levelOrder(Node node) { Queue<Node> queue = new
	 * LinkedList<>(); queue.add(node); queue.add(null); while
	 * (!queue.isEmpty()) { node = queue.poll(); if (node == null) {
	 * System.out.print("$ "); queue.add(null); } else {
	 * System.out.print(node.data + " "); if (node.left != null)
	 * queue.add(node.left); if (node.right != null) queue.add(node.right); } }
	 * 
	 * }
	 */

	static void levelOrder(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		int size = queue.size();
		while (!queue.isEmpty()) {
			if (size == 0) {
				System.out.print("$ ");
				size = queue.size();
			}
			while (size != 0) {
				node = queue.poll();
				System.out.print(node.data + " ");
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
				size--;
			}
		}
		System.out.print("$ ");
	}

}
