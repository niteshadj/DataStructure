/**
 * 
 */
package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author nadjriya Given an array of N positive integers, print k largest
 *         elements from the array.
 * 
 *         Example 1:
 * 
 *         Input: N = 5, k = 2 arr[] = {12,5,787,1,23} Output: 787 23
 *         Explanation: First largest element in the array is 787 and the second
 *         largest is 23.
 *
 */
public class KLargestElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	      
	            int n = sc.nextInt();
	            int k = sc.nextInt();
	            int arr[]=new int[n];
	            for (int i = 0; i < n; i++) {
	                arr[i]=sc.nextInt();
	            }
	            System.out.println( kLargest(arr, n, k));
	        
	}

	public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
		ArrayList<Integer> res = new ArrayList<>();
		Stack<Integer> response=new Stack<>();
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

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

		while (!minHeap.isEmpty())
			response.add(minHeap.poll());
		
		while(!response.isEmpty()){
			res.add(response.pop());
		}

		return res;
	}

}
