/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given two strings s1 and s2. Modify both the strings such that all
 *         the common characters of s1 and s2 are to be removed and the uncommon
 *         characters of s1 and s2 are to be concatenated. Note: If all
 *         characters are removed print -1.
 *
 */
public class RemoveCommon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(concatenatedString("aacdb", "gafd"));
	}

	public static String concatenatedString(String s1, String s2) {
		String result = "-1";
		int[] freqCount = new int[128];
		for (int i = 0; i < s2.length(); i++) {
			if (freqCount[s2.charAt(i)] == 0)
				freqCount[s2.charAt(i)] = 1;
		}

		for (int i = 0; i < s1.length(); i++) {
			if (freqCount[s1.charAt(i)] == 0)
				result = result + s1.charAt(i);
			if (freqCount[s1.charAt(i)] == 1)
				freqCount[s1.charAt(i)] = 2;
		}

		for (int i = 0; i < s2.length(); i++) {
			if (freqCount[s2.charAt(i)] != 2)
				result = result + s2.charAt(i);
		}
		return result;

	}

}
