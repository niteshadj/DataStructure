/**
 * 
 */
package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nadjriya
 *
 */
public class PhoneDigits {

	/**
	 * @param args
	 */
	static Map<Integer, String> alphabetsWithNumber = new HashMap<>();
	static List<String> possibleWords = new ArrayList<>();

	public static void main(String[] args) {

		alphabetsWithNumber.put(2, "abc");
		alphabetsWithNumber.put(3, "def");
		alphabetsWithNumber.put(4, "ghi");
		alphabetsWithNumber.put(5, "jkl");
		alphabetsWithNumber.put(6, "mno");

		alphabetsWithNumber.put(7, "pqrs");
		alphabetsWithNumber.put(8, "tuv");
		alphabetsWithNumber.put(9, "wxyz");

		int[] a = { 5 ,8, 8, 9, 8};
		possibleWords = new ArrayList<>();
		 findPossibleWords(a,5,"");
		 Collections.sort(possibleWords);
		 System.out.println(possibleWords.size());
		 for(String s:possibleWords){
			 System.out.print(s+" ");
		 }
	}

	private static void findPossibleWords(int[] a, int n, String s) {

		if (n == 0) {
			possibleWords.add(s);
			return;
		}
		if (alphabetsWithNumber.get(a[n - 1]).length() >= 4)
			findPossibleWords(a, n - 1,  alphabetsWithNumber.get(a[n - 1]).charAt(3)+s);
		findPossibleWords(a, n - 1,  alphabetsWithNumber.get(a[n - 1]).charAt(2)+s);
		findPossibleWords(a, n - 1,alphabetsWithNumber.get(a[n - 1]).charAt(1)+s);
		findPossibleWords(a, n - 1, alphabetsWithNumber.get(a[n - 1]).charAt(0)+s);
		

	}

}
