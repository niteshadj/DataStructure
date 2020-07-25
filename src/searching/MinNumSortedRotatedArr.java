/**
 * 
 */
package searching;

/**
 * @author nadjriya
 * 
 *         Given an array of distinct elements which was initially sorted. This
 *         array is rotated at some unknown point. The task is to find the
 *         minimum element in the given sorted and rotated array.
 *
 */
public class MinNumSortedRotatedArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 10,20,30,45,50,60,4,6};
		System.out.println(minNumber(arr, 0, arr.length-1));

	}
	
	static long minNumber(int arr[], long low, long high)
    {
		if (low > high)
			return arr[0];
		int mid =(int) (low + high) / 2;
		if (mid != arr.length - 1 && arr[mid] > arr[mid + 1])
			return arr[mid+1];
		else if(arr[mid]<arr[(int) low])
			return minNumber(arr, low, mid-1);
		else
			return minNumber(arr, mid+1, high);
        
    }

}
