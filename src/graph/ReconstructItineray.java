package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;

public class ReconstructItineray {

	public static void main(String[] args) {
		List<List<String>> tickets = new ArrayList(Arrays.asList(Arrays.asList("MUC", "LHR"),
				Arrays.asList("JFK", "MUC"), Arrays.asList("SFO", "SJC"), Arrays.asList("LHR", "SFO")));
		ReconstructItineray itineray = new ReconstructItineray();
		System.out.println(itineray.findItinerary(tickets));

	}

	public List<String> findItinerary(List<List<String>> tickets) {
		List<String> res = new ArrayList();
		HashMap<String, TreeSet<String>> map = populateMap(tickets);
		HashSet<String> visited = new HashSet<String>();
		Queue<String> queue = new LinkedList<>();
		queue.add("JFK");
		while (!queue.isEmpty()) {
			String s1 = queue.poll();
			res.add(s1);
			TreeSet<String> set = map.get(s1);
			if (set != null) {
				for (String s2 : set) {
					if (!visited.contains(s1 + "_" + s2)) {
						queue.add(s2);
						visited.add(s1 + "_" + s2);
						break;
					}
				}
			}
		}

		return res;
	}

	private HashMap<String, TreeSet<String>> populateMap(List<List<String>> tickets) {
		HashMap<String, TreeSet<String>> map = new HashMap<>();
		for (List<String> dests : tickets) {
			if (map.containsKey(dests.get(0))) {
				TreeSet<String> temp = map.get(dests.get(0));
				temp.add(dests.get(1));
				map.put(dests.get(0), temp);
			} else {
				TreeSet<String> temp = new TreeSet<String>();
				temp.add(dests.get(1));
				map.put(dests.get(0), temp);
			}
		}
		//System.out.println(map);
		return map;
	}

}
