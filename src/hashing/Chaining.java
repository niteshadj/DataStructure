/**
 * 
 */
package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Separate chaining technique in hashing allows to us to use a linked
 *         list at each hash slot to handle the problem of collisions. That is,
 *         every slot of the hash table is a linked list, so whenever a
 *         collision occurs, the element can be appened as a node to the linked
 *         list at the slot.
 *
 */
public class Chaining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int hashSize = sc.nextInt();
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {

				a[i] = sc.nextInt();
			}

			System.out.println(separateChaining(a, n, hashSize));
		}
	}

	public static ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize) {
		ArrayList<Integer>[] hashTable = new ArrayList[hashSize];
		for (int i = 0; i < hashSize; i++) {
			hashTable[i] = new ArrayList<>();
		}
		int key = 0;
		for (int i = 0; i < n; i++) {
			key = arr[i] % hashSize;

			hashTable[key].add(arr[i]);
		}

		ArrayList<ArrayList<Integer>> hashTableList = new ArrayList<>(Arrays.asList(hashTable));
		System.out.println(hashTableList);
		return hashTableList;
	}

}
