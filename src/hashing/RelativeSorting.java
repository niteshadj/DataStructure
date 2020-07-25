/**
 * 
 */
package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given two arrays A1[] and A2[] of size N and M respectively. The task
 *         is to sort A1 in such a way that the relative order among the
 *         elements will be same as those in A2. For the elements not present in
 *         A2, append them at last in sorted order. It is also given that the
 *         number of elements in A2[] are smaller than or equal to number of
 *         elements in A1[] and A2[] has all distinct elements. Note: Expected
 *         time complexity is O(N log(N)).
 *
 */
public class RelativeSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			int m = sc.nextInt();
			Integer a[] = new Integer[n];
			Integer b[] = new Integer[n];

			for (int i = 0; i < n; i++) {

				a[i] = sc.nextInt();
			}

			for (int i = 0; i < m; i++) {

				b[i] = sc.nextInt();
			}

			sortRelativeToSecondArray(a, n, b, m);
			System.out.println();
		}
	}

	
	//work on other solution without comparator
	private static void sortRelativeToSecondArray(Integer[] a, int n, Integer[] b, int m) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
		Map<Integer, Integer> rankingBySecondArray = new HashMap<Integer, Integer>();
		int count = m;
		for (int i = 0; i < m; i++) {

			rankingBySecondArray.put(b[i], i + 1);
		}

		Comparator<Integer> relativeComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				Integer a = Integer.MAX_VALUE;
				Integer b = Integer.MAX_VALUE;
				if (rankingBySecondArray.get(i1) != null)
					a = rankingBySecondArray.get(i1);
				if (rankingBySecondArray.get(i2) != null)
					b = rankingBySecondArray.get(i2);
				if (rankingBySecondArray.get(i1) == null && rankingBySecondArray.get(i2) == null)
					return i1.compareTo(i2);
				return  a.compareTo(b);
			}
		};
		Collections.sort(list, relativeComparator);

		for (int i : list) {
			System.out.print(i + " ");
		}

	}

}
