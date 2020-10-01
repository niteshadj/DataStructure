/**
 * 
 */
package tree.bst;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given a Binary Search Tree (with all values unique) and two node values. Find the Lowest Common Ancestors of the two nodes in the BST.

Example 1:

Input:
              5
           /    \
         4       6
        /         \
       3           7
                    \
                     8
n1 = 7, n2 = 8
Output: 7
 *
 */
public class LCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node root=new Node(2);
		root.left=new Node(1);
		root.right=new Node(3);
		LCA lca=new LCA();
		System.out.println(lca.LCA(root, 1, 3).data);

	}

	Node LCA(Node root, int n1, int n2) {
		if (n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}

		Node currNode = root;
		Node LCA = null;
		while (currNode != null) {
			if (n1 <= currNode.data && currNode.data <= n2) {
				LCA = currNode;
				return LCA;
			} else if (currNode.data > n1)
				currNode = currNode.left;
			else
				currNode = currNode.right;
		}

		return LCA;

	}

}
