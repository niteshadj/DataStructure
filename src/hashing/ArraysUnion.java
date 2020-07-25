/**
 * 
 */
package hashing;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author nadjriya
 *
 */
public class ArraysUnion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[m];
			for (int i = 0; i < n; i++) {

				a[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {

				b[i] = sc.nextInt();
			}

			System.out.println(findUnion(a, n, b, m));
		}
	}

	private static int findUnion(int[] a, int n, int[] b, int m) {
		HashSet<Integer> hashTable = new HashSet<>();
		int i;
		int count = 0;
		for (i = 0; i < n; i++) {
			hashTable.add(a[i]);
		}

		for (i = 0; i < m; i++) {
			hashTable.add(b[i]);
		}

		return hashTable.size();
	}

}
