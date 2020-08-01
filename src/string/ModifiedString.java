/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Ishaan is playing with strings these days. He has found a new string.
 *         He wants to modify it as per the following rules to make it valid:
 * 
 *         The string should not have three consecutive same characters (Refer
 *         example for explanation). He can add any number of characters
 *         anywhere in the string. Find the minimum number of characters which
 *         Ishaan must insert in the string to make it valid.
 *
 */
public class ModifiedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(modified("aaaaaa"));
	}

	public static long modified(String s) {
		int res = 0;
		for (int i = 0; i < s.length();) {
			int j = i + 1;
			while (j < s.length() && s.charAt(i) == s.charAt(j)) {
				j++;
			}
			res = (j - i - 1) / 2 + res;
			i = j;
		}

		return res;
	}

}
