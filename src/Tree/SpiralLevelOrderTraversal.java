/**
 * 
 */
package Tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author nadjriya
 * 
 *         Complete the function to print spiral order traversal of a tree. For
 *         below tree, function should print 1, 2, 3, 4, 5, 6, 7.
 * 
 *         Input: 1 / \ 3 2 Output:1 3 2
 *
 */
public class SpiralLevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node node=new Node(1);
		node.left=new Node(3);
		node.right=new Node(2);
		printSpiral(node);
	}

	static void printSpiral(Node node) {
		Deque<Node> deq = new ArrayDeque<>();
		if(node==null)
			return;
		deq.addLast(node);
		int i = 0;
		int j = 0;
		while (!deq.isEmpty()) {
			Node currNode = null;
			j = deq.size();
			while (j != 0) {
				if (i % 2 == 0) {
					currNode = deq.pollLast();
					if (currNode.right != null)
						deq.addFirst(currNode.right);
					if (currNode.left != null)
						deq.addFirst(currNode.left);
				} else {
					currNode = deq.pollFirst();
					if (currNode.left != null)
						deq.addLast(currNode.left);
					if (currNode.right != null)
						deq.addLast(currNode.right);
				}

				System.out.print(currNode.data+ " ");
				j--;
			}
			i++;
		}

	}

}
