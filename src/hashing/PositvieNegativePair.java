/**
 * 
 */
package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given an array of distinct integers, find all the pairs having
 *         negative and positive value of a number that exists in the array.
 *
 */
public class PositvieNegativePair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {

				a[i] = sc.nextInt();
			}

			System.out.println(findPairs(a, n));

		}
	}

	// can be further optimized for distinct , no need to check for negate
	public static ArrayList<Integer> findPairs(int arr[], int n) {
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (set.contains(Math.negateExact(arr[i]))) {
				res = Math.abs(arr[i]);
				list.add(-res);
				list.add(res);
				set.remove(Math.negateExact(arr[i]));
			}
			set.add(arr[i]);
		}

		return list;
	}

}
