/**
 * 
 */
package tree;

/**
 * @author nadjriya
 *
 */
public class VerticalWidth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int minHd = Integer.MAX_VALUE;
	static int maxHd = Integer.MIN_VALUE;

	public static int verticalWidth(Node root) {
		if(root==null)
			return 0;
		 minHd = Integer.MAX_VALUE;
		 maxHd = Integer.MIN_VALUE;
		calculateHorizontalDistance(root, 0);
		return (maxHd - minHd + 1);

	}

	private static void calculateHorizontalDistance(Node root, int hd) {
		if (root == null)
			return;
		minHd = Math.min(minHd, hd);
		maxHd = Math.max(maxHd, hd);
		calculateHorizontalDistance(root.left, hd - 1);
		calculateHorizontalDistance(root.right, hd + 1);

	}

}
