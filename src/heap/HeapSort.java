package heap;

import java.util.Scanner;

/*Given an array of size N. The task is to sort the array elements by completing functions heapify() and buildHeap() which are used to implement Heap Sort.

Example 1:

Input:
N = 5
arr[] = {4,1,3,9,7}
Output:1 3 4 7 9
Explanation:After sorting elements
using heap sort, elements will be
in order as 1,3,4,7,9.
Example 2:

Input:
N = 10
arr[] = {10,9,8,7,6,5,4,3,2,1}
Output:1 2 3 4 5 6 7 8 9 10
Explanation:After sorting elements
using heap sort, elements will be
in order as 1, 2,3,4,5,6,7,8,9,10.*/

public class HeapSort {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HeapSort hs = new HeapSort();
		int arr[] = new int[1000000];
		int T = sc.nextInt();
		while (T > 0) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			hs.heapSort(arr, n);
			hs.printArray(arr, n);
			T--;
		}
	}

	void printArray(int arr[], int n) {
		// int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public void heapSort(int arr[], int n) {
		HeapSort hs = new HeapSort();
		hs.buildHeap(arr, n);
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			hs.heapify(arr, i, 0);
		}
	}

	void buildHeap(int arr[], int n) {
		int index = (n - 2) / 2;
		for (int i = index; i >= 0; i--) {
			heapify(arr, n, i);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int n, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int highest = i;
		if (left < n && arr[highest] < arr[left])
			highest = left;
		if (right < n && arr[highest] < arr[right])
			highest = right;
		if (highest != i) {
			int temp = arr[i];
			arr[i] = arr[highest];
			arr[highest] = temp;
			heapify(arr, n, highest);
		}

	}

}
