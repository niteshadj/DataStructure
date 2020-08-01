/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         You are given a string S of lowercase characters, find the rank of
 *         the string amongst its permutations when sorted lexicographically.
 *         Return 0 if the characters are repeated in the string. Note: Return
 *         the rank%1000000007 as the answer as rank might overflow.
 *
 */
public class LexicographicRank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(findRank("vsrtkjpre"));
	}

	static int findRank(String s) {
		long rank = 0;

		int[] char1 = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if(char1[s.charAt(i) - 97]==1)
				return 0;
			char1[s.charAt(i) - 97] = 1;
		}
		int prefixCount = 0;
		for (int i = 0; i < 26; i++) {
			if (char1[i] == 1) {
				char1[i] = prefixCount;
				prefixCount++;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 97;
			rank = rank + char1[s.charAt(i) - 97] * fact(s.length() - i - 1);

			while (index < 26) {
				if (char1[index] > 0)
					char1[index]--;
				index++;
			}

		}
		rank++;
		return (int) (rank % 1000000007);
	}

	private static int fact(int n) {
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = ans * i;
		}
		return ans;
	}

}
