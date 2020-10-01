/**
 * 
 */
package tree.bst;

import java.util.HashSet;
import java.util.TreeSet;

import tree.Node;

/**
 * @author nadjriya
 *
 */
public class PairSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node root=new Node(68);
		root.left=new Node(59);
		root.right=new Node(91);
		root.left.left=new Node(16);
		root.left.right=new Node(62);
		root.left.left.right=new Node(47);
		root.left.left.right.left=new Node(28);
		
		System.out.println(findPair(root, 78));
		
		

	}

	static boolean findPair(Node root, int sum) {
		HashSet<Integer> set = new HashSet<>();
		return pairSumUtil(root, sum, set);

	}

	private static boolean pairSumUtil(Node root, int sum, HashSet<Integer> set) {
		if (root == null)
			return false;

		if (set.contains(sum-root.data ))
			return true;
		set.add(root.data);
		boolean pairSumFound = pairSumUtil(root.left, sum, set);
		if (!pairSumFound)
			pairSumFound = pairSumUtil(root.right, sum, set);

		return pairSumFound;
	}

}
