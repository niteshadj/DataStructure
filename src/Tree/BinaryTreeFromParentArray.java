/**
 * 
 */
package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nadjriya
 * 
 * Given an array of size N that represents a Tree in such a way that array indexes are values in tree nodes and array values give the parent node of that particular index (or node). The value of the root node index would always be -1 as there is no parent for root. Construct the standard linked representation of Binary Tree from this array representation.

Example 1:

Input:
N = 7
parent[] = {-1,0,0,1,1,3,5}
Output: 0 1 2 3 4 5 6
Explanation:For the array parent[] = {-1,
0, 0, 1, 1, 3, 5}; the tree generated
will have a sturcture like 
         0
       /   \
      1     2
     / \
    3   4
   /
  5
/
6
 *
 */
public class BinaryTreeFromParentArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node root;

	public Node createTree(int arr[], int n) {
		Node[] nodeArray = new Node[n];

		for (int i = 0; i < n; i++) {
			createNode(arr, i, nodeArray);
		}

		return root;
	}

	private void createNode(int[] arr, int i, Node[] nodeArray) {
		if (nodeArray[i] != null)
			return;

		Node curr = new Node(i);
		nodeArray[i] = curr;
		if (arr[i] == -1) {
			root = curr;

		} else {
			if (nodeArray[arr[i]] == null) {
				createNode(arr, arr[i], nodeArray);
			}
			Node parentNode = nodeArray[arr[i]];
			if (parentNode.left == null)
				parentNode.left = curr;
			else
				parentNode.right = curr;
		}
	}

}
