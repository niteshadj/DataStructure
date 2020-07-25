/**
 * 
 */
package hashing;

import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Linear probing is a collision handling technique in hashing. Linear
 *         probing says that whenever a collision occurs, search for the
 *         immediate next position.
 * 
 *         Given an array of integers and a hash table size. Fill the array
 *         elements into a hash table using Linear Probing to handle collisions.
 *
 */
public class LinearProbing {

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

			int[] hashTable = new int[hashSize];
			linearProbing(hashTable, hashSize, a, n);
			for (int i = 0; i < hashSize; i++) {

				System.out.print(hashTable[i] + " ");
			}
		}
	}

	static int[] linearProbing(int hash[], int hash_size, int arr[], int N) {

		for (int i = 0; i < hash_size; i++) {

			hash[i] = -1;

		}

		for (int i = 0; i < N; i++) {

			int key = arr[i] % hash_size;

			if (hash[key] == -1)
				hash[key] = arr[i];
			else {
				int j = (key + 1) % hash_size;
				while (hash[j] != -1 && j != key) {
					j = (j + 1) % hash_size;

				}
				if (j != key) {
					hash[j] = arr[i];
				}
			}

		}

		return hash;
	}

}
