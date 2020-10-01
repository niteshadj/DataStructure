/**
 * 
 */
package tree.bst;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given a Binary Search Tree and a node value X, find if node with value X is present in the BST or not. 

Example 1:

Input:
         2
          \
          81
        /    \
      42      87
    /   \       \
   45   66      90
x = 87
Output: 1
Explanation: As 87 is present in the
given nodes , so the output will be
1.
 *
 */
public class SearchNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	boolean search(Node root, int x) {
		if (root == null) {
			return false;
		}

		Node currNode = root;

		while (currNode != null) {
			if (currNode.data == x)
				return true;
			else if (currNode.data > x) {
				currNode = currNode.left;
			} else {
				currNode = currNode.right;
			}
		}

		return false;

	}

}
