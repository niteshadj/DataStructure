/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 *
 */
public class Sort012LinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static Node segregate(Node head) {
		int countZeros = 0;
		int countOnes = 0;
		int countTwos = 0;
		Node curr = head;
		while (curr != null) {
			if (curr.data == 0)
				countZeros++;
			else if (curr.data == 1)
				countOnes++;
			else if (curr.data == 2)
				countTwos++;
			curr = curr.next;
		}

		curr = head;
		while (countZeros != 0) {
			curr.data = 0;
			curr = curr.next;
			countZeros--;
		}

		while (countOnes != 0) {
			curr.data = 1;
			curr = curr.next;
			countOnes--;
		}

		while (countTwos != 0) {
			curr.data = 2;
			curr = curr.next;
			countTwos--;
		}

		return head;
	}

}
