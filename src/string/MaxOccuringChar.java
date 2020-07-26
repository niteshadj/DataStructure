/**
 * 
 */
package string;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author nadjriya
 * 
 *         Given a string str. The task is to find the maximum occurring
 *         character in the string str. If more than one character occurs the
 *         maximum number of time then print the lexicographically smaller
 *         character.
 *
 */
public class MaxOccuringChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getMaxOccuringChar("fdsalkjhfh"));
	}

	public static char getMaxOccuringChar(String line) {
		int[] freqCount = new int[128];
		for (int i = 0; i < line.length(); i++) {
			freqCount[line.charAt(i)] = freqCount[line.charAt(i)] + 1;
		}
		int maxCount = 0;
		char result = '$';
		for (int i=0;i< freqCount.length;i++) {
			if (freqCount[i] > maxCount){
				result = (char) i;
				maxCount=freqCount[i];
			}
		}

		return result;
	}

}
