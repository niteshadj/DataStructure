/**
 * 
 */
package tree.bst;

import java.util.ArrayList;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given two Binary Search Trees(without duplicates). Find need to print the common nodes in them. In other words, find intersection of two BSTs

Example 1:

Input:
BST1:
                  5
               /     \
             1        10
           /   \      /
          0     4    7
                      \
                       9
BST2:
                10 
              /    \
             7     20
           /   \ 
          4     9
Output: 4 7 9 10
 *
 */
public class PrintCommonNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node root1 = new Node(10);
		root1.left = new Node(2);
		root1.right = new Node(11);
		root1.left.left = new Node(1);
		root1.left.right = new Node(3);
		
		Node root2 = new Node(2);
		root2.left = new Node(1);
		root2.right = new Node(3);
		
		printCommon(root1, root2);

	}

	public static ArrayList<Integer> printCommon(Node root1, Node root2) {
		ArrayList<Integer> res = new ArrayList<>();
		ArrayList<Integer> inOrder = new ArrayList<>();
		printInorder(root1, inOrder);
		getCommon(root2, inOrder, res);

		return res;
	}

	private static void getCommon(Node root2, ArrayList<Integer> inOrder, ArrayList<Integer> res) {
		if (root2 == null)
			return;
		getCommon(root2.left, inOrder, res);
		if (inOrder.contains(root2.data))
			res.add(root2.data);

		getCommon(root2.right, inOrder, res);
	}

	private static void printInorder(Node root1, ArrayList<Integer> inOrder) {

		if (root1 == null)
			return;
		printInorder(root1.left, inOrder);
		inOrder.add(root1.data);
		printInorder(root1.right, inOrder);

	}

}
