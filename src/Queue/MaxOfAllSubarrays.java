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
