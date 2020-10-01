/**
 * 
 */
package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author nadjriya
 * 
 *         Serialization is to store a tree in an array so that it can be later
 *         restored and Deserialization is reading tree back from the array. Now
 *         your task is to complete the function serialize which stores the tree
 *         into an array A[ ] and deSerialize which deserializes the array to
 *         tree and returns it. Note: The structure of tree must be maintained.
 *
 */
public class SerializeDeserializeTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		List<Integer> arr = new ArrayList<>();
		SerializeDeserializeTree ser = new SerializeDeserializeTree();
		ser.serialize(root, (ArrayList<Integer>) arr);
		System.out.println(arr);
		Node newRoot=ser.deSerialize((ArrayList<Integer>) arr);
		System.out.println(newRoot);

	}

	public void serialize(Node root, ArrayList<Integer> A) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {

			int size = queue.size();
			while (size-- > 0) {
				Node currNode = queue.poll();
				if (currNode.data != Integer.MAX_VALUE) {

					queue.add(currNode.left == null ? new Node(Integer.MAX_VALUE) : currNode.left);
					queue.add(currNode.right == null ? new Node(Integer.MAX_VALUE) : currNode.right);
				}
				A.add(currNode.data);
			}

		}

	}

	public Node deSerialize(ArrayList<Integer> A) {
		int size = A.size();
		Node root = new Node(A.get(0));
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		for (int i = 1; i < size;) {
			Node leftNode = null;
			Node rightNode = null;
			Node currNode = queue.poll();
			if (A.get(i) != Integer.MAX_VALUE){
				leftNode = new Node(A.get(i));
				queue.add(leftNode);
			}
			i++;
			if (A.get(i) != Integer.MAX_VALUE && i < size){
				rightNode = new Node(A.get(i));
				queue.add(rightNode);
			}
			i++;
			currNode.left = leftNode;
			currNode.right = rightNode;
		}

		return root;
	}

}
