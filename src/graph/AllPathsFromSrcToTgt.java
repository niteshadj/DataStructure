package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathsFromSrcToTgt {

	public static void main(String[] args) {
		int[][] graph = { { 1, 2, 3 }, { 2 }, { 3 }, {} };

		AllPathsFromSrcToTgt sTt = new AllPathsFromSrcToTgt();
		System.out.println(sTt.allPathsSourceTarget(graph));
	}

	List<List<Integer>> res = new ArrayList<>();
	int count = 0;

	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		int n = graph.length;
		ArrayList<Integer> parentArr = new ArrayList<>();
		return dfs(graph, 0, n - 1, parentArr);

	}

	private List<List<Integer>> dfs(int[][] graph, int src, int tgt, ArrayList<Integer> parentArr) {

		parentArr.add(src);
		if (src == tgt) {
			res.add(count, new ArrayList<>(parentArr));
			count++;
		}
		for (int i = 0; i < graph[src].length; i++) {

			dfs(graph, graph[src][i], tgt, parentArr);
		}
		parentArr.remove(Integer.valueOf(src));
		return res;

	}

	private ArrayList<Integer> copyArr(ArrayList<Integer> parentArr) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < parentArr.size() - 1; i++) {
			res.add(parentArr.get(i));
		}
		return res;
	}

}
