/**
 * 
 */
package hashing;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author nadjriya
 *
 *         Given an array of names (consisting of lowercase characters) of
 *         candidates in an election. A candidate name in array represents a
 *         vote casted to the candidate. Print the name of candidate that
 *         received Max votes. If there is tie, print lexicographically smaller
 *         name. n = 3 Votes[] = {andy,blake,clark} Output: andy 1 Explanation:
 *         All the candidates get 1 votes each. We print andy as it is
 *         lexicographically smaller.
 */
public class Winner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			String a[] = new String[n];

			for (int i = 0; i < n; i++) {

				a[i] = sc.next();
			}

			System.out.println(winner(a, n).first);

		}
	}

	public static pair winner(String arr[], int n) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.get(arr[i]) == null)
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i]) + 1);
		}

		int maxVotes = 0;
		String winner = "";
		pair pair = new pair("", 0);
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxVotes) {
				maxVotes = entry.getValue();
				winner = entry.getKey();
			} else if (entry.getValue() == maxVotes && entry.getKey().compareTo(winner) < 0) {
				winner = entry.getKey();
			}
		}
		return new pair(winner, map.get(winner));
		// add your code
	}

}

class pair {
	String first;
	int second;

	pair(String first, int second) {
		this.first = first;
		this.second = second;
	}
}
