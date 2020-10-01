/**
 * 
 */
package tree.bst;

import java.util.TreeSet;

import tree.Node;

/**
 * @author nadjriya
 * 
 *         Given a Binary Search Tree and a node value X. Delete the node with
 *         the given value X from the BST. If no node with value x exists, then
 *         do not make any change.
 *
 */
public class DeleteNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node root = new Node(4);
		root.left = new Node(3);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.left.right = new Node(2);
		deleteNode(root, 4);
		TreeSet<Integer> tree=new TreeSet<>();

	}

	public static Node deleteNode(Node root, int X) {
		if (root == null)
			return root;
		if (root.data < X)
			root.right = deleteNode(root.right, X);
		else if (root.data > X)
			root.left = deleteNode(root.left, X);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			else {
				Node succ = getSuccessor(root.right);
				root.data = succ.data;
				root.right = deleteNode(root.right, succ.data);
				return root;
			}
		}
		return root;
	}

	private static Node getSuccessor(Node root) {
		Node succ = root;
		while (succ != null && succ.left != null)
			succ = succ.left;

		return succ;
	}

}
