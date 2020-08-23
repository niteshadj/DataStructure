/**
 * 
 */
package linkedlist;

/**
 * @author nadjriya
 *
 */
public class DeleteDuplicatesSortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node removeDuplicates(Node root) {
		Node curr=root;
		Node next=root.next;
		while(curr!=null && next!=null){
			if(curr.data==next.data){
				while(curr!=null && next!=null && curr.data==next.data){
					next=next.next;
				}
				curr.next=next;
			}
			else{
				curr=curr.next;
				next=next.next;
			}
		}
		
		return root;
	}

}
