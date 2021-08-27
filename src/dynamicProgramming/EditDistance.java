package dynamicProgramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class EditDistance {

	public int minDistance(String word1, String word2) {

		return findMinOp(word1, word2, word1.length(), word2.length());
	}

	private int findMinOp(String word1, String word2, int m, int n) {

		if (m == 0)
			return n;
		if (n == 0)
			return m;

		if (word1.charAt(m - 1) == word2.charAt(n - 1))
			return findMinOp(word1, word2, m - 1, n - 1);

		return 1 + Math.min(Math.min(findMinOp(word1, word2, m, n - 1), findMinOp(word1, word2, m - 1, n)),
				findMinOp(word1, word2, m - 1, n - 1));

	}

	public int minDistanceTabulation(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();
		int[][] dp = new int[m + 1][n + 1];

		for (int i = 0; i < m + 1; i++) {
			dp[i][0] = i;
		}

		for (int i = 0; i < n + 1; i++) {
			dp[0][i] = i;
		}

		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (word1.charAt(i - 1) == word2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1];
				else {
					dp[i][j] = 1+Math.min(Math.min(dp[i][j - 1], dp[i-1][j]),
							dp[i-1][j - 1]);
				}
			}
		}

		return dp[m][n];
	}

	@Test
	public void minDistanceTest() {
		//assertEquals(5, minDistance("dinitrophenylhydrazine", "benzalphenylhydrazone"));
		assertEquals(7, minDistanceTabulation("dinitrophenylhydrazine", "benzalphenylhydrazone"));
	}

}
