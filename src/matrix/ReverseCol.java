/**
 * 
 */
package matrix;

import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         You are given a matrix A of dimensions n1 x m1. The task is to
 *         reverse the columns(first column exchanged with last column and so
 *         on).
 *
 */
public class ReverseCol {

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
			reverseCol(n1, m1, a);
			for (int i = 0; i < n1; i++) {
				for (int j = 0; j < m1; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

	static void reverseCol(int n1, int m1, int a[][]) {
		
		for(int i=0;i<n1;i++){
			int j=0;
			int k=m1-1;
			int temp=0;
			while(j<k){
				temp=a[i][j];
				a[i][j]=a[i][k];
				a[i][k]=temp;
				j++;
				k--;
			}
		}
	}

}
