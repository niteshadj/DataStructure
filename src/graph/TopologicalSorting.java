package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

//Kahn's Algo
public class TopologicalSorting {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		graph.add(new ArrayList(Arrays.asList(2, 3)));
		graph.add(new ArrayList(Arrays.asList(3, 4)));
		graph.add(new ArrayList());
		graph.add(new ArrayList());
		graph.add(new ArrayList());

		System.out.println(modifedBFS(graph, 5));

		System.out.println(modifiedDFS(graph, 5));

	}

	private static ArrayList modifiedDFS(ArrayList<ArrayList<Integer>> graph, int v) {
		ArrayList<Integer> res = new ArrayList<>();
		boolean[] visited = new boolean[v];
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				dfs(graph, i, v, stack, visited);
			}
		}
		while (!stack.isEmpty())
			res.add(stack.pop());
		return res;
	}

	private static void dfs(ArrayList<ArrayList<Integer>> graph, int src, int v, Stack<Integer> stack,
			boolean[] visited) {

		visited[src] = true;

		for (int i = 0; i < graph.get(src).size(); i++) {
			if (!visited[graph.get(src).get(i)]) {
				dfs(graph, graph.get(src).get(i), v, stack, visited);
			}
		}

		stack.push(src);

	}

	private static ArrayList modifedBFS(ArrayList<ArrayList<Integer>> graph, int v) {

		ArrayList<Integer> res = new ArrayList<>();

		int[] indegree = populateIndegree(graph, v);

		Queue<Integer> queue = new ArrayDeque<>();

		for (int i = 0; i < v; i++) {
			if (indegree[i] == 0)
				queue.add(i);
		}

		while (!queue.isEmpty()) {
			int curr = queue.poll();
			res.add(curr);
			for (int i = 0; i < graph.get(curr).size(); i++) {
				int temp = graph.get(curr).get(i);
				indegree[temp]--;
				if (indegree[temp] == 0)
					queue.add(temp);

			}
		}

		return res;
	}

	private static int[] populateIndegree(ArrayList<ArrayList<Integer>> graph, int v) {

		int[] indegree = new int[v];
		for (int i = 0; i < graph.size(); i++) {
			for (int j = 0; j < graph.get(i).size(); j++) {
				indegree[graph.get(i).get(j)]++;
			}
		}
		return indegree;
	}

}
