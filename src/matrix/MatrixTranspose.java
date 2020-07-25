/**
 * 
 */
package matrix;

import java.util.Scanner;

/**
 * @author nadjriya
 *
 */
public class MatrixTranspose {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			transpose(a, n);
			System.out.println();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}

	}

	public static void transpose(int a[][], int n) {
		int temp=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
	}

}
