/**
 * 
 */
package hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given an array of integers, sort the array according to frequency of
 *         elements. That is elements that have higher frequency come first. If
 *         frequencies of two elements are same, then smaller number comes
 *         first.
 *
 */
public class SortByFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++) {

				a[i] = sc.nextInt();
			}

			System.out.println(sortByFreq(a, n));
			System.out.println();
		}
	}

	static ArrayList<Integer> sortByFreq(int arr[], int n) {

		HashMap<Integer, Integer> elemFrequency = new HashMap<>();
		// ArrayList<Integer> arrList =
		// IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < n; i++) {

			arrList.add(arr[i]);
		}

		for (Integer a : arrList) {
			if (elemFrequency.get(a) == null)
				elemFrequency.put(a, 1);
			else
				elemFrequency.put(a, elemFrequency.get(a) + 1);
		}

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				if (elemFrequency.get(o2) == elemFrequency.get(o1))
					return o1.compareTo(o2);

				return elemFrequency.get(o2).compareTo(elemFrequency.get(o1));

			}

		};
	//	Comparator<Student> comp=(Student a,Student b)->{return  a.age.compareTo(b.age);};
		Collections.sort(arrList, comparator);
		return arrList;
	}

}

class Student {
	Integer age;
}
