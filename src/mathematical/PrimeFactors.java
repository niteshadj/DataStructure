/**
 * 
 */
package mathematical;

/**
 * @author nadjriya
 *
 */
public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		findPrimeFactors(315);
		findPrimeFactorsEfficient(315);
	}

	public static void findPrimeFactorsEfficient(int n) {

		while (n % 2 == 0) {
			System.out.println(2);
			n=n/2;
		}

		for (int i = 3; i <= Math.sqrt(n);) {
			if (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
			else{
				i = i + 2;
			}
		}
		if(n>2){
			System.out.println(n);
		}
	}

	private static void findPrimeFactors(int n) {
		for (int i = 2; i <= n;) {
			if (n % i == 0) {
				System.out.println(i);
				n = n / i;
			} else {
				if (i == 2) {
					i++;
				} else {
					i = i + 2;
				}
			}
		}
	}

}
