/**
 * 
 */
package tree.bst;

import tree.Node;

/**
 * @author nadjriya
 * 
 *         Given a Binary search tree and a value X, the task is to complete the
 *         function which will return the floor of x.
 * 
 *         Note: Floor(X) is an element that is either equal to X or immediately
 *         smaller to X. If no such element exits return -1.
 * 
 *         Example 1:
 * 
 *         Input: 8 / \ 5 9 / \ \ 2 6 10 X = 3 Output: 2 Explanation: Floor of 3
 *         in the given BST is 2
 *
 */
public class FloorInBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int floor(Node root, int key) {
		int res = -1;
		while (root != null) {
			if (root.data == key)
				return root.data;
			if (root.data > key)
				root = root.left;
			else {
				res = root.data;
				root = root.right;
			}

		}

		return res;
	}

}
