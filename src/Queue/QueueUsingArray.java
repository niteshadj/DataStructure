/**
 * 
 */
package Queue;

/**
 * @author nadjriya
 *
 */
public class QueueUsingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyQueue {

	int front, rear;
	int arr[] = new int[100005];

	MyQueue() {
		front = 0;
		rear = 0;
	}

	/*
	 * The method push to push element into the queue
	 */
	void push(int x) {
		arr[rear] = x;
		rear = (rear + 1) % 100005;
	}

	/*
	 * The method pop which return the element poped out of the queue
	 */
	int pop() {
		if(front==rear)
			return -1;
		int x = arr[front];
		front++;
		return x;
	}
}
