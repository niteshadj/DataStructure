/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given an unsorted array of integers and a sum. The task is to count
 *         the number of subarray which adds to the given sum.
 *
 */
public class SubarraycountWithSum {

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

			System.out.println(subArraySum(a, n, sum));

		}
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
