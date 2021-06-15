/**
 * 
 */
package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * @author nadjriya
 * 
 *         Given an array arr[] of size N and an integer K. Find the maximum for
 *         each and every contiguous subarray of size K.
 *         Input:
			N = 9, K = 3
			arr[] = 1 2 3 1 4 5 2 3 6
			Output: 
			3 3 4 5 5 5 6 
 *
 */
public class MaxOfAllSubarrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
		ArrayList<Integer> res = new ArrayList<>();

		Deque<Integer> dq = new ArrayDeque<>();

		int i = 0;
		while (i < k) {

			while (!dq.isEmpty() && arr[i] > arr[dq.peekLast()])
				dq.removeLast();
			dq.offerLast(i);
			i++;

		}

		res.add(arr[dq.peekFirst()]);
		while (i < n) {

			while (!dq.isEmpty() && arr[i] > arr[dq.peekLast()])
				dq.removeLast();
			dq.offerLast(i);
			while (!dq.isEmpty() && (i - dq.peekFirst()) >= k)
				dq.removeFirst();
			res.add(arr[dq.peekFirst()]);
			i++;

		}

		return res;
	}

}
