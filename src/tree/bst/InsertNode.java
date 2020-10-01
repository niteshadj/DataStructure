/**
 * 
 */
package tree.bst;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given a BST and a key K. Insert a new Node with value equal to K into the BST. 

Example 1:

Input:
     2
   /   \
  1     3
K = 4
Output: 1 2 3 4
Explanation: After inserting the node 4
Inorder traversal will be 1 2 3 4.
 *
 */
public class InsertNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	
	Node insert(Node root, int Key)
	{
		if (root == null) {
			root = new Node(Key);
			return root;
		}

		Node currNode = root;
		Node prevNode = null;

		while (currNode != null) {
			if (currNode.data == Key)
				return root;
			else if (currNode.data > Key) {
				prevNode = currNode;
				currNode = currNode.left;
			} else {
				prevNode = currNode;
				currNode = currNode.right;
			}
		}

		if (Key > prevNode.data)
			prevNode.right = new Node(Key);
		else
			prevNode.left = new Node(Key);

		return root;

	}

}
