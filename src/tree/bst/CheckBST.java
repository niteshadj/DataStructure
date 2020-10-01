/**
 * 
 */
package tree.bst;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given a binary tree. Check whether it is a BST or not.

Example 1:

Input:
    2
 /    \
1      3
Output: 1
 *
 */
public class CheckBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root=new Node(1);
		root.left=new Node(1);
		root.right=new Node(1);
		CheckBST checkBST=new CheckBST();
		System.out.println(checkBST.isBST(root));

	}

	boolean isBST(Node root) {
		
		return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private boolean isBSTUtil(Node root, int minValue, int maxValue) {
		
		if(root==null)
			return true;
		
		if(root.data<=minValue || root.data>=maxValue)
			return false;
		
		boolean isBST=isBSTUtil(root.left, minValue, root.data);
		if(isBST)
			isBST=isBSTUtil(root.right, root.data, maxValue);
		
		
		
		return isBST;
	}

}
