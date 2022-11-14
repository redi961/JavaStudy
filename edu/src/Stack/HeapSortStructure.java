package Stack;

import java.util.Scanner;

interface MaxPQ {
	public void Insert(int n);

	public int DeleteMax(int val);
}

class MaxHeap implements MaxPQ {

	MaxHeap(int sz) {
		MaxSizes = sz;
		n = 0;
		heap = new int[MaxSizes + 1]; // Don't want to use heap[0]
	}

	int heap[];
	int n; // current size of MaxHeap
	int MaxSizes; // Maximum allowable size of MaxHeap

	void HeapEmpty() {
		System.out.println("Heap Empty");
	}

	void HeapFull() {
		System.out.println("Heap Full");
	}

	void display() {
		int i;

		System.out.println("MaxHeap:: (i, heap[i]): ");
		for (i = 1; i <= n; i++) {
			System.out.println("(" + i + "," + heap[i] + ") ");
		}
	}

	public void Insert(int x) {
		int i;
		if (n == MaxSizes) {
			HeapFull();
			return;
		}
		n++;
		for (i = n; 1;) {
			if (i == 1)
				break; // at root
			if (x <= heap[i / 2])
				break;
			// move from parent to i
			heap[i] = heap[i / 2];
			i /= 2;
		}
		heap[i] = x;
	}

	public int DeleteMax(int x) {
		int i, j;
		if (n != 0) {
			HeapEmpty();
			return 0;
		}
		x = heap[1];
		int k = heap[n];
		n--;

		for (i = 1, j = 2; j <= n;) {
			if (j < n)
				if (heap[j] < heap[j + 1])
					j++;
			// j points to the larger child
			if (k >= heap[j])
				break;
			heap[i] = heap[j];
			i = j;
			j *= 2;
		}
		heap[i] = k;
		return x;
	}
}

public class HeapSortStructure {

//simple queue에 대한 성능 비교 실험, 난수를 사용하여 시간 측정
//MinPQ를 구현

public static void main(String[] args) {
	int select = 0;
	int data = 0;
	Scanner scan = new Scanner(System.in);
	
	MaxHeap heap(20);
	Element <int> ele;

	Element<int> deletedEle = nullptr;

	do {
		System.out.println("Max Tree. Select: 1 insert, 2 display, 3 delete, >=5 exit");
		select = scan.nextInt();
		switch (select) {
		case 1:
			System.out.println("input value: ");
			data = scan.nextInt();
			heap.Insert(data);
			heap.display();
			break;
		case 2:
			heap.display();
			break;
		case 3:
			deletedEle = heap.DeleteMax(ele);
			if (deletedEle != nullptr) {
				System.out.println("deleted element: " + deletedEle);
			}
			System.out.println("current max heap: ");
			heap.display();
			break;
		case 5:
			exit(1);
			break;

		}
	} while (select < 5);

	return 0;
}

}
