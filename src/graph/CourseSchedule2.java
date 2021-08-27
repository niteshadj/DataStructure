package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule2 {

	public static void main(String[] args) {

	}

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		int[] indegree = new int[numCourses];
		int[] res = new int[numCourses];
		List<Integer> response=new ArrayList<Integer>();
		
		List<List<Integer>> graph = formGraph(numCourses, prerequisites, indegree);
		Queue<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i < numCourses; i++) {
			if (indegree[i] == 0)
				queue.add(i);
		}
		int count = 0;
		while (!queue.isEmpty()) {
			int u = queue.poll();
			res[count] = u;
			count++;
			for (int v : graph.get(u)) {
				indegree[v]--;
				if (indegree[v] == 0)
					queue.add(v);
			}
		}
		if (count != numCourses)
			return new int[0];
		return res;

	}

	private List<List<Integer>> formGraph(int numCourses, int[][] prerequisites, int[] indegree) {
		List<List<Integer>> graph = new ArrayList();
		for (int i = 0; i < numCourses; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < prerequisites.length; i++) {
			graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
			indegree[prerequisites[i][0]]++;
		}
		return graph;
	}
}
