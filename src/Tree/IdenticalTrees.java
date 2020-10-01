/**
 * 
 */
package tree;

/**
 * @author nadjriya
 * 
 *         Given two binary trees, the task is to find if both of them are
 *         identical or not.
 * 
 *         Example 1:
 * 
 *         Input: 1 1 / \ / \ 2 3 2 3 Output: Yes Explanation: There are two
 *         trees both having 3 nodes and 2 edges, both trees are identical
 *         having the root as 1, left child of 1 is 2 and right child of 1 is 3.
 *
 */
public class IdenticalTrees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean isIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;
		else if (root1 == null && root2 != null)
			return false;
		else if (root1 != null && root2 == null)
			return false;
		return root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);

	}

}
