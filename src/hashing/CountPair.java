/**
 * 
 */
package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author nadjriya
 *
 */
public class CountPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		CountPair cp = new CountPair();
		System.out.println(cp.getPairsCount(arr, n, k));
	}

	int getPairsCount(int[] arr, int n, int k) {
		int count = 0;

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				ArrayList<Integer> list = map.get(arr[i]);
				list.add(i);
				map.put(arr[i], list);
			} else {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(arr[i], list);
			}
		}

		for (int i = 0; i < n; i++) {
			if (map.containsKey(k - arr[i])) {
				int j = map.get(k - arr[i]).size();
				if (arr[i] == k - arr[i]) {
					j--;
				}
				count = count + j;
			}
		}
		return count/2;
	}

}
