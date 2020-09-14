/**
 * 
 */
package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @author nadjriya
 * 
 *         Given a binary tree, find its level order traversal. Level order
 *         traversal of a tree is breadth-first traversal for the tree.
 * 
 *         Example 1:
 * 
 *         Input: 1 / \ 3 2 Output:1 3 2
 *
 */
public class LevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	static ArrayList<Integer> levelOrder(Node node) {
		ArrayList<Integer> list = new ArrayList<>();
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			node=queue.poll();
			list.add(node.data);
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}

		return list;

	}

}
