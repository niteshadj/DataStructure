/**
 * 
 */
package bitmagic;

/**
 * @author nadjriya
 *
 */
public class OneOddOccuring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 4, 3, 4, 4, 4, 5, 4, 5, 4 };
		findOnlyOddOccuringNo(array);
		int[] arrayDisctinct = { 4, 3, 1, 2, 6 };
		findMissingNoInDistinctArrayOfRange(arrayDisctinct,6);
	}

	// You are given a list of n-1 integers and these integers are in the range
	// of 1 to n. There are no duplicates in the list. One of the integers is
	// missing in the list.
	private static void findMissingNoInDistinctArrayOfRange(int[] array, int n) {
		
		int x = 0;
		int y=0;
		for (int i = 0; i < array.length; i++) {
			x = x ^ array[i];
		}
		
		for (int i = 0; i <= n; i++) {
			y = y ^ i;
		}
		
		System.out.println(x^y);
	}

	// x^x=0 and x^0=x
	private static void findOnlyOddOccuringNo(int[] array) {
		int res = 0;
		for (int i = 0; i < array.length; i++) {
			res = res ^ array[i];
		}
		System.out.println(res);
	}

}
