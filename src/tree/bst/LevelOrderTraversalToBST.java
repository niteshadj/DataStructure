/**
 * 
 */
package tree.bst;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given an array of size N containing level order traversal of a BST. The task is to complete the function constructBst(), that construct the BST (Binary Search Tree) from its given level order traversal.

Example 1:

Input:
N = 9
BST[] = {7,4,12,3,6,8,1,5,10}
Output: 7 4 3 1 6 5 12 8 10
Explanation: After constructing BST, the
preorder traversal of BST is
7 4 3 1 6 5 12 8 10.
 *
 */

//Check O(n) solution here https://www.geeksforgeeks.org/construct-bst-from-its-given-level-order-traversal-set-2/?ref=rp
public class LevelOrderTraversalToBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node constructBST(int[] arr) {
		int n=arr.length;
		if(n==0)
			return null;
		Node root=new Node(arr[0]);
		
		for(int i=1;i<n;i++){
			root=insert(root, arr[i]);
		}
		
		return root;
		
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
