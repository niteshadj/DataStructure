/**
 * 
 */
package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author nadjriya
 * 
 *         Given a binary tree, connect the nodes that are at same level. You'll
 *         be given an addition nextRight pointer for the same.
 * 
 *         Initially, all the nextRight pointers point to garbage values. Your
 *         function should set these pointers to point next right for each node.
 *         10 10 ------> NULL / \ / \ 3 5 => 3 ------> 5 --------> NULL / \ \ /
 *         \ \ 4 1 2 4 --> 1 -----> 2 -------> NULL
 *
 */
public class ConnectNodesAtSameLevel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node p=new Node(10);
		p.left=new Node(3);
		p.right=new Node(5);
		p.left.left=new Node(4);
		p.left.right=new Node(1);
		p.right.right=new Node(2);
		connect(p);
		
	}

	public static void connect(Node p) {

		Queue<Node> queue = new LinkedList<>();

		queue.add(p);

		while (!queue.isEmpty()) {
			int size = queue.size();
			Node prev=null;
			while (size-- > 0) {
				
				Node curr = queue.poll();
				if(prev!=null)
					prev.nextRight=curr;
				prev=curr;
				if(curr.left!=null)
					queue.add(curr.left);
				if(curr.right!=null)
					queue.add(curr.right);
				
								
			}
		}

	}

}
