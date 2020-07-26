/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given two strings a and b consisting of lowercase characters. The
 *         task is to check whether two given strings are an anagram of each
 *         other or not. An anagram of a string is another string that contains
 *         the same characters, only the order of characters can be different.
 *         For example, “act” and “tac” are an anagram of each other.
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isAnagram("geeksforgeeks", "forgeeksgeeks"));
	}

	public static boolean isAnagram(String s1, String s2) {
		int[] setArr = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			setArr[s1.charAt(i) - 97] = setArr[s1.charAt(i) - 97] + 1;
		}

		for (int i = 0; i < s2.length(); i++) {
			if (setArr[s2.charAt(i) - 97] <= 0)
				return false;
			setArr[s2.charAt(i) - 97] = setArr[s2.charAt(i) - 97] - 1;
		}
		for (int i = 0; i < 26; i++) {
			if (setArr[i] !=0)
				return false;
		}
		return true;
	}

}
