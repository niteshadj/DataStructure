/**
 * 
 */
package tree.bst;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given a BST and a number X. The task it to find Ceil of X.
Note: Ceil(X) is a number that is either equal to X or is immediately greater than X.

Example 1:

Input:
      5
    /   \
   1     7
    \
     2 
      \
       3
X = 3
Output: 3
Explanation: We find 3 in BST, so ceil
of 3 is 3.
Example 2:

Input:
     10
    /  \
   5    11
  / \ 
 4   7
      \
       8
X = 6
Output: 7
Explanation: We find 7 in BST, so ceil
of 6 is 7.
 *
 */
public class ceil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int findCeil(Node root, int key) {
		if (root == null)
			return -1;
		int res=-1;
		while (root != null) {
			if (root.data == key)
				return root.data;
			if (root.data < key)
				root = root.right;
			else {
				res = root.data;
				root = root.left;
			}

		}

		return res;
	}

}
