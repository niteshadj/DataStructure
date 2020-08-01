/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given a string S and a pattern P of lowercase characters. The task is
 *         to check if the pattern is present in string or not.
 *	Visit again
 */
public class RabinKarpPatternSearching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(search("ba", "abac", 101));
	
	}

	static int d = 256;

	static boolean search(String pat, String txt, int q) {

		if(pat.length()==0)
			return true;
		int patterHash = 0;
		for (int i = pat.length() - 1; i >= 0; i--) {

			patterHash = patterHash + (pat.charAt(i) - 96) * (int) Math.pow(d, pat.length() - 1 - i);

		}
		int textHash = 0;
		int i = 0;
		for (i = txt.length() - 1; i >= txt.length() - pat.length(); i--) {

			textHash = textHash + (txt.charAt(i) - 96) * (int) Math.pow(d, txt.length() - 1 - i);

		}

		if (textHash % q == patterHash % q) {
			int k = 0;
			for (; k < pat.length(); k++) {
				if (txt.charAt(i + k+1) != pat.charAt(k))
					break;
			}
			if (k == pat.length())
				return true;
		}

		int j = i;
		while (j >= 0) {
			textHash = ((textHash - (txt.charAt(j + pat.length()) - 96)) / d)
					+ (txt.charAt(j) - 96) * (int) Math.pow(d, pat.length() - 1);
			if(textHash<0)
				textHash=textHash+q;
			if (textHash % q == patterHash % q) {
				int k = 0;
				for (; k < pat.length(); k++) {
					if (txt.charAt(j + k) != pat.charAt(k))
						break;
				}
				if (k == pat.length())
					return true;
			}

			j--;
		}

		return false;
	}

}
