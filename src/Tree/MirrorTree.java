/**
 * 
 */
package Tree;

/**
 * @author nadjriya
 * 
 * Given a Binary Tree, convert it into its mirror.
 * Input:
      10
     /  \
    20   30
   /  \
  40  60
Output: 30 10 60 20 40
Explanation: The tree is
      10               10
    /    \  (mirror) /    \
   20    30    =>   30    20
  /  \                   /   \
 40  60                 60   40
The inroder traversal of mirror is
30 10 60 20 40.
 *
 */
public class MirrorTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void mirror(Node node) {

		node = convertTomirror(node);

	}

	private Node convertTomirror(Node node) {
		if (node == null)
			return null;

		Node left = convertTomirror(node.left);
		Node right = convertTomirror(node.right);

		node.left = right;
		node.right = left;
		return node;
	}

}
