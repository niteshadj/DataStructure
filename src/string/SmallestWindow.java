/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given two strings. Find the smallest window in the first string
 *         consisting of all the characters of the second string.
 *
 */
public class SmallestWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(smallestWindow("zoomlazapzo", "oza"));
	}

	public static String smallestWindow(String s, String p) {
		String res = "-1";
		int[] patFreq = new int[256];
		int[] stringFreq = new int[256];

		for (int i = 0; i < p.length(); i++) {
			patFreq[p.charAt(i)]++;
		}

		int count = 0;
		int startIdx = 0;
		int start = -1;
		int minLength = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			stringFreq[s.charAt(i)]++;
			if (patFreq[s.charAt(i)] > 0 && stringFreq[s.charAt(i)] <= patFreq[s.charAt(i)])
				count++;

			if (count == p.length()) {
				while (patFreq[s.charAt(startIdx)] == 0
						|| stringFreq[s.charAt(startIdx)] > patFreq[s.charAt(startIdx)]) {

					stringFreq[s.charAt(startIdx)]--;
					startIdx++;

				}
				int length = i - startIdx + 1;
				if (minLength > length) {
					minLength = length;
					start = startIdx;
				}

			}
		}

		if (start == -1) {
			return "-1";
		}
		return s.substring(start, start + minLength);

	}

}
