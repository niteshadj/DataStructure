/**
 * 
 */
package tree;

/**
 * @author nadjriya
 * 
 *         Given a binary tree, the task is to find the maximum path sum. The
 *         path may start and end at any node in the tree.
 * 
 *         Input: 10 / \ 2 -25 / \ / \ 20 1 3 4 Output: 32 Explanation: Path in
 *         the given tree goes like 10 , 2 , 20 which gives the max sum as 32.
 *
 */
public class MaxPathSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	int maxSum = Integer.MIN_VALUE;

	int findMaxSum(Node node) {

		if (node == null)
			return 0;

		findMaxPathSum(node);

		return maxSum;

	}

	private int findMaxPathSum(Node node) {
		if (node == null)
			return 0;

		int leftSum = findMaxPathSum(node.left);
		int rightSum = findMaxPathSum(node.right);
		int currValue = node.data;
		maxSum = Math.max(maxSum, Math.max(Math.max(Math.max(currValue, currValue + leftSum), currValue + rightSum),
				currValue + rightSum + leftSum));

		return (Math.max(Math.max(currValue, currValue + leftSum), currValue + rightSum));
	}

}
