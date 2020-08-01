/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given a number 'N'. The task is to find the Nth number whose each
 *         digit is a prime number i.e 2, 3, 5, 7. In other words you have to
 *         find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.
 *
 */
public class NthPrimeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(primeDigits(22));
	}

	public static int primeDigits(int n) {
		String s = "";
		while (n != 0) {
			int rem = (n % 4);
			switch (rem) {
			case 1:
				s = String.valueOf(2) + s;
				break;
			case 2:
				s = String.valueOf(3) + s;
				break;
			case 3:
				s = String.valueOf(5) + s;
				break;
			case 0:
				s = String.valueOf(7) + s;
				break;

			}
			if (n % 4 == 0)
				n--;
			n = n / 4;
		}

		return Integer.parseInt(s);
	}

}
