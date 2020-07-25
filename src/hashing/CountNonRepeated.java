/**
 * 
 */
package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author nadjriya
 * 
 *         Hashing is very useful to keep track of the frequency of the elements
 *         in a list.
 * 
 *         You are given an array of integers. You need to print the count of
 *         non-repeated elements in the array.
 *
 */
public class CountNonRepeated {

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

			System.out.println(countNonRepeated(a, n));
			System.out.println(printNonRepeated(a, n));
		}

	}

	static long countNonRepeated(int arr[], int n) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		int counter = 0;
		for (int i = 0; i < n; i++) {

			if (hashMap.get(arr[i]) == null)
				hashMap.put(arr[i], 1);
			else
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
		}

		for (int entry : hashMap.values()) {
			if (entry == 1)
				counter++;
		}

		return counter;
	}

	static ArrayList<Integer> printNonRepeated(int arr[], int n) {
		Map<Integer, Integer> hashMap = new LinkedHashMap<>();
		int counter = 0;
		for (int i = 0; i < n; i++) {

			if (hashMap.get(arr[i]) == null)
				hashMap.put(arr[i], 1);
			else
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
		}
		ArrayList<Integer> list = new ArrayList<>();
		hashMap.entrySet().stream().filter(entry -> entry.getValue() == 1).forEach(entry -> {
			list.add(entry.getKey());
		});
		
		return list;
	}

}
