/**
 * 
 */
package tree;


/**
 * @author nadjriya
 * 
 * Given a binary tree, check if the tree can be folded or not. A tree can be folded if left and right subtrees of the tree are structure wise same. An empty tree is considered as foldable.
Consider the below trees:
(a) and (b) can be folded.
(c) and (d) cannot be folded.


(a)
       10
     /    \
    7      15
     \    /
      9  11
(b)
        10
       /  \
      7    15
     /      \
    9       11
(c)
        10
       /  \
      7   15
     /    /
    5   11
(d)
         10
       /   \
      7     15
    /  \    /
   9   10  12
 *
 */
public class FoldableTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean IsFoldable(Node node) {
		if (node == null)
			return true;

		boolean isFoldable = isStructSame(node.left, node.right);

		return isFoldable;

	}

	private boolean isStructSame(Node left, Node right) {

		if (left == null && right == null)
			return true;

		if ((left == null && right != null) || (left != null && right == null)) {
			return false;
		}

		if (left != null && right != null && isStructSame(left.right, right.left)
				&& isStructSame(left.left, right.right))
			return true;

		return false;
	}

}
