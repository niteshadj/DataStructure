/**
 * 
 */
package tree.bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given a binary tree, print the bottom view from left to right.
A node is included in bottom view if it can be seen when we look at the tree from bottom.

                      20
                    /    \
                  8       22
                /   \        \
              5      3       25
                    /   \      
                  10    14

For the above tree, the bottom view is 5 10 3 14 25.
If there are multiple bottom-most nodes for a horizontal distance from root, then print the later one in level traversal. For example, in the below diagram, 3 and 4 are both the bottommost nodes at horizontal distance 0, we need to print 4.

                      20
                    /    \
                  8       22
                /   \     /   \
              5      3 4     25
                     /    \      
                 10       14

For the above tree the output should be 5 10 4 14 25.
 
 *
 */
public class BottomView {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Integer> bottomView(Node root) {
		// Code here
		if (root == null)
			return new ArrayList<>();

		ArrayList<Integer> res = new ArrayList<>();
		TreeMap<Integer, Integer> map = new TreeMap();
		getBottomView(root, map);

		res.addAll(map.values());

		return res;

	}

	private static void getBottomView(Node root, TreeMap<Integer, Integer> map) {

		if (root == null)
			return;
		Queue<QueueObject> queue = new LinkedList<>();
		queue.add(new QueueObject(0, root));
		while (!queue.isEmpty()) {
			QueueObject obj = queue.poll();
			Node currNode = obj.node;
			int hd = obj.hDistance;
			map.put(hd, currNode.data);
			if (currNode.left != null) {
				queue.add(new QueueObject(hd - 1, currNode.left));
			}
			if (currNode.right != null) {
				queue.add(new QueueObject(hd + 1, currNode.right));

			}
		}

	}

}
