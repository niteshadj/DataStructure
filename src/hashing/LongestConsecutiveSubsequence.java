/**
 * 
 */
package hashing;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given an array of positive integers. Find the length of the longest
 *         sub-sequence such that elements in the subsequence are consecutive
 *         integers, the consecutive numbers can be in any order.
 *
 */
public class LongestConsecutiveSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++) {

				a[i] = sc.nextInt();
			}

			System.out.println(findLongestConseqSubseq(a, n));
		}
	}

	static int findLongestConseqSubseq(int arr[], int n) {
		int ans = 1;
		int j = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(arr[i]);
		}

		for (int i = 0; i < n; i++) {
			j = 0;
			if (!set.contains(arr[i] - 1)) {
				j = arr[i] + 1;
				while (set.contains(j)) {
					j++;
				}

				ans = Math.max(ans, (j - arr[i]));

			}
		}

		return ans;
	}

}
