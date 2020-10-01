/**
 * 
 */
package tree.bst;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given a Binary Search Tree. The task is to find the minimum element in this given BST.

Example 1:

Input:
           5
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1
 *
 */
public class MinElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int minValue(Node node) {

		if (node == null)
			return -1;

		while (node.left != null)
			node = node.left;

		return node.data;

	}

}
