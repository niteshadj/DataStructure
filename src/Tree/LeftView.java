/**
 * 
 */
package tree;

/**
 * @author nadjriya
 * 
 * Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   
 *
 */
public class LeftView {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int  maxLevel=-1;
	void leftView(Node root)
    {
	
		printLeftView(root,0);
	
		
    }

	private void printLeftView(Node root, int level) {
		if(root==null)
			return;
		
		if(level>maxLevel){
			maxLevel=level;
			System.out.print(root.data+" ");
			
		}
		
		printLeftView(root.left, level+1);
		printLeftView(root.right, level+1);
		
	}

}
