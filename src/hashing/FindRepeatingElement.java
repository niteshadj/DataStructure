/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given an integer array. The task is to find the first repeating
 *         element index in the array i.e., an element that occurs more than
 *         once and whose index of first occurrence is smallest.
 *
 */
public class FindRepeatingElement {

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

			System.out.println(findFirsRepeated(a, n));
		}

	}

	private static int findFirstRepeated(int[] a, int n) {

		Map<Integer, Integer> hashMap = new HashMap<>();
		int minIndex = n + 1;
		for (int i = 0; i < n; i++) {

			if (hashMap.get(a[i]) == null)
				hashMap.put(a[i], i);
			else
				minIndex = Math.min(minIndex, hashMap.get(a[i]));
		}

		if (minIndex == n + 1)
			return -1;
		return minIndex + 1;

	}
	
	private static int findFirsRepeated(int[] a, int n) {

		Map<Integer, Integer> hashMap = new HashMap<>();
		int minIndex = n + 1;
		for (int i = 0; i < n; i++) {

			if (hashMap.get(a[i]) == null)
				hashMap.put(a[i], 1);
			else
				hashMap.put(a[i], hashMap.get(a[i])+1);
		}

		for (int i = 0; i < n; i++) {
			if(hashMap.get(a[i])>1)
				return i+1;
		}
		return -1;

	}

}
