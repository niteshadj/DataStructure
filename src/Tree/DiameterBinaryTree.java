/**
 * 
 */
package Tree;

/**
 * @author nadjriya
 *
 */
public class DiameterBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	
	int MaxDiameter=Integer.MIN_VALUE;
	
	int diameter(Node root) {
		if(root==null)
			return 0;
		if(root.left==null&&root.right==null)
			return 1;
		
		diameterForLCA(root);
		
		return MaxDiameter;
		
    }

	private int diameterForLCA(Node root) {
		
		if(root==null)
			return 0;
		
		int leftHeight=diameterForLCA(root.left);
		int rightHeight=diameterForLCA(root.right);
		
		int diameter=(leftHeight+rightHeight+1);
		
		MaxDiameter=Math.max(diameter, MaxDiameter);
		int height=Math.max(leftHeight, rightHeight)+1;
		
		return height;
		
	}

}
