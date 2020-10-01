/**
 * 
 */
package tree;

/**
 * @author nadjriya
 * 
 * Given inorder and postorder traversals of a Binary Tree in the arrays in[] and post[] respectively. The task is to construct the binary tree from these traversals.
For example, if given inorder and postorder traversals are {4, 8, 2, 5, 1, 6, 3, 7} and {8, 4, 5, 2, 6, 7, 3, 1}  respectively, then your function should construct below tree.

          1
       /      \
     2        3
   /    \     /   \
  4     5   6    7
    \
      8
 *
 */
public class BTFromPostAndInorderTraversals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int in[] = { 4, 8, 2, 5, 1, 6, 3, 7 };
		int post[] = { 8, 4, 5, 2, 6, 7, 3, 1 };
		BTFromPostAndInorderTraversals btFromPostAndInorderTraversals = new BTFromPostAndInorderTraversals();
		System.out.println(btFromPostAndInorderTraversals.buildTree(in, post, 8));

	}
	int currElementIndex=-1;

	Node buildTree(int in[], int post[], int n) {
		currElementIndex=in.length-1;
		return bt(in, post, 0, n - 1);

	}
	
	

	private Node bt(int[] in, int[] post, int start, int end) {

		if (currElementIndex < 0) {
			return null;
		}

		if (start > end || start < 0 || end > in.length - 1)
			return null;

		Node node = new Node(post[currElementIndex]);
		int elementIndexInInorder = -1;

		for (int m = start; m <= end; m++) {
			if (post[currElementIndex] == in[m]) {
				elementIndexInInorder = m;
				break;
			}
		}

		if (elementIndexInInorder == -1)
			return null;

		currElementIndex--;
		
		node.right = bt(in, post, elementIndexInInorder + 1, end );

		node.left = bt(in, post, start, elementIndexInInorder - 1);

		return node;

	}

}
