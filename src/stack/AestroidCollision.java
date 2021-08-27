package stack;

import java.util.Stack;

import org.junit.jupiter.api.Test;

public class AestroidCollision {

	public int[] asteroidCollision(int[] asteroids) {

		Stack<Integer> stack = new Stack();
		stack.push(asteroids[0]);
		for (int i = 1; i < asteroids.length; i++) {

			if (asteroids[i] > 0)
				stack.push(asteroids[i]);
			else {
				while (!stack.isEmpty() && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(asteroids[i])) {
					stack.pop();
				}

				if (stack.isEmpty() || stack.peek() < 0) {
					stack.push(asteroids[i]);

				} else if (stack.peek() == -asteroids[i])
					stack.pop();

			}

		}

		int[] ans = new int[stack.size()];
		int i = stack.size() - 1;
		while (!stack.isEmpty()) {
			ans[i] = stack.pop();
			i--;
		}

		return ans;
	}

	@Test
	public void aestroidCollisionTest() {
		int nums[] = { -2, -1, 1, 2 };
		System.out.println(asteroidCollision(nums));
	}

}
