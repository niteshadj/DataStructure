/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author nadjriya
 *
 */
public class RepeatingAndMissingNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestcases = sc.nextInt();
		while (noOfTestcases > 0) {

			int sizeOfArray = sc.nextInt();
			int[] arr = new int[sizeOfArray];
			for (int i = 0; i < sizeOfArray; i++) {
				arr[i] = sc.nextInt();

			}
			
			
			frequencycount(arr,sizeOfArray);
			noOfTestcases--;
		}

	}

	public static void frequencycount(int a[], int n) {
		for (int i = 0; i < a.length; i++)
			a[i] = a[i] - 1;

		for (int i = 0; i < n; i++) {
			a[(a[i] % n)] = a[(a[i] % n)] + n;
		}

		int missingNum=-1;
		int repeatingTwiceNum=-1;
		for (int i = 0; i < n; i++) {
			if(a[i]/n==2){
				repeatingTwiceNum=i+1;
			}
			else if(a[i]/n==0){
				missingNum=i+1;
			}
		}
		
		System.out.println((repeatingTwiceNum)+" "+(missingNum));

	}

}
