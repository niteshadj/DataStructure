/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given a binary string S. The task is to count the number of
 *         substrings that start and end with 1. For example, if the input
 *         string is “00100101”, then there are three substrings “1001”,
 *         “100101” and “101”.
 *
 */
public class BinaryString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(binarySubstring(5, "01101"));
	}

	public static int binarySubstring(int a, String str) {
		char[] arr = str.toCharArray();
		int n = 0;
		for (int i = 0; i < a; i++) {
			if (arr[i] == '1')
				n++;
		}

		return (n * (n - 1) / 2);
	}

}
