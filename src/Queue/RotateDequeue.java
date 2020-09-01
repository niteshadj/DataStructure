package Queue;

import java.util.ArrayDeque;

//Given a Deque deq of size N containing non-negative integers and a positive integer K, the task is to rotate elements of the deque by K places in a circular fashion. There will be two rotations which you have to implement depending on the type rotating query. Below is the description of rotating type and value of K for which you have to rotate in circular way:
//Type-1. right_Rotate_Deq_ByK(): this function should rotate deque by K places in a clockwise fashion.
//Type-2. left_Rotate_Deq_ByK(): this function should rotate deque by K places in an anti-clockwise fashion.

public class RotateDequeue {

	public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k) {

		int i = 0;
		while (i < k) {
			deque.addLast(deque.pollFirst());
			i++;
		}

	}

	public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k) {
		int i = 0;
		while (i < k) {
			deque.addFirst(deque.pollLast());
			i++;
		}
	}
}
