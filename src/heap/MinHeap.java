//package heap;
//
//import java.util.Scanner;
//
//class MinHeap {
//	int[] harr;
//	int capacity;
//	int heap_size;
//	
//	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int a = sc.nextInt();
//            MinHeap h = new MinHeap(a);
//            for (int i = 0; i < a; i++) {
//                int c = sc.nextInt();
//                int n;
//                if (c == 1) {
//                    n = sc.nextInt();
//
//                    h.insertKey(n);
//                }
//                if (c == 2) {
//                    n = sc.nextInt();
//                    h.deleteKey(n);
//                }
//                if (c == 3) {
//                    System.out.print(h.extractMin() + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//
//	MinHeap(int cap) {
//		heap_size = 0;
//		capacity = cap;
//		harr = new int[cap];
//	}
//
//	int parent(int i) {
//		return (i - 1) / 2;
//	}
//
//	int left(int i) {
//		return (2 * i + 1);
//	}
//
//	int right(int i) {
//		return (2 * i + 2);
//	}
//
//	int extractMin() {
//		if(heap_size==0)
//			return Integer.MIN_VALUE;
//		int res = harr[0];
//		harr[0] = harr[heap_size - 1];
//		heap_size--;
//
//		MinHeapify(0);
//		return res;
//	}
//
//	void insertKey(int k) {
//		if(capacity==heap_size)
//			return;
//		heap_size++;
//		harr[heap_size - 1] = k;
//		int j = heap_size - 1;
//		while (j > 0 && harr[parent(j)] > harr[j]) {
//			int temp = harr[parent(j)];
//			harr[parent(j)] = harr[j];
//			harr[j] = temp;
//			j = parent(j);
//		}
//	}
//
//	void deleteKey(int i) {
//		if(i>=heap_size)
//			return;
//		harr[i] = Integer.MIN_VALUE;
//
//		int j = i;
//		while (j > 0 && harr[parent(j)] > harr[j]) {
//			int temp = harr[parent(j)];
//			harr[parent(j)] = harr[j];
//			harr[j] = temp;
//			j = parent(j);
//		}
//
//		extractMin();
//	}
//
//	// Decrease key operation, helps in deleting the element
//	void decreaseKey(int i, int new_val) {
//		harr[i] = new_val;
//		while (i != 0 && harr[parent(i)] > harr[i]) {
//			int temp = harr[i];
//			harr[i] = harr[parent(i)];
//			harr[parent(i)] = temp;
//			i = parent(i);
//		}
//	}
//
//	/*
//	 * You may call below MinHeapify function in above codes. Please do not
//	 * delete this code if you are not writing your own MinHeapify
//	 */
//	void MinHeapify(int i) {
//		int l = left(i);
//		int r = right(i);
//		int smallest = i;
//		if (l < heap_size && harr[l] < harr[i])
//			smallest = l;
//		if (r < heap_size && harr[r] < harr[smallest])
//			smallest = r;
//		if (smallest != i) {
//			int temp = harr[i];
//			harr[i] = harr[smallest];
//			harr[smallest] = temp;
//			MinHeapify(smallest);
//		}
//	}
//}