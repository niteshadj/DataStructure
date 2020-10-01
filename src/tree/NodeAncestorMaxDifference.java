/**
 * 
 */
package tree;

/**
 * @author nadjriya
 *
 *Maximum difference between node and its ancestor 
Given a Binary Tree, you need to find the maximum value which you can get by subtracting the value of node B from the value of node A, where A and B are two nodes of the binary tree and A is an ancestor of B. 

Example 1:

Input:
    5
 /    \
2      1
Output: 4
Explanation:The maximum difference we can
get is 4, which is bewteen 5 and 1.
 */
public class NodeAncestorMaxDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int maxDiff = Integer.MIN_VALUE;

	int maxDiff(Node root) {
		maxDiffUtil(root);

		return maxDiff;
	}

	private int maxDiffUtil(Node root) {
		if (root == null)
			return Integer.MAX_VALUE;

		int l = maxDiffUtil(root.left);
		int r = maxDiffUtil(root.right);
		int data = root.data;
		maxDiff = Math.max(maxDiff, Math.max(data - l, data - r));

		return Math.min(Math.min(l, r), data);
	}

}
