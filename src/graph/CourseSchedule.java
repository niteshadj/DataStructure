package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

	public static void main(String[] args) {

	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] indegree = new int[numCourses];
		List<List<Integer>> graph = formGraph(numCourses, prerequisites, indegree);
		Queue<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i < numCourses; i++) {
			if (indegree[i] == 0)
				queue.add(i);
		}
		int count = 0;
		while (!queue.isEmpty()) {
			int u = queue.poll();
			count++;
			for (int v : graph.get(u)) {
				indegree[v]--;
				if (indegree[v] == 0)
					queue.add(v);
			}
		}
		return (count == numCourses);

	}

	private List<List<Integer>> formGraph(int numCourses, int[][] prerequisites, int[] indegree) {
		List<List<Integer>> graph = new ArrayList();
		for (int i = 0; i < numCourses; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < prerequisites.length; i++) {
			graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
			indegree[prerequisites[i][1]]++;
		}
		return graph;
	}
}
