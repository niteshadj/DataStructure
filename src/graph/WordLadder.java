package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/word-ladder/
public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
		WordLadder la = new WordLadder();
		System.out.println(la.ladderLength("hit", "cog", wordList));

	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> allWords = new HashSet<>();
		for (String word : wordList) {
			allWords.add(word);
		}
		allWords.add(beginWord);
		if (!allWords.contains(endWord))
			return 0;

		Map<String, List<String>> graph = buildGraph(allWords);
		System.out.println(graph);

		int res = performBFS(graph, beginWord, endWord);

		return res;

	}

	private int performBFS(Map<String, List<String>> graph, String beginWord, String endWord) {

		Set<String> visited = new HashSet<>();
		Queue<String> queue = new LinkedList<>();
		queue.add(beginWord);
		visited.add(beginWord);
		int level = 0;
		while (!queue.isEmpty()) {
			String currWord = queue.poll();
			for (int i = 0; i < graph.get(currWord).size(); i++) {
				String currEndWord = graph.get(currWord).get(i);
				if (currEndWord == endWord)
					return level + 1;
				if (!visited.contains(currEndWord)) {
					visited.add(currEndWord);
					queue.add(currEndWord);
				}

			}

			level++;

		}

		return ++level;

	}

	private Map<String, List<String>> buildGraph(Set<String> allWords) {
		Map<String, List<String>> graph = new HashMap();
		for (String word1 : allWords) {

			for (String word2 : allWords) {
				if (isSingleCharDiff(word1, word2)) {
					List<String> connections = graph.getOrDefault(word1, new ArrayList<>());
					connections.add(word2);
					graph.put(word1, connections);

					
				}
			}
		}

		return graph;
	}

	private boolean isSingleCharDiff(String word1, String word2) {

		boolean isSingleDiffFound = false;

		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) != word2.charAt(i)) {
				if (!isSingleDiffFound) {
					isSingleDiffFound = true;

				} else
					return false;
			}
		}

		return isSingleDiffFound;
	}

}
