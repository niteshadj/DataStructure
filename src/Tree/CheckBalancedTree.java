/**
 * 
 */
package Tree;

/**
 * @author nadjriya
 * 
 * Check for Balanced Tree 
Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

A height balanced tree
        1
     /     \
   10      39
  /
5

An unbalanced tree
        1
     /    
   10   
  /
5
 *
 */
public class CheckBalancedTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root=new Node(9);
		root.left=new Node(7);
		root.left.right=new Node(10);
		root.left.left=new Node(8);
		root.left.left.right=new Node(6);
		root.left.left.right.left=new Node(6);
		root.left.left.right.right=new Node(10);
		root.left.right.left=new Node(4);
		root.left.right.left.right=new Node(8);
		CheckBalancedTree cbt=new CheckBalancedTree();
		System.out.println(cbt.isBalanced(root));

	}
	
	boolean isBalanced(Node root)
    {
		if(root==null)
			return true;
		
		
		 if(isHeightBalanced(root)==Integer.MAX_VALUE)
			 return false;
		 else 
			 return true;
    }

	private int isHeightBalanced(Node root) {
		
		if(root==null)
			return 0;
		
	/*	if(root.left==null && root.right==null)
			return 0;*/
		int leftHeight=isHeightBalanced(root.left);
		if(leftHeight==Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		int rightHeight=isHeightBalanced(root.right);
		if(rightHeight==Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if(Math.abs(leftHeight-rightHeight)>1)
			return Integer.MAX_VALUE;
		int height =Math.max(leftHeight, rightHeight)+1;
		return height;
		
	}

}
