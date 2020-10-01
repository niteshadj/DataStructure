/**
 * 
 */
package tree.bst;

import java.util.Scanner;

import tree.Node;

/**
 * @author nadjriya
 * 
 * Given a Binary Search Tree (BST) and a range l-h(inclusive), count the number of nodes in the BST that lie in the given range.

The values smaller than root go to the left side
The values greater and equal to the root go to the right side
Example 1:

Input:
      10
     /  \
    5    50
   /    /  \
  1    40  100
l = 5, h = 45
Output: 3
Explanation: 5 10 40 are the node in the
range
 *
 */
public class CountInRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    Node root=null;
		    int sizeOfArray=sc.nextInt();
		    int arr[]=new int[sizeOfArray];
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        int x=sc.nextInt();
		        arr[i]=x;
		    }
		   
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        root=Geeks.newNode(root,arr[i]);
		    }
		    int l,h;
		    l=sc.nextInt();
		    h=sc.nextInt();
		    System.out.println(getCountOfNode(root,l,h));
		
		}
	}

	static int count = 0;

	public static int getCountOfNode(Node root, int l, int h) {
		getCountOfNodeutil(root, l, h);

		return count;

	}

	private static void getCountOfNodeutil(Node root, int l, int h) {

		if (root == null)
			return;

		if(root.data >l)
		getCountOfNodeutil(root.left, l, h);

		if (root.data >= l && root.data <= h)
			count++;

		if(root.data <=h)
		getCountOfNodeutil(root.right, l, h);

	}

}

class Geeks
{
    public static Node createNewNode(int value)
    {
        Node temp=new Node(value);
        
        return temp;
    }
    static public Node newNode(Node root,int data)
    {
        if(root==null)
        root=createNewNode(data);
        else if(data<root.data)
        root.left=newNode(root.left,data);
        else
        root.right=newNode(root.right,data);
        
        return root;
    }}
