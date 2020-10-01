/**
 * 
 */
package tree;

/**
 * @author nadjriya
 * 
 *         Given a binary tree with a value associated with each node, we need
 *         to choose a subset of these nodes such that sum of chosen nodes is
 *         maximum under a constraint that no two chosen node in subset should
 *         be directly connected that is, if we have taken a node in our sum
 *         then we can’t take its any children in consideration and vice versa.
 *         Input:
        1
      /   \
     2     3
    /     /  \
   4     5    6
Output: 16
Explanation: The maximum sum is sum of
nodes 1 4 5 6 , i.e 16. These nodes are
non adjacent.
 *
 */

class Pair{
	int sumInclundingNode=0;
	int sumExclundingNode=0;
	public Pair(int sumInclundingNode, int sumExclundingNode) {
		super();
		this.sumInclundingNode = sumInclundingNode;
		this.sumExclundingNode = sumExclundingNode;
	}
	
}


public class MaxSumNonAdjacentNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	
	static int getMaxSum(Node root) {
		Pair pair =getMaxSumUtil(root);
		
		return Math.max(pair.sumExclundingNode, pair.sumInclundingNode);
	}

	private static Pair getMaxSumUtil(Node root) {

		if (root == null)
			return new Pair(0, 0);

		Pair l = getMaxSumUtil(root.left);
		Pair r = getMaxSumUtil(root.right);

		int sumIncludingNode = l.sumExclundingNode + root.data + r.sumExclundingNode;
		int sumExcludingNode = Math.max(l.sumInclundingNode, l.sumExclundingNode)
				+ Math.max(r.sumInclundingNode, r.sumExclundingNode);

		Pair pair = new Pair(sumIncludingNode, sumExcludingNode);

		return pair;
	}

}
