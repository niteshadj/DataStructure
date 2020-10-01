/**
 * 
 */
package tree.bst;

import java.util.ArrayList;
import java.util.List;

import tree.Node;

/**
 * @author nadjriya
 *
 */
public class MergeBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> merge(Node root1, Node root2) {
		ArrayList<Integer> res = new ArrayList<>();
		if (root1.data > root2.data)
			mergeUtil(root1, root2, res, false);
		else
			mergeUtil(root1, root2, res, true);

		return res;

	}

	private void mergeUtil(Node root1, Node root2, ArrayList<Integer> res, boolean isFirst) {

		if (isFirst && root1 == null)
			return;
		else if (!isFirst && root2 == null)
			return;
		
		if(isFirst){
			
			mergeUtil(root1.left, root2, res, isFirst);
			res.add(root1.data);
			
				
		}

	}

}
