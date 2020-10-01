/**
 * 
 */
package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * @author nadjriya
 * 
 *         Given a Binary Tree. Find the Zig-Zag Level Order Traversal of the
 *         Binary Tree. For Example: Example 1:
 * 
 *         Input: 3 / \ 2 1 Output: 3 1 2 Expected Time Complexity: O(N).
 *         Expected Auxiliary Space: O(N).
 * 
 *         Constraints: 1 <= N <= 10^4
 *
 */
public class ZigZagTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Node root=new Node(3);
			root.left=new Node(2);
			root.right=new Node(1);
			
			System.out.println(new ZigZagTraversal().zigZagTraversal(root));

	}

	ArrayList<Integer> zigZagTraversal(Node root) {

		Deque<Node> deque = new ArrayDeque<>();

		ArrayList<Integer> response = new ArrayList<>();
		if (root == null)
			return response;
		deque.add(root);
		int size = deque.size();
		int i = 1;
		while (!deque.isEmpty()) {
			if (size <= 0) {
				i = 1 - i;
				size = deque.size();
			}
			while (size-- > 0) {
				Node currNode = null;
				if (i == 1) {
					currNode = deque.pollFirst();
					response.add(currNode.data);
					if (currNode.left != null)
						deque.addLast(currNode.left);
					if (currNode.right != null)
						deque.addLast(currNode.right);
				} else {
					currNode = deque.pollLast();
					response.add(currNode.data);
					if (currNode.right != null)
						deque.addFirst(currNode.right);
					if (currNode.left != null)
						deque.addFirst(currNode.left);

				}
			}

		}

		return response;
	}

}
