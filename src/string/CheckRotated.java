/**
 * 
 */
package string;

/**
 * @author nadjriya
 * 
 *         Given two strings a and b. The task is to find if the string 'b' can
 *         be obtained by rotating another string 'a' by exactly 2 places.
 *
 */
public class CheckRotated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isRotated("fdsalkjhfh", "fdsalkjhfh"));
	}

	public static boolean isRotated(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;
		if (s1.length() < 3)
			return s1.equals(s2);
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		if (s1.charAt(0) == s2.charAt(2))
			rotate(arr2);
		else if (s2.charAt(0) == s1.charAt(2))
			rotate(arr1);
		else 
			return false;
		
		for(int i=0;i<s1.length();i++){
			if(arr1[i]!=arr2[i])
				return false;
		}

		return true;

	}

	private static void rotate(char[] arr) {
		
		reverse(arr,0,1);
		reverse(arr,2,arr.length-1);
		reverse(arr,0,arr.length-1);

	}

	private static void reverse(char[] arr, int i, int j) {
		char temp=0;
		while(i<j){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	

}
