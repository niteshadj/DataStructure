/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given a string S consisting of lowercase Latin Letters. Find the
 *         first non-repeating character in S.
 *
 */
public class FirstNonRepeating {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(nonrepeatingCharacter("zxvczbtxyzvy"));
	}

	static char nonrepeatingCharacter(String s) {

		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 97] = arr[s.charAt(i) - 97] + 1;
		}

		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i) - 97] == 1)
				return s.charAt(i);
		}

		return '$';
	}

}
