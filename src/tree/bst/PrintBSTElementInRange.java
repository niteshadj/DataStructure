/**
 * 
 */
package tree.bst;

import java.util.ArrayList;

import tree.Node;

/**
 * @author nadjriya
 *
 */
public class PrintBSTElementInRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {

		ArrayList<Integer> res = new ArrayList<>();

		printInOrder(root, low, high, res);

		return res;

	}

	private static void printInOrder(Node root, int low, int high, ArrayList<Integer> res) {

		if (root == null)
			return;

		printInOrder(root.left, low, high, res);

		if (low <= root.data && root.data >= high)
			res.add(root.data);

		printInOrder(root.right, low, high, res);

	}
}
