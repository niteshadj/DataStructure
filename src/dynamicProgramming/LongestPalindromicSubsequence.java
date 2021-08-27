package dynamicProgramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LongestPalindromicSubsequence {

	public int longestPalindromeSubseq(String s) {

		String s2 = new StringBuilder(s).reverse().toString();
		int m = s.length();
		int n = m;
		int[][] memo = new int[m + 1][n + 1];

		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				memo[i][j] = -1;
			}
		}

		return longestPalindromeSubseqUtil(s, s2, m, n, memo);
	}

	public int longestPalindromeSubseqUtil(String s1, String s2, int m, int n, int[][] memo) {
		if (m <= 0 || n <= 0)
			return 0;
		if (memo[m][n] != -1)
			return memo[m][n];

		if (s1.charAt(m - 1) == s2.charAt(n - 1))
			memo[m][n] = 1 + longestPalindromeSubseqUtil(s1, s2, m - 1, n - 1, memo);
		else
			memo[m][n] = Math.max(longestPalindromeSubseqUtil(s1, s2, m, n - 1, memo),
					longestPalindromeSubseqUtil(s1, s2, m - 1, n, memo));
		return memo[m][n];
	}

	public int longestPalindromeSubseqTabulation(String s) {

		String s2 = new StringBuilder(s).reverse().toString();
		int m = s.length();
		int n = m;
		int[][] memo = new int[m + 1][n + 1];

		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (s.charAt(i - 1) == s2.charAt(j - 1))
					memo[i][j] = 1 + memo[i - 1][j - 1];
				else {
					memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
				}
			}
		}

		return memo[m][n];
	}

	@Test
	public void longestPalindromeSubseqTest() {

		assertEquals(1, longestPalindromeSubseq("cd"));
		assertEquals(4, longestPalindromeSubseqTabulation("bbbab"));
	}
}
