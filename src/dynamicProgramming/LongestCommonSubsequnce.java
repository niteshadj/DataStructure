package dynamicProgramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

///https://leetcode.com/problems/longest-common-subsequence/
public class LongestCommonSubsequnce {

	public int longestCommonSubsequence(String text1, String text2) {
		int[][] dp = new int[text1.length()][text2.length()];
		for (int i = 0; i < text1.length(); i++) {
			Arrays.fill(dp[i], -1);
		}
		return lcs(text1, text1.length() - 1, text2, text2.length() - 1, dp);

	}

	private int lcs(String s1, int m, String s2, int n, int[][] dp) {

		if (m < 0 || n < 0)
			return 0;

		if (dp[m][n] != -1)
			return dp[m][n];

		if (s1.charAt(m) == s2.charAt(n)) {
			dp[m][n] = 1 + lcs(s1, m - 1, s2, n - 1, dp);
		} else
			dp[m][n] = Math.max(lcs(s1, m - 1, s2, n, dp), lcs(s1, m, s2, n - 1, dp));

		return dp[m][n];

	}

	public int longestCommonSubsequenceTabulation(String text1, String text2) {
		int[][] dp = new int[text1.length() + 1][text2.length() + 1];
		Arrays.fill(dp[0], 0);
		for (int i = 0; i < dp.length; i++)
			dp[i][0] = 0;

		for (int i = 1; i <= text1.length(); i++) {
			for (int j = 1; j <= text2.length(); j++) {
				if (text1.charAt(i - 1) == text2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}

		return dp[text1.length()][text2.length()];

	}

	@Test
	public void test_longestCommonSubsequence() {
		int res = longestCommonSubsequence("mhunuzqrkzsnidwbun", "szulspmhwpazoxijwbq");
		
		int res1 = longestCommonSubsequenceTabulation("bbbaaaba", "bbababbb");

		assertEquals(6, res);
		assertEquals(5, res1);
	}

}
