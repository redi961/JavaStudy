package Stack;

import java.util.SortedSet;
import java.util.Stack;

public class MergeSort {

	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void merge(int[] a, int lefta, int righta, int leftb, int rightb ) {
		int p = lefta, q = leftb;
		int mid = righta;
		int idx = 0; int []ax = new int[20];
		while(p <= mid && q <= rightb) {
			if(a[p] <= a[q]) {
				ax[idx] = a[p];
				idx++;
				p++;
			}
			
			else {
				ax[idx] = a[q];
				idx++;
				q++;
			}
		}
		if (p > mid) {
			while (q <= rightb) {
				ax[idx] = a[q];
				idx++;
				q++;
			}
		}else {
			while(p <= mid) {
				ax[idx] = a[p];
				idx++;
				p++;
			}
		}
		p = lefta;
		for (int j = 0; j <idx; j++)
			a[p++] = ax[j];
	}

	// --- 퀵 정렬(비재귀 버전)---//
	static void MergeSort(int[] a, int left, int right) {
		if (left == right) return;
		int mid = (left+right)/2;
		MergeSort(a,left, mid);
		MergeSort(a, mid+1, right);
		merge(a, left, mid, mid+1, right);
	}
	public static void main(String[] args) {
		int nx = 20;
		int[] x = new int[20];
		for (int ix = 0; ix < 20; ix++) {
			double d = Math.random();
			x[ix] = (int) (d * 50);
		}
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		MergeSort(x, 0, nx - 1); // 배열 x를 퀵정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
