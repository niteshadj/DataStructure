/**
 * 
 */
package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author nadjriya
 * 
 * Given a Binary Tree, find the maximum width of it. Maximum width is defined as the maximum number of nodes in any level.
For example, maximum width of following tree is 4 as there are 4 nodes at 3rd level.

          1
       /     \
     2        3
   /    \    /    \
  4    5   6    7
    \
      8
 *
 */
public class MaxWidth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	
	int getMaxWidth(Node root)
	{
		int maxWidth = 0;

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			maxWidth = Math.max(maxWidth, size);
			while (size-- > 0) {
				Node currNode = queue.poll();

				if (currNode.left != null)
					queue.add(currNode.left);
				if (currNode.right != null)
					queue.add(currNode.right);
			}
		}

		return maxWidth;

	}

}
