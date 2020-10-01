/**
 * 
 */
package tree.bst;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given a BST and an integer. Find the least absolute difference between any node value of the BST and the given integer.

Example 1:

Input:
        10
      /   \
     2    11
   /  \ 
  1    5
      /  \
     3    6
      \
       4
K = 13
Output: 2
Explanation: K=13. The node that has
value nearest to K is 11. so the answer
is 2
 *
 */
public class ClosesetElementBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int minDiff=Integer.MAX_VALUE;

	static int maxDiff(Node root, int K) {
		minDiff=Integer.MAX_VALUE;
		maxDiffUtil(root,K);
		
		return minDiff;

	}

	private static void maxDiffUtil(Node root, int k) {
		if(root==null)
			return;
		
		maxDiffUtil(root.left, k);
		minDiff=Math.min(Math.abs(root.data-k),minDiff);
		maxDiffUtil(root.right, k);
		
		
	}

}
