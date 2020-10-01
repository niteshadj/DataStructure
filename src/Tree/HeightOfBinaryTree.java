/**
 * 
 */
package tree;

/*
  @author nadjriya
  Given a binary tree, find its height.

​​Example 1:

Input:
      1
    /  \
   2    3
Output: 2
 
 */
public class HeightOfBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int height(Node root) {
		if (root == null)
			return 0;

		return Math.max(height(root.left), height(root.right)) + 1;

	}

}
