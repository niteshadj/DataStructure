/**
 * 
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author nadjriya
 *
 */
public class QueueOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class GfgQueue {
	Queue<Integer> queue=new LinkedList<>();
    void enqueue(int x){
    	queue.add(x);
    }
    void dequeue(){
        queue.poll();
    }
    int front(){
        return queue.peek();
    }
    String find(int x){
    	if(queue.contains(x))
    		return "Yes";
    	else
    		return "No";
    }
}
