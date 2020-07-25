/**
 * 
 */
package array;

/**
 * @author nadjriya
 *
 *         Given an array A[] of N positive integers. The task is to find the
 *         maximum of j - i subjected to the constraint of A[i] <= A[j].
 *         
 *         Check better approach using two arrays
 */
public class MaximumIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 82,63,44,74,82,99,82 };
		System.out.println(maxIndexDiff(arr, arr.length));
	}

	// is this an O(n) solution?
	static int maxIndexDiff(int a[], int n) {
		int j = n - 1;
		//int i = 0;
		int result = 0;

		for (int i = 0; i < n; i++) {
			if(i+result>n-1){
				break;
			}
			for (int k = n-1; k > i+result; k--) {
				if(a[k]>=a[i]){
					result=Math.max(result, k-i);
				}
			}
		}

		return result;

	}

}
