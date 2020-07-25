/**
 * 
 */
package matrix;

import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         ou are given a matrix A of dimensions n1 x m1. The task is to perform
 *         boundary traversal on the matrix in clockwise manner.
 *
 */
public class BoundaryTraversal {

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

		/*	for (int i = 0; i < n1; i++) {
				for (int j = 0; j < m1; j++) {
					System.out.print(a[i][j]);
					}
				System.out.println();
			}*/
			boundaryTraversal(n1, m1, a);
			System.out.println();
		}

	}

	static void boundaryTraversal(int n1, int m1, int a[][]) {
		
		if(n1==1){
			for(int i=0;i<m1;i++){
				System.out.print(a[0][i]+" ");
			}
			return;
		}
		
		if(m1==1){
			for(int i=0;i<n1;i++){
				System.out.print(a[i][0]+" ");
			}
			return;
		}
		
		for(int i=0;i<m1;i++){
			System.out.print(a[0][i]+" ");
		}
		
		for(int i=1;i<n1;i++){
			System.out.print(a[i][m1-1]+" ");
		}
		
		for(int i=m1-2;i>=0;i--){
			System.out.print(a[n1-1][i]+" ");
		}
		
		for(int i=n1-2;i>0;i--){
			System.out.print(a[i][0]+" ");
		}
		
	}

}
