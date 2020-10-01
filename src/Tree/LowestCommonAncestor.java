/**
 * 
 */
package tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author nadjriya
 * 
 *         Given a Binary Tree with all unique values and two nodes value n1 and
 *         n2. The task is to find the lowest common ancestor of the given two
 *         nodes. We may assume that either both n1 and n2 are present in the
 *         tree or none of them is present.
 * 
 *         Example 1:
 * 
 *         Input: n1 = 2 , n2 = 3
 * 
 *         1 / \ 2 3 Output: 1
 *
 */
public class LowestCommonAncestor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root =new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		LowestCommonAncestor Lca=new LowestCommonAncestor();
		System.out.println(Lca.lca(root, 2, 3).data);

	}

	Node lca(Node root, int n1, int n2) {
		List<Node> list1 = new ArrayList<>();
		List<Node> list2 = new ArrayList<>();

		int i = findPath(root, n1, list1);
		if (i != n1)
			return null;

		i = findPath(root, n2, list2);
		if (i != n2)
			return null;
		
		int length=Math.min(list1.size(), list2.size());
		Node prev=null;
		for(int j=0;j<length;j++){
			if(list1.get(j).data==list2.get(j).data)
				prev=list1.get(j);
			else
				return prev;
		}

		return prev;

	}

	private int findPath(Node root, int n1, List<Node> list1) {

		if (root == null)
			return -1;

		if (root.data == n1) {
			list1.add(root);
			return n1;
		}

		list1.add(root);

		int j=findPath(root.left, n1, list1);
		if(j==n1)
			return n1;
		int i=findPath(root.right, n1, list1);
		if(i==n1)
			return n1;
		
		list1.remove(root);
		
		return Math.max(j,i );

	}

}
