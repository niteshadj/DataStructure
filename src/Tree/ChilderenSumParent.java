/**
 * 
 */
package Tree;

/**
 * @author nadjriya
 * 
 *         Given a Binary Tree. Check whether all of its nodes have the value
 *         equal to the sum of their child nodes.
 * 
 *         Example 1:
 * 
 *         Input: 10 / 10 Output: 1 Explanation: Here, every node is sum of its
 *         left and right child.
 *
 */
public class ChilderenSumParent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int isSumProperty(Node root) {
		if (root == null)
			return 1;

		if (root.left == null && root.right == null)
			return 1;

		int sum = 0;
		if (root.left != null)
			sum = sum + root.left.data;

		if (root.right != null)
			sum = sum + root.right.data;
		if ((root.data == sum) && isSumProperty(root.left) == 1 && isSumProperty(root.right) == 1)
			return 1;
		else
			return 0;

	}

}
