/**
 * 
 */
package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given K sorted arrays arranged in the form of a matrix of size K*K.
 *         The task is to merge them into one sorted array. Example 1:
 * 
 *         Input: K = 3 arr[][] = {{1,2,3},{4,5,6},{7,8,9}} Output: 1 2 3 4 5 6
 *         7 8 9 Explanation:Above test case has 3 sorted arrays of size 3, 3, 3
 *         arr[][] = [[1, 2, 3],[4, 5, 6], [7, 8, 9]] The merged list will be
 *         [1, 2, 3, 4, 5, 6, 7, 8, 9]. Example 2:
 * 
 *         Input: K = 4 arr[][]={{1,2,3,4}{2,2,3,4}, {5,5,6,6},{7,8,9,9}}
 *         Output: 1 2 2 2 3 3 4 4 5 5 6 6 7 8 9 9 Explanation: Above test case
 *         has 4 sorted arrays of size 4, 4, 4, 4 arr[][] = [[1, 2, 2, 2], [3,
 *         3, 4, 4], [5, 5, 6, 6] [7, 8, 9, 9 ]] The merged list will be [1, 2,
 *         2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9 ].
 *
 */
public class MergeKSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(mergeKArrays(arr, n));
	}

	public static ArrayList<Integer> mergeKArrays(int[][] arrays, int k) {
		ArrayList<Integer> res = new ArrayList<>();
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				
				minHeap.add(arrays[j][i]);
			}
			res.add(minHeap.poll());
		}
		
		while(!minHeap.isEmpty())
			res.add(minHeap.poll());

		return res;
	}

}
