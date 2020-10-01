/**
 * 
 */
package tree;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nadjriya
 * 
 *         Given a Binary Tree and a positive integer k. The task is to count
 *         all distinct nodes that are distance k from a leaf node. A node is at
 *         k distance from a leaf if it is present k levels above the leaf and
 *         also, is a direct ancestor of this leaf node. If k is more than the
 *         height of Binary Tree, then nothing should be counted.
 * 
 *         Input: 1 / \ 2 3 / \ / \ 4 5 6 7 \ 8 K = 2 Output: 2 Explanation:
 *         There are only two unique nodes that are at a distance of 2 units
 *         from the leaf node. (node 3 for leaf with value 8 and node 1 for
 *         leaves with values 4, 5 and 7) Note that node 2 isn't considered for
 *         leaf with value 8 because it isn't a direct ancestor of node 8
 *
 */
public class CountNodeAtADistance {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int printKDistantfromLeaf(Node root, int k) {
		
		int [] pathArr=new int[100000];
		Set<Node> set=new HashSet<>();
		//addDistinctNodeAtKDistance(root,k,set,pathArr,0);
		
		return set.size();
		
	}

	/*private void addDistinctNodeAtKDistance(Node root, int k) {
		
		if(root==null)
			return;
		
		if(root.left==null && root.right==null){
			
		}
		
		int lDist=countDistinctNodeAtKDistance(root.left, k);
		int rDist=countDistinctNodeAtKDistance(root.right, k);
		
		if(lDist==k||rDist==k)
			count++;
		
		return Math.max(lDist, rDist);
		
	}*/

}
