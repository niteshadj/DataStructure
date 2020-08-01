/**
 * 
 */
package string;

import java.util.Arrays;

/**
 * @author nadjriya
 * 
 *         Given a string S consisting of uppercase and lowercase characters.
 *         The task is to sort uppercase and lowercase letters separately such
 *         that if the ith place in the original string had an Uppercase
 *         character then it should not have a lowercase character after being
 *         sorted and vice versa.
 *
 */
public class CaseSpecificSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(caseSort("defRTSersUXI"));
	}

	public static String caseSort(String str) {
		char[] lowerCase = new char[str.length()];
		char[] upperCase = new char[str.length()];

		for (int i = 0; i < lowerCase.length; i++) {
			lowerCase[i] = '}';
			upperCase[i] = '}';
		}

		int j = 0;
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 96 && str.charAt(i) < 123) {
				lowerCase[j] = str.charAt(i);
				j++;
			} else if (str.charAt(i) > 64 && str.charAt(i) < 91) {
				upperCase[k] = str.charAt(i);
				k++;
			}

		}
		Arrays.sort(lowerCase);
		Arrays.sort(upperCase);
		char[] res = new char[str.length()];
		j = 0;
		k = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 96 && str.charAt(i) < 123) {
				res[i] = lowerCase[j];
				j++;
			} else if (str.charAt(i) > 64 && str.charAt(i) < 91) {
				res[i] = upperCase[k];
				k++;
			}
		}
		str = new String(res);
		return str;
	}

}
