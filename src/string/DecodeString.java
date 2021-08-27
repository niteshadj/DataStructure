package string;

import java.util.Stack;

import org.junit.jupiter.api.Test;
//https://leetcode.com/problems/decode-string/discuss/87534/Simple-Java-Solution-using-Stack
class DecodeString {
	public String decodeString(String s) {
		Stack<Character> stack = new Stack();
		for (char c : s.toCharArray()) {
			if (c != ']') {
				stack.push(c);

			} else {
				String str = "";
				while (!stack.isEmpty() && stack.peek() != '[') {
					char temp = stack.pop();
					str = temp + str;
				}

				if (stack.isEmpty()) {
					for (char t : str.toCharArray()) {
						stack.push(t);
					}
				} else {
					stack.pop();
					String intString = "";
					while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') {
						intString= stack.pop()+intString;

					}
					int n = Integer.parseInt(intString);
					String tempRes = "";
					for (int i = 0; i < n; i++) {
						tempRes += str;
					}
					for (char t : tempRes.toCharArray()) {
						stack.push(t);
					}
				}
			}
		}

		String res = "";

		while (!stack.isEmpty())
			res = stack.pop() + res;

		return res;

	}

	@Test
	public void testDecodeString() {
		System.out.println(decodeString("100[leetcode]"));
	}

}