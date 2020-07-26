/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         You are given a string S (both uppercase and lowercase characters).
 *         You need to print the repeated character whose first appearance is
 *         leftmost.
 */
public class FirstRepeatingCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(repeatedCharacter("geeksforgeeks"));
	}

	static int repeatedCharacter(String s) {
		int[] arr = new int[128];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
		}

		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i)] > 1)
				return i;
		}
		return -1;
	}

}
