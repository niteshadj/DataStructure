/**
 * 
 */
package tree;

/**
 * @author nadjriya
 * 
 *         Generic node class for all tree problems
 *
 */
public class Node {

	public int data;
	public Node left, right;
	public Node nextRight;
	public int lCount;
	public int rCount;

	public Node(int d) {
		this.data = d;
	}

}
