package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class DetectCycleUndirectedGraph {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		graph.add(new ArrayList(Arrays.asList(1)));
		graph.add(new ArrayList(Arrays.asList(0)));

		System.out.println(isCyclic(graph, 0, 6));
	}

	private static boolean isCyclic(ArrayList<ArrayList<Integer>> graph, int src, int v) {

		boolean[] visited = new boolean[v];

		Queue<Integer> queue = new ArrayDeque<>();

		queue.add(src);

		while (!queue.isEmpty()) {

			int temp = queue.remove();
			if (visited[temp])
				return true;

			visited[temp] = true;

			for (int i = 0; i < graph.get(temp).size(); i++) {
				if (!visited[graph.get(temp).get(i)]) {
					queue.add(graph.get(temp).get(i));
				}
			}

		}

		return false;
	}

}
