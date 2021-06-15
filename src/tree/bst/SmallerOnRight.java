/**
 * 
 */
package tree.bst;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

import tree.Node;

/**
 * @author nadjriya
 * 
 *         Given an array arr[] of N elements. The task is to count maximum
 *         number of distinct smaller elements on right side of any array
 *         element. For example, in {10, 6, 9, 7, 20, 19, 21, 18, 17, 16}, the
 *         result is 4. Note that 20 has maximum 4 smaller elements on right
 *         side. Other elements have less count, for example 10 has 3 smaller
 *         elements on right side.
 * 
 *         Input: First line of input contains number of testcases T. For each
 *         testcase, first line of input contains number of elements in the
 *         array and next line contains array elements.
 * 
 *         Output: For each testcase, print the maximum count of smaller
 *         elements on right side.
 *         Example:
Input:
4
10
10 6 9 7 20 19 21 18 17 16
5
5 4 3 2 1
5
1 2 3 4 5
5
1 2 3 2 1

Output:
4
4
0
2
 *
 */
public class SmallerOnRight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int size = sc.nextInt();
			int count=0;
			TreeSet<Integer> set=new TreeSet<>();
			ArrayList<Integer> list=new ArrayList<>();
			for (int i = 0; i < size; i++) {
				list.add(sc.nextInt());
			}
			for (int i = size-1; i >= 0; i--) {
				int elem=list.get(i);
				set.add(elem);
				count=Math.max(count, set.headSet(elem).size());
			//	count=findMaxCount(list);
			}
			System.out.println(count);

		}
	}

	private static int findMaxCount(ArrayList<Integer> list) {
		int count = 0;
		Node root = null;
		root=insert(root, list.get(list.size() - 1));
		for (int i = list.size() - 2; i >= 0; i--) {
			insert(root, list.get(i));

		}
		for (int i = 0; i < list.size(); i++) {
			Math.max(count, search(root, list.get(i)));
		}
		return count;
	}

	static int search(Node root, int x) {
		if (root == null) {
			return -1;
		}

		Node currNode = root;

		while (currNode != null) {
			if (currNode.data == x)
				return currNode.lCount;
			else if (currNode.data > x) {
				currNode = currNode.left;
			} else {
				currNode = currNode.right;
			}
		}

		return -1;

	}

	static Node insert(Node root, int Key) {
		if (root == null) {
			root = new Node(Key);
			return root;
		}

		Node currNode = root;
		Node prevNode = null;

		while (currNode != null) {
			if (currNode.data == Key)
				return root;
			else if (currNode.data > Key) {
				currNode.lCount++;
				prevNode = currNode;
				currNode = currNode.left;
			} else {
				currNode.rCount++;
				prevNode = currNode;
				currNode = currNode.right;
			}
		}

		if (Key > prevNode.data)
			prevNode.right = new Node(Key);
		else
			prevNode.left = new Node(Key);

		return root;

	}

}
