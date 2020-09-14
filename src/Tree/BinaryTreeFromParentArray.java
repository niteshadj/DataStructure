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
