package dynamicProgramming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ShortestCommonSubsequence {

	public String shortestCommonSupersequence(String str1, String str2) {
		
		StringBuilder res = new StringBuilder();

		char[] lcs = longestCommonSubsequenceTabulation(str1, str2).toCharArray();
		int j=0;
		int i=0;
		for(char c:lcs) {
			while(str1.charAt(i)!=c) {
				res.append(str1.charAt(i));
				i++;
			}
			while(str2.charAt(j)!=c) {
				res.append(str2.charAt(j));
				j++;
			}
			res.append(c);
			i++;
			j++;
						
		}
		
		res.append(str1.substring(i)).append(str2.substring(j));
		
			
		
		return res.toString();

	}

	public String longestCommonSubsequenceTabulation(String text1, String text2) {

		StringBuilder res = new StringBuilder();
		int[][] dp = new int[text1.length() + 1][text2.length() + 1];
		Arrays.fill(dp[0], 0);
		for (int i = 0; i < dp.length; i++)
			dp[i][0] = 0;

		for (int i = 1; i <= text1.length(); i++) {
			for (int j = 1; j <= text2.length(); j++) {
				if (text1.charAt(i - 1) == text2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		int i = text1.length();
		int j = text2.length();
		while (i > 0 && j > 0) {
			if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
				res = res.append(text1.charAt(i - 1));
				i--;
				j--;
			} else {
				if (dp[i - 1][j] > dp[i][j - 1])
					i--;
				else
					j--;
			}
		}

		return res.reverse().toString();

	}

	@Test
	public void shortestCommonSupersequenceTest() {
		assertEquals("bbbaaababbb", shortestCommonSupersequence("bbbaaaba", "bbababbb"));
	}

}
