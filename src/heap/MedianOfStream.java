/**
 * 
 */
package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Given an input stream of N integers. The task is to insert these
 *         numbers into a new stream and find the median of the stream formed by
 *         each insertion of X to the new stream.
 * 
 *         Example 1:
 * 
 *         Input: N = 4 X[] = 5,15,1,3 Output: 5 10 5 4 Explanation:Flow in
 *         stream : 5, 15, 1, 3 5 goes to stream --> median 5 (5) 15 goes to
 *         stream --> median 10 (5,15) 1 goes to stream --> median 5 (5,15,1) 3
 *         goes to stream --> median 4 (5,15,1 3)
 *
 */
public class MedianOfStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0){
			int x=sc.nextInt();
			insertHeap(x);
			System.out.println(getMedian());
		}

	}

	static PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
	static PriorityQueue<Integer> min = new PriorityQueue<>();

	// Function to insert heap
	public static void insertHeap(int x) {

		if (max.isEmpty()){
			max.add(x);
			return;
		}

		if (max.size() == min.size()) {
			if (min.peek() < x) {
				min.add(x);
				max.add(min.poll());
			} else
				max.add(x);
		} else {
			if (max.peek() > x) {
				max.add(x);
				min.add(max.poll());
			} else
				min.add(x);
		}

	}

	// function to getMedian
	public static double getMedian() {

		if (max.size() == min.size())
			return (max.peek() + min.peek()) / 2;
		return max.peek();

	}

}
