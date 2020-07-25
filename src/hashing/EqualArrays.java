/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given two arrays A and B of equal size, the task is to find if given
 *         arrays are equal or not. Two arrays are said to be equal if both of
 *         them contain same set of elements, arrangements (or permutation) of
 *         elements may be different though.
 *
 */
public class EqualArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			long a[] = new long[n];
			long b[] = new long[n];
			for (int i = 0; i < n; i++) {

				a[i] = sc.nextLong();
			}
			for (int i = 0; i < n; i++) {

				b[i] = sc.nextLong();
			}
			System.out.println(isArraysEqual(a, b, n));
		}
		
	}

	private static int isArraysEqual(long[] a, long[] b, int n) {
		HashMap<Long, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!hashMap.containsKey(a[i]))
				hashMap.put(a[i], 1);
			else
				hashMap.put(a[i], hashMap.get(a[i]) + 1);
		}

		for (int i = 0; i < n; i++) {
			if (!hashMap.containsKey(b[i]))
				return 0;
			if(hashMap.get(b[i])==0)
				return 0;
			hashMap.put(b[i], hashMap.get(b[i]) - 1);
		}
		
		return 1;
	}

}
