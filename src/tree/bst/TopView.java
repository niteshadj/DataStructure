/**
 * 
 */
package tree.bst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given below is a binary tree. The task is to print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree

       1
    /     \
   2       3
  /  \    /   \
4    5  6   7

Top view will be: 4 2 1 3 7
Note: Print from leftmost node to rightmost node.
 *
 */
public class TopView {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void topView(Node root) {
		if(root==null)
			return;
		TreeMap<Integer, Integer> map = new TreeMap();
		getTopView(root, map);
		
		for(int value:map.values()){
			System.out.print(value+" ");
		}
		

	}

	private static void getTopView(Node root, TreeMap<Integer, Integer> map) {

		if (root == null)
			return;
		Queue<QueueObject> queue = new LinkedList<>();
		queue.add(new QueueObject(0, root));
		while (!queue.isEmpty()) {
			QueueObject obj = queue.poll();
			Node currNode = obj.node;
			int hd = obj.hDistance;
			if (!map.containsKey(hd)) {
				map.put(hd, currNode.data);
			}
			if (currNode.left != null) {
				queue.add(new QueueObject(hd - 1, currNode.left));
			}
			if (currNode.right != null) {
				queue.add(new QueueObject(hd + 1, currNode.right));

			}
		}

	}

}

class QueueObject {
	Node node;
	int hDistance;

	public QueueObject(int hd, Node node) {
		this.hDistance = hd;
		this.node = node;
	}

}