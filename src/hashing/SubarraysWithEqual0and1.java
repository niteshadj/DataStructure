/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given an array containing 0s and 1s. Find the number of subarrays
 *         having equal number of 0s and 1s.
 *
 */
public class SubarraysWithEqual0and1 {

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

			System.out.println(countSubarrWithEqualZeroAndOne(a, n));

		}
	}

	static int countSubarrWithEqualZeroAndOne(int arr[], int N) {
		for (int i = 0; i < N; i++) {
			if (arr[i] == 0)
				arr[i] = -1;
		}

		return subArraySum(arr, N, 0);
	}

	static int subArraySum(int arr[], int n, int sum) {
		int prefixSum = 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			prefixSum = prefixSum + arr[i];
			if (prefixSum == sum)
				count++;
			if (map.containsKey(prefixSum - sum))
				count = count + map.get(prefixSum - sum);
			if (map.get(prefixSum) == null)
				map.put(prefixSum, 1);
			else
				map.put(prefixSum, map.get(prefixSum) + 1);

		}

		return count;
	}

}
