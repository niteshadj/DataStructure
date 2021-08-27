package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class ShortestPathUnweightedGraph {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		graph.add(new ArrayList(Arrays.asList(1, 2, 4)));
		graph.add(new ArrayList(Arrays.asList(0, 3)));
		graph.add(new ArrayList(Arrays.asList(0, 3, 4)));
		graph.add(new ArrayList(Arrays.asList(1, 2, 5)));
		graph.add(new ArrayList(Arrays.asList(0, 2, 5)));
		graph.add(new ArrayList(Arrays.asList(3, 4)));
		BFS(graph, 0, 6);
	}

	public static void BFS(ArrayList<ArrayList<Integer>> graph, int source, int v) {
		boolean[] visited = new boolean[v];


		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(source);
		visited[0] = true;
		int count = 0;
		int size = 1;
		while (!queue.isEmpty()) {
			if (size == 0) {
				count++;
				size = queue.size();
			}
			int u = queue.poll();
			size--;
			System.out.println(count);

			for (int i = 0; i < graph.get(u).size(); i++) {
				if (!visited[graph.get(u).get(i)]) {
					queue.add(graph.get(u).get(i));
					visited[graph.get(u).get(i)] = true;
				}
			}
		}

		// return res;
	}

}
