/**
 * 
 */
package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author nadjriya
 *
 */
public class KthLargestSmallest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int KthLargest(int arr[], int n, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int kthLargest = Integer.MIN_VALUE;

		for (int i = 0; i < k; i++) {
			minHeap.add(arr[i]);
		}

		for (int i = k; i < n; i++) {
			int temp = minHeap.peek();
			if (temp < arr[i]) {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}

		kthLargest = minHeap.poll();

		return kthLargest;
	}

	public void kthLargest(int arr[], int n, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int kthLargest = Integer.MIN_VALUE;
		int i = 0;
		for (i = 0; i < k - 1; i++) {
			System.out.print(-1+" ");
			minHeap.add(arr[i]);
		}
		minHeap.add(arr[i]);
		System.out.print(minHeap.peek()+" ");
		for (i = k; i < n; i++) {
			int temp = minHeap.peek();
			if (temp < arr[i]) {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
			System.out.print(minHeap.peek()+" ");
		}


	}

}
