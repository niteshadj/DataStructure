/**
 * 
 */
package string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nadjriya
 * 
 *         Given two strings 'str1' and 'str2', check if these two strings are
 *         isomorphic to each other. Two strings str1 and str2 are called
 *         isomorphic if there is a one to one mapping possible for every
 *         character of str1 to every character of str2 while preserving the
 *         order. Note: All occurrences of every character in ‘str1’ should map
 *         to the same character in ‘str2’ Input: 2 aab xxy aab xyz Output: 1 0
 *
 */
public class IsomorphicStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(areIsomorphic("aab", "xyz"));
	}

	public static boolean areIsomorphic(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		if (s1.equals(s2))
			return true;

		List<Integer> frequencyArr = new ArrayList<Integer>();
		int j = 0;
		frequencyArr.add(1);
		for (int i = 1; i < s1.length(); i++) {
			if (s1.charAt(i) == s1.charAt(i - 1)) {
				if (frequencyArr.get(j) == null)
					frequencyArr.set(j, 1);
				else
					frequencyArr.set(j, frequencyArr.get(j) + 1);
			} else {
				frequencyArr.add(1);
				j++;

			}
		}
		j = 0;
		for (int i = 0; i < s2.length() - 1;) {
			while (frequencyArr.get(j) != 1) {
				if (s2.charAt(i) != s2.charAt(i + 1)) {
					return false;
				}
				frequencyArr.set(j, frequencyArr.get(j) - 1);
				i++;
			}
			j++;
			i++;
		}
		for (int i = 0; i < frequencyArr.size(); i++) {
			if (frequencyArr.get(i) != 1)
				return false;
		}

		return true;
	}

}
