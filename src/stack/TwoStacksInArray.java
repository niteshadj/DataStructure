/**
 * 
 */
package stack;

/**
 * @author nadjriya
 * 
 *         Your task is to implement 2 stacks in one array efficiently .
 *
 */
public class TwoStacksInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	void push1(int x, TwoStack sq) {

		sq.top1++;
		sq.arr[sq.top1] = x;

	}

	void push2(int x, TwoStack sq) {
		sq.top2--;
		sq.arr[sq.top2] = x;
	}

	/* The method pop to pop element from the stack 1 */
	// Return the popped element
	int pop1(TwoStack sq) {
		if (sq.top1 == -1)
			return -1;
		int res = sq.arr[sq.top1];
		sq.top1--;
		return res;

	}

	/* The method pop to pop element from the stack 2 */
	// Return the popper element
	int pop2(TwoStack sq) {
		if (sq.top2 == sq.size)
			return -1;
		int res = sq.arr[sq.top2];
		sq.top2++;
		return res;
	}

}

class TwoStack {

	int size;
	int top1, top2;
	int arr[] = new int[100];

	TwoStack() {
		size = 100;
		top1 = -1;
		top2 = size;
	}
}
