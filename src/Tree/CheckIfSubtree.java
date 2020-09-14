/**
 * 
 */
package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author nadjriya
 * 
 *         Given two binary trees with head reference as T and S having at most
 *         N nodes. The task is to check if S is present as subtree in T. A
 *         subtree of a tree T1 is a tree T2 consisting of a node in T1 and all
 *         of its descendants in T1.
 *
 *
 *Check one more simpler solution by checking isIdentical for each subtree of T
 *
 */
public class CheckIfSubtree {

	/**
	 * @param args
	 */
	
	
static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
                
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }


	
public static void main (String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    
    int t=Integer.parseInt(br.readLine());
    while(t-- > 0){
        String tt= br.readLine();
        Node rootT = buildTree(tt);
        
        String s= br.readLine();
        Node rootS = buildTree(s);
       // printInorder(root);
        
        CheckIfSubtree tr=new CheckIfSubtree();
        boolean st=tr.isSubtree(rootT, rootS);
        if(st==true){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}

	public static boolean isSubtree(Node T, Node S) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		ArrayList<Integer> list11 = new ArrayList<>();
		ArrayList<Integer> list22 = new ArrayList<>();
		findInOrderTraversal(T, list1);
		findInOrderTraversal(S, list2);
		findPreOrder(T, list11);
		findPreOrder(S, list22);

		return checkIsSubArray(list2, list1) && checkIsSubArray(list22, list11);


	}

	private static boolean checkIsSubArray(ArrayList<Integer> list2, ArrayList<Integer> list1) {
		int i = 0;
		if(list1.size()<list2.size())
			return false;
		while (i < list1.size() ){
			if(list1.get(i).equals(list2.get(0))){
				int j = 0;
				int k=i;
				while (k < list1.size() && j < list2.size() && list1.get(k).equals(list2.get(j))) {
					k++;
					j++;
				}
				
				if (j == list2.size()){
					return true;
				}
				
					
			}
			i++;
		}
		
		return false;
	}

	private static void findInOrderTraversal(Node root, ArrayList<Integer> list) {
		if (root == null){
			list.add(Integer.MIN_VALUE);
			return;
		}

		findInOrderTraversal(root.left, list);

		list.add(root.data);

		findInOrderTraversal(root.right, list);

	}

	private static void findPreOrder(Node root, ArrayList<Integer> res) {

		if (root == null){
			res.add(Integer.MIN_VALUE);
			return;
		}

		res.add(root.data);
		findPreOrder(root.left, res);
		findPreOrder(root.right, res);

	}
}
