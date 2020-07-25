/**
 * 
 */
package matrix;

/**
 * @author nadjriya
 * 
 *         You are given two matrices. The first matrix's dimensions are given
 *         by n1,m1. The second matrix's dimensions are given by n2,m2. You need
 *         to add both the matrices. If addition is not possible then print -1.
 *
 */
public class AddMatrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	
	static void sumMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][])
    {
		if(n1!=n2 || m1!=m2){
			System.out.println(-1);
			return;
		}
		for (int i=0;i<n1;i++){
			for (int j=0;j<m1;j++){
				System.out.print(arr1[i][j]+arr2[i][j]);
			}
		}
    }

}
