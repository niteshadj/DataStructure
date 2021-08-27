package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CloneGraph {

	public static void main(String[] args) {

	}

	public Node cloneGraph(Node node) {

		if (node == null)
			return null;
		HashMap<Integer, Node> map = new HashMap<Integer, Node>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		Node root = new Node(node.val);
		map.put(root.val, root);

		while (!queue.isEmpty()) {
			Node currNode = queue.poll();
			Node newNode = null;
			if (!map.containsKey(currNode.val)) {
				newNode = new Node(currNode.val);
				map.put(newNode.val, newNode);
			} else {
				newNode = map.get(currNode.val);
			}

			for (Node curr : currNode.neighbors) {
				if (!map.containsKey(curr.val)) {
					Node temp = new Node(curr.val);
					map.put(temp.val, temp);
					newNode.neighbors.add(temp);
					queue.add(curr);
				} else {
					newNode.neighbors.add(map.get(curr.val));
				}
			}

		}

		return root;

	}

}

class Node {
	public int val;
	public List<Node> neighbors;

	public Node() {
		val = 0;
		neighbors = new ArrayList<Node>();
	}

	public Node(int _val) {
		val = _val;
		neighbors = new ArrayList<Node>();
	}

	public Node(int _val, ArrayList<Node> _neighbors) {
		val = _val;
		neighbors = _neighbors;
	}
}
