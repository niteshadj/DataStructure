/**
 * 
 */
package Tree;

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
	
	public static int verticalWidth(Node root)
	{
		if(root==null)
			return 0;
		Node temp=root.left;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.left;
		}
		temp=root.right;
		while(temp!=null){
			count++;
			temp=temp.right;
		}
		
		return count+1;
		
	}

}
