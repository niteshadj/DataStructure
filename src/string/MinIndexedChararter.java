/**
 * 
 */
package string;

/**
 * @author nadjriya
 *
 */
public class MinIndexedChararter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(minIndexChar("adcffaet", "onkl"));
	}
	
	public static int minIndexChar(String str, String pat){
		int[] arr =new int[128];
		
		for(int i=0;i<pat.length();i++){
			arr[pat.charAt(i)]=1;
		}
		for(int i=0;i<str.length();i++){
			if(arr[str.charAt(i)]==1)
				return i;
		}
		
		return -1;
    }

}
