/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author nadjriya
 * 
 *         You are in a party of N people, where only one person is known to
 *         everyone. Such a person may be present in the party, if yes, (s)he
 *         doesn’t know anyone in the party. Your task is to find the stranger
 *         (celebrity) in party.
 *
 */
public class FindCelibrity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	// check two pointer and graph based soln
	int getId(int M[][], int n) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			stack.push(i);
		}

		while (stack.size() != 1) {
			int a = stack.pop();
			int b = stack.pop();
			if (M[a][b] == 0) {
				stack.push(a);
			} else {
				stack.push(b);
			}
		}

		int a = stack.pop();
		for (int i = 0; i < n; i++) {
			if (i != a && M[i][a] != 1&& M[a][i] != 0)
				return -1;
		}


		return a;
	}

}
