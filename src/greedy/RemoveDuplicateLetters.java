package greedy;

import java.util.ArrayDeque;
import java.util.Stack;

public class RemoveDuplicateLetters {

	public static void main(String[] args) {
		System.out.println(removeDuplicateLetters("bbcaac"));
	}

	public static String removeDuplicateLetters(String s) {
		StringBuilder sb = new StringBuilder();
		if (s.length() == 1)
			return s;

		int[] freq = new int[26];
		boolean[] visited = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;

		}

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			freq[s.charAt(i) - 'a']--;
			if (visited[c - 'a'])
				continue;
			
			while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0) {
				char d = stack.pop();
				visited[d - 'a'] = false;
			}

			stack.push(c);
			visited[c - 'a'] = true;
		}

		while (!stack.isEmpty())
			sb.append(stack.pop());

		return sb.reverse().toString();
	}

}
