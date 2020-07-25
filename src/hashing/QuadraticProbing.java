/**
 * 
 */
package hashing;

import java.util.Scanner;

/**
 * @author nadjriya
 * 
 *         Quadratic probing is a collision handling technique in hashing.
 *         Quadratic probing says that whenever a collision occurs, search for
 *         i2 position.
 * 
 *         Given an array of integers and a Hash table. Fill the elements of the
 *         array into the hash table by using Quadratic Probing in case of
 *         collisions.
 *
 */
public class QuadraticProbing {

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
			quadraticProbing(hashTable, hashSize, a, n);
			for (int i = 0; i < hashSize; i++) {

				System.out.print(hashTable[i] + " ");
			}
		}

	}

	static void quadraticProbing(int[] hash, int hash_size, int arr[], int N) {

		for (int i = 0; i < hash_size; i++) {

			hash[i] = -1;

		}

		for (int i = 0; i < N; i++) {

			int key = arr[i] % hash_size;

			if (hash[key] == -1)
				hash[key] = arr[i];
			else {
				int k = 1;
				int j = (key + k * k) % hash_size;
				while (hash[j] != -1 && j != key) {
					j = (key + k * k) % hash_size;
					k++;

				}
				if (j != key) {
					hash[j] = arr[i];
				}
			}

		}

	}

}
