/**
 * 
 */
package matrix;

import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given a boolean matrix mat[r][c] of size r X c, modify it such that
 *         if a matrix cell mat[i][j] is 1 (or true) then make all the cells of
 *         ith row and jth column as 1.
 *         
 *         //didn't pass on gfg practice
 *         https://practice.geeksforgeeks.org/problem_submissions.php?pid=701257&isSolved=ALL&lang=ALL&user=Self
 *
 */
public class BooleanMatrixProblem {

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

			booleanMatrix(n1, m1, a);
			System.out.println();
		}
	}

	static void booleanMatrix(int r, int c, int a[][]) {
		int [] row=new int[r];
		int col[]=new int[c];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(a[i][j]==1){
					row[i]=1;
					col[j]=1;
				}
			}
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(row[i]==1 || col[j]==1){
					
					a[i][j]=1;
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		
	}

}
