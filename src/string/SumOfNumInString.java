/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given a string str containing alphanumeric characters. The task is to
 *         calculate the sum of all the numbers present in the string.
 *
 */
public class SumOfNumInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(findSum("1abc2x30yz67"));
	}

	public static long findSum(String s) {

		int sum = 0;

		for (int i = 0; i < s.length();) {
			if (s.charAt(i) < 58 && s.charAt(i) > 47) {
				int num = s.charAt(i) - 48;
				i++;
				while (i < s.length() && s.charAt(i) < 58 && s.charAt(i) > 47) {
					num = num * 10 + (s.charAt(i) - 48);
					i++;
				}

				sum = sum + num;
			}
			i++;
		}

		return sum;
	}

}
