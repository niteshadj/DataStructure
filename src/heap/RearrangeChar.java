/**
 * 
 */
package heap;

import java.util.HashMap;

/**
 * @author nadjriya
 * 
 *         Given a string S with repeated characters (only lowercase). The task
 *         is to rearrange characters in a string such that no two adjacent
 *         characters are same.
 * 
 *         Note : It may be assumed that the string has only lowercase English
 *         alphabets.
 * 
 *         Example 1:
 * 
 *         Input: S = geeksforgeeks Output: 1 Explanation: egeskerskegof can be
 *         one way of rearranging the letters.. Example 2:
 * 
 *         Input: S = bbbabaaacd Output: 1 Explanation: abababdcab can be one
 *         way of rearranging the letters.
 *
 * 
 */
public class RearrangeChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(rearrangeCharacters("aab"));
	}

	static boolean rearrangeCharacters(String str) {

		HashMap<Character, Integer> map = new HashMap<>();
		int maxCharAllowed = (int) Math.ceil((double)str.length() / 2);
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.get(str.charAt(i)) == null ? 1 : map.get(str.charAt(i)) + 1);
		}

		for (int value : map.values()) {
			if (value > maxCharAllowed)
				return false;
		}

		return true;
	}

}
