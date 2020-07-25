/**
 * 
 */
package searching;

/**
 * @author nadjriya
 * 
 *         You are given heights of consecutive buildings. You can move from the
 *         roof of a building to the roof of next adjacent building. You need to
 *         find the maximum number of consecutive steps you can put forward such
 *         that you gain an increase in altitude with each step.
 *
 */
public class RoofTop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1,2, 3, 4 };
		System.out.println(maxStep(arr, arr.length));

	}

	static int maxStep(int A[], int N) {
		int res = 0;
		int count = 0;
		for (int i = 0; i < N-1; i++) {
			if (A[i] < A[i + 1]) {
				count++;
				res = Math.max(res, count);
			} else {
				count = 0;
			}
		}

		return res;

	}

}
