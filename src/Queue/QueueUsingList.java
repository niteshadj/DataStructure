/**
 * 
 */
package Queue;

/**
 * @author nadjriya
 *
 */
public class QueueUsingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class QueueNode {
	int data;
	QueueNode next;

	QueueNode(int a) {
		data = a;
		next = null;
	}
}

class MyQueueList {
	QueueNode front, rear;

	// This function should add an item at
	// rear
	void push(int a) {

		if (rear == null) {
			rear = new QueueNode(a);
			front = rear;

		} else {
			QueueNode temp = new QueueNode(a);
			rear.next = temp;
			rear = temp;
		}
	}

	// This function should remove front
	// item from queue and should return
	// the removed item.
	int pop() {
		if (front == null)
			return -1;
		int a = front.data;
		front = front.next;
		if(front==null)
			rear=null;
		return a;

	}
}
