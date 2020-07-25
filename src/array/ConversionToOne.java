/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author nadjriya
 *
 */
public class ConversionToOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		while (noOfTestcases > 0) {

			int num = sc.nextInt();

			System.out.println(convertToOne(num));
			noOfTestcases--;

		}

	}

	private static int convertToOne(int n) {
		if (n == 1) {
			return 0;
		}
		if(n==3){
			return 2;
		}
		if(n%2!=0)
		return 1+Math.min(convertToOne(n-1),convertToOne(n+1));
		else
			return 1 +convertToOne(n/2);
	}

	private static boolean isPowerOf2(int n) {
		if (n == 0) {
			return false;
		}

		if ((n & (n - 1)) == 0) {
			return true;
		} else {
			return false;
		}

	}

}
