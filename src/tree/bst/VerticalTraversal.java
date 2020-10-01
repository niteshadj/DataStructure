/**
 * 
 */
package tree.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

import tree.Node;

/**
 * @author nadjriya
 * 
 *         Given a Binary Tree, find the vertical traversal of it starting from
 *         the leftmost level to the rightmost level. If there are multiple
 *         nodes passing through a vertical line, then they should be printed as
 *         they appear in level order traversal of the tree.
 * 
 *         Example 1:
 * 
 *         Input: 2 \ 3 / 4 Output: 2 4 3
 *
 * 
 */
public class VerticalTraversal {

	/**
	 * @param args
	 */
	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s = br.readLine();
			Node root = buildTree(s);
			ArrayList<Integer> res = verticalOrder(root);
			for (Integer num : res)
				System.out.print(num + " ");
			System.out.println();

		}
	}

	static ArrayList<Integer> verticalOrder(Node root) {
		TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
		ArrayList<Integer> res = new ArrayList<>();
		getVerticalTraversal(root, treeMap);

		for (List<Integer> set : treeMap.values()) {
			res.addAll(set);
		}

		return res;

	}

	private static void getVerticalTraversal(Node root, TreeMap<Integer, List<Integer>> treeMap) {

		if (root == null)
			return;
		Queue<QueueObj> queue = new LinkedList<>();
		queue.add(new QueueObj(0, root));
		while (!queue.isEmpty()) {
			QueueObj obj = queue.poll();
			Node currNode = obj.node;
			int hd = obj.hDistance;
			List<Integer> set = null;
			if (treeMap.containsKey(hd)) {
				set = treeMap.get(hd);
				set.add(currNode.data);
				treeMap.put(hd, set);
			} else {
				set = new ArrayList();
				set.add(currNode.data);
				treeMap.put(hd, set);
			}
			if (currNode.left != null) {

				queue.add(new QueueObj(hd - 1, currNode.left));
			}
			if (currNode.right != null) {
				queue.add(new QueueObj(hd + 1, currNode.right));

			}
		}

	}

}

class QueueObj {
	Node node;
	int hDistance;

	public QueueObj(int hd, Node node) {
		this.hDistance = hd;
		this.node = node;
	}

}
