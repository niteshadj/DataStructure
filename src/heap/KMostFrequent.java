/**
 * 
 */
package heap;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author nadjriya
 *
 *
 *         Given an array arr[] of N integers in which elements may be repeating
 *         several times. Also, a positive number K is given and the task is to
 *         find sum of total frequencies of K most occurring elements
 * 
 *         Note: The value of K is guaranteed to be less than or equal to the
 *         number of distinct elements in arr.
 * 
 *         Example 1:
 * 
 *         Input: N = 8 arr[] = {3,1,4,4,5,2,6,1} K = 2 Output: 4 Explanation:
 *         Since, 4 and 1 are 2 most occurring elements in the array with their
 *         frequencies as 2, 2. So total frequency is 2 + 2 = 4.
 */
public class KMostFrequent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		KMostFrequent km = new KMostFrequent();
		km.kMostFrequent(arr, n, k);

	}

	void kMostFrequent(int arr[], int n, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			map.put(arr[i], map.get(arr[i]) == null ? 1 : map.get(arr[i]) + 1);
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int i = 0;
		for (int value : map.values()) {
			if (i < k)
				minHeap.add(value);
			else if (value >= minHeap.peek()) {
				minHeap.poll();
				minHeap.add(value);
			}
			i++;
		}
		while (!minHeap.isEmpty()) {
			sum = minHeap.poll() + sum;
		}
		System.out.println(sum);
	}

}
