/**
 * 
 */
package searching;

/**
 * @author nadjriya
 * 
 *         Given an integer array representing the heights of N buildings, the
 *         task is to delete N-2 buildings such that the water that can be
 *         trapped between the remaining two building is maximum. Note: The
 *         total water trapped between two buildings is gap between them (number
 *         of buildings removed) multiplied by height of the smaller building.
 *
 */
public class MaxWater {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 45, 50, 60, 4, 6 };
		System.out.println(maxWater(arr,  arr.length));

	}

	static int maxWater(int height[], int n) {
		if (n <= 2)
			return 0;
		int j = n - 1;
		int maxWater = 0;
		for (int i = 0; i < j;) {
			maxWater = Math.max(maxWater, (j - i - 1) * Math.min(height[i], height[j]));
			if (height[i] < height[j])
				i++;
			else
				j--;
		}
		return maxWater;
	}

}
