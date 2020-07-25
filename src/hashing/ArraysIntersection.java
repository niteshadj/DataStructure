/**
 * 
 */
package hashing;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author nadjriya
 *
 *         Given two arrays A and B respectively of size N and M. The task is to
 *         print the count of elements in the intersection (or common elements)
 *         of the two arrays. For this question, intersection of two arrays can
 *         be defined as the set containing distinct common elements between the
 *         two arrays.
 */
public class ArraysIntersection {

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

			System.out.println(findIntersection(a, n, b, m));
		}
	}

	private static int findIntersection(int[] a, int n, int[] b, int m) {
		HashSet<Integer> hashTable = new HashSet<>();
		int i;
		int count = 0;
		for (i = 0; i < n; i++) {
			hashTable.add(a[i]);
		}

		for (i = 0; i < m; i++) {
			if (hashTable.contains(b[i])) {
				hashTable.remove(b[i]);
				count++;
			}
		}

		return count;
	}

}
