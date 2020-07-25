/**
 * 
 */
package matrix;

import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given a matrix mat[][] of size M*N. Traverse and print the matrix in
 *         spiral form.
 *
 */
public class SpiralTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n1 = sc.nextInt();
			int m1 = sc.nextInt();
			int a[][] = new int[n1][m1];
			for (int i = 0; i < n1; i++) {
				for (int j = 0; j < m1; j++) {
					a[i][j] = sc.nextInt();
				}
			}

			spirallyTraverse(n1, m1, a);
			System.out.println();
		}
	}

	static void spirallyTraverse(int n, int m, int a[][]) {

		int left = 0;
		int right = m;
		int bottom = n;
		int top = 0;
		while (left < right && top <bottom) {
			if (top == bottom - 1) {
				for (int i = left; i < right; i++) {
					System.out.print(a[top][i] + " ");
				}
				return;
			}

			if (left == right - 1) {
				for (int i = top; i < bottom; i++) {
					System.out.print(a[i][left] + " ");
				}
				return;
			}
			for (int i = left; i < right; i++) {
				System.out.print(a[left][i] + " ");
			}

			for (int i = top + 1; i < bottom; i++) {
				System.out.print(a[i][right - 1] + " ");
			}

			for (int i = right - 2; i >= left; i--) {
				System.out.print(a[bottom - 1][i] + " ");
			}

			for (int i = bottom - 2; i > top; i--) {
				System.out.print(a[i][left] + " ");
			}

			left++;
			right--;
			bottom--;
			top++;

		}

	}

}
