/**
 * 
 */
package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nadjriya
 * 
 */
public class Traversals {

	// Given a binary tree, find its preorder traversal.
	static ArrayList<Integer> preorder(Node root) {
		ArrayList<Integer> res = new ArrayList<>();

		findPreOrder(root, res);

		return res;

	}

	private static void findPreOrder(Node root, ArrayList<Integer> res) {

		if (root == null)
			return;

		res.add(root.data);
		findPreOrder(root.left, res);
		findPreOrder(root.right, res);

	}
	
	
/*	Given a binary tree, find the Postorder Traversal of it.
	For Example, the postorder traversal of the following tree is:  5 10 39 1

	        1
	     /     \
	   10     39
	  /
	5*/
	
	ArrayList<Integer> postOrder(Node root)
    {
		ArrayList<Integer> res = new ArrayList<>();

		findPostOrder(root, res);

		return res;
    }

	private void findPostOrder(Node root, ArrayList<Integer> res) {
		if (root == null)
			return;

		findPostOrder(root.left, res);
		findPostOrder(root.right, res);
		res.add(root.data);


	}

}
