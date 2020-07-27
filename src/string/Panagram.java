/**
 * 
 */
package string;

/**
 * @author nadjriya
 *
 *         Given a string check if it is Pangram or not. A pangram is a sentence
 *         containing every letter in the English Alphabet.
 */
public class Panagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(checkPangram("sdfs"));
	}

	public static boolean checkPangram(String s) {
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 123 && s.charAt(i) > 96) {
				arr[s.charAt(i) - 97] = 1;
			}
			if (s.charAt(i) < 91 && s.charAt(i) > 64) {
				arr[s.charAt(i) - 65] = 1;
			}

		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] != 1)
				return false;
		}
		return true;
	}

}
