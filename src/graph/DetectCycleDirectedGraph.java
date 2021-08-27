package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class DetectCycleDirectedGraph {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		graph.add(new ArrayList(Arrays.asList(1)));
		graph.add(new ArrayList());
		graph.add(new ArrayList(Arrays.asList(1, 3)));
		graph.add(new ArrayList(Arrays.asList(4)));
		graph.add(new ArrayList(Arrays.asList(5)));
		graph.add(new ArrayList(Arrays.asList(3)));

		System.out.println(DFS(graph, 6));
	}

	private static boolean DFS(ArrayList<ArrayList<Integer>> graph, int v) {
		boolean[] visited = new boolean[v];
		boolean[] recStack = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				if (isCycle(graph, i, visited, recStack))
					return true;
			}
		}

		return false;
	}

	private static boolean isCycle(ArrayList<ArrayList<Integer>> graph, int src, boolean[] visited,
			boolean[] recStack) {

		visited[src] = true;
		recStack[src] = true;

		for (int i = 0; i < graph.get(src).size(); i++) {
			int curr = graph.get(src).get(i);
			if (recStack[curr])
				return true;
			if (!visited[curr] && isCycle(graph, curr, visited, recStack)) {

				return true;
			}
		}
		recStack[src] = false;

		return false;
	}

}
