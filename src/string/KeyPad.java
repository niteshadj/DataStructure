/**
 * 
 */
package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         You are given a string S of alphabet characters and the task is to
 *         find its matching decimal representation as on the shown keypad.
 *         Output the decimal representation corresponding to the string. For
 *         example: if you are given “amazon” then its corresponding decimal
 *         representation will be 262966.
 *
 */
public class KeyPad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 2);
		map.put('b', 2);
		map.put('c', 2);
		map.put('d', 3);
		map.put('e', 3);
		map.put('f', 3);
		map.put('g', 4);
		map.put('h', 4);
		map.put('i', 4);
		map.put('j', 5);
		map.put('k', 5);
		map.put('l', 5);
		map.put('m', 6);
		map.put('n', 6);
		map.put('o', 6);
		map.put('p', 7);
		map.put('q', 7);
		map.put('r', 7);
		map.put('s', 7);
		map.put('t', 8);
		map.put('u', 8);
		map.put('v', 8);
		map.put('w', 9);
		map.put('x', 9);
		map.put('y', 9);
		map.put('z', 9);

		int t = sc.nextInt();
		while (t > 0) {
			t--;
			String s = sc.next();
			printKeyPad(s,map);
			System.out.println();
		}
	}

	private static void printKeyPad(String s, Map<Character, Integer> map) {
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			System.out.print(map.get(s.charAt(i)));
		}
	}

}
