/**
 * 
 */
package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author nadjriya
 * 
 *         Given an array of n elements, where each element is at most k away
 *         from its target position, you need to sort the array optimally.
 * 
 *         Example 1:
 * 
 *         Input: n = 7, k = 3 arr[] = {6,5,3,2,8,10,9} Output: 2 3 5 6 8 9 10
 *         Explanation: The sorted array will be 2 3 5 6 8 9 10 Example 2:
 * 
 *         Input: n = 5, k = 2 arr[] = {4,3,1,2,5} Output: 1 2 3 4 5
 *
 */
public class NearlySorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	ArrayList<Integer> nearlySorted(int arr[], int num, int k) {

		ArrayList<Integer> res = new ArrayList<>();

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int i = 0; i <= k; i++) {
			minHeap.add(arr[i]);
		}

		for (int i = k + 1; i < num; i++) {
			res.add(minHeap.poll());
			minHeap.add(arr[i]);
		}

		while (!minHeap.isEmpty()) {
			res.add(minHeap.poll());
		}

		return res;

	}

}
