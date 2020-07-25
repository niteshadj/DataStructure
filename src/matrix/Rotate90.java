/**
 * 
 */
package matrix;

import java.util.Collections;
import java.util.Scanner;

/**
 * @author nadjriya
 *
 */
public class Rotate90 {

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
			rotateby90(a, n);
			System.out.println();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
		
	}
	
	static void rotateby90(int a[][], int n)
    {
		MatrixTranspose.transpose(a, n);
		//reverse individual columns
		
		for(int i=0;i<n;i++){
			int j=0;
			int k=n-1;
			int temp=0;
			while(j<k){
				temp=a[j][i];
				a[j][i]=a[k][i];
				a[k][i]=temp;
				j++;
				k--;
			}
		}
		
    }

}
