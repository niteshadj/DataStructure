/**
 * 
 */
package array;

/**
 * @author nadjriya
 *
 *         Given an array A[] of N positive integers which can contain integers
 *         from 1 to N where elements can be repeated or can be absent from the
 *         array. Your task is to count the frequency of all elements from 1 to
 *         N. Expected Time Complexity: O(N) Expected Auxiliary Space: O(1)
 */
public class FrequencyCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 2, 3, 2, 3, 5 };
		int n = 5;
		frequencycount(arr, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] % n + 1);

		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

		}

	}

	// new array has frequency by a[i]/n +1 and actual element as a[i]%n
	public static void frequencycount(int a[], int n) {
		for (int i = 0; i < a.length; i++)
			a[i] = a[i] - 1;

		for (int i = 0; i < n; i++) {
			a[(a[i] % n)] = a[(a[i] % n)] + n;
		}

		for (int i = 0; i < n; i++) {
			a[i] = a[i] / n;
		}

	}

}
