/**
 * 
 */
package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @author nadjriya
 *
 */
public class GenerateBinaryNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(generate(1000000));

	}

	static ArrayList<String> generate(long n) {
		ArrayList<String> res = new ArrayList<>();

		Queue<String> queue = new ArrayDeque<>();

		queue.add("1");
		res.add("1");
		int i = 1;
		while (i < n) {
			String a = queue.poll();
			String first = a + "0";
			String second = a + "1";
			res.add(first);
			i++;
			if(i<n)
			res.add(second);
			queue.add(first);
			queue.add(second);
			i=i+1;
		}

		return res;
	}

}
