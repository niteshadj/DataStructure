/**
 * 
 */
package tree;

/**
 * @author nadjriya
 * 
 *         Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL)
 *         In-Place. The left and right pointers in nodes are to be used as
 *         previous and next pointers respectively in converted DLL. The order
 *         of nodes in DLL must be same as Inorder of the given Binary Tree. The
 *         first node of Inorder traversal (leftmost node in BT) must be the
 *         head node of the DLL.
 *
 * 
 * 
 */
public class BinaryTreeToDLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node root = new Node(1);

		root.left = new Node(3);
		root.right = new Node(2);
		BinaryTreeToDLL bll = new BinaryTreeToDLL();

		Node node = bll.bTreeToClist(root);
		Node head = node;
		while (node != null && node.right != head) {
			System.out.println(node.data);
			node = node.right;
		}

	}

	Node prev = null;

	Node bToDLL(Node root) {
		inOrder(root);

		while (root.left != null)
			root = root.left;

		return root;
	}

	/*
	 * Given a Binary Tree of N edges. The task is to convert this to a Circular
	 * Doubly Linked List(CDLL) in-place. The left and right pointers in nodes
	 * are to be used as previous and next pointers respectively in converted
	 * CDLL. The order of nodes in CDLL must be same as Inorder of the given
	 * Binary Tree. The first node of Inorder traversal (left most node in BT)
	 * must be head node of the CDLL.
	 */
	Node bTreeToClist(Node root) {
		inOrder(root);

		while (root.left != null)
			root = root.left;
		Node head = root;
		while (root.right != null)
			root = root.right;
		root.right = head;
		head.left = root;

		return head;
	}

	private void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);

		if (prev != null)
			prev.right = root;
		root.left = prev;
		prev = root;
		inOrder(root.right);

	}

}
