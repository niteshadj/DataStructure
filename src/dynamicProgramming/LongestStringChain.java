package dynamicProgramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class LongestStringChain {

	public int longestStrChainDFS(String[] words) {

		int res = 0;

		Arrays.sort(words, (a, b) -> b.length() - a.length());

		HashSet<String> presentWords = new HashSet();

		int n = words.length;
		for (int i = 0; i < n; i++)
			presentWords.add(words[i]);

		HashMap<String, Integer> map = new HashMap();

		for (int i = 0; i < n; i++) {

			String currWord = words[i];
			int count = dfsHelper(presentWords, currWord, map);

			res = Math.max(res, count);
		}
		return res;
	}

	private int dfsHelper(HashSet<String> presentWords, String currWord, HashMap<String, Integer> map) {
		if (!presentWords.contains(currWord))
			return 0;
		if (map.containsKey(currWord))
			return map.get(currWord);
		if (currWord.length() == 1)
			return 1;
		int ans = 0;
		for (int j = 0; j < currWord.length(); j++) {

			StringBuilder sb = new StringBuilder();
			String next = sb.append(currWord.substring(0, j)).append(currWord.substring(j + 1)).toString();

			ans = Math.max(ans, 1 + dfsHelper(presentWords, next, map));

		}
		map.put(currWord, ans);
		return ans;
	}

	@Test
	public void testLongestStringChain() {
		String arr[] = { "x" };
		assertEquals(1, longestStrChainBU(arr));
	}

	public int longestStrChainBU(String[] words) {

		int res = 1;

		Arrays.sort(words, (a, b) -> a.length() - b.length());
		int n = words.length;

		HashMap<String, Integer> map = new HashMap();
		map.put(words[0], 1);

		for (int i = 1; i < n; i++) {

			String currWord = words[i];
			int currMax=0;
			for (int j = 0; j < currWord.length(); j++) {

				StringBuilder sb = new StringBuilder();
				String next = sb.append(currWord.substring(0, j)).append(currWord.substring(j + 1)).toString();
				currMax = Math.max(currMax, 1 + map.getOrDefault(next, 0));
				
			}
			map.put(currWord, currMax);
			res=Math.max(res, currMax);
		}
		return res;
	}
}
