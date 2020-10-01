/**
 * 
 */
package tree;

/**
 * @author nadjriya
 * 
 * Given a binary tree and an integer X. Your task is to complete the function countSubtreesWithSumX() that returns the count of the number of subtress having total node’s data sum equal to the value X.
Example: For the tree given below:            

              5
            /    \
        -10     3
        /    \    /  \
      9     8  -4 7

Subtree with sum 7:
             -10
            /      \
          9        8

and one node 7.
 *
 */
public class NumberOfSubtreesWithGivenSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	int count = 0;

	int countSubtreesWithSumX(Node root, int X) {
		countSubtreesWithSum(root, X);
		return count;
	}

	private int countSubtreesWithSum(Node root, int x) {
		if (root == null)
			return 0;

		int lSum = countSubtreesWithSum(root.left, x);
		int rSum = countSubtreesWithSum(root.right, x);

		int sum = root.data + lSum + rSum;
		if (sum == x)
			count++;

		return sum;

	}

}
