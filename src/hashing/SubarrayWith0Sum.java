/**
 * 
 */
package hashing;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given an array of positive and negative numbers. Find if there is a
 *         subarray (of size at-least one) with 0 sum. Expected Time Complexity:
 *         O(n). Expected Auxiliary Space: O(n).
 */
public class SubarrayWith0Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {

				a[i] = sc.nextInt();
			}

			System.out.println(findsum(a, n));

		}
	}

	static boolean findsum(int arr[], int n) {
		int prefixSum=0;
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++){
			if(arr[i]==0)
				return true;
			prefixSum=prefixSum+arr[i];
			if(prefixSum==0)
				return true;
			if(set.contains(prefixSum))
				return true;
			set.add(prefixSum);
		}
		
		return false;
	}

}
