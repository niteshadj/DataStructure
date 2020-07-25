/**
 * 
 */
package hashing;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         You are given an array of distinct integers and a sum. Check if
 *         there's a pair with the given sum in the array.
 *
 */
public class PairWithSum {

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
			int sum = sc.nextInt();
			System.out.println(sumExists(a, n, sum));
		}
	}

	public static int sumExists(int arr[], int N, int sum) {
		HashSet<Integer> hashTable = new HashSet<>();
		for (int i = 0; i < N; i++) {
			if(hashTable.contains(arr[i]))
				return 1;
			hashTable.add(sum-arr[i]);
		}
		
		return 0;

	}

}
