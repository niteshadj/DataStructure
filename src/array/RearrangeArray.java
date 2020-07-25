/**
 * 
 */
package array;

/**
 * @author nadjriya
 *
 *         Given an array arr[] of size N where every element is in the range
 *         from 0 to n-1. Rearrange the given array so that arr[i] becomes
 *         arr[arr[i]].
 */
public class RearrangeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long arr[] = { 4,0,2,1,3};
		arrange(arr, arr.length);
	}

	static void arrange(long a[], int n) {
		for(int i=0;i<n;i++){
			a[i]=((a[(int)a[i] %n])%n)*n +a[i]%n;
		}
		
		for(int i=0;i<n;i++){
			a[i]=a[i]/n;
		}
	}

}
