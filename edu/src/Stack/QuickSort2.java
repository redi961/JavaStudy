package Stack;
//퀵 정렬(비재귀 버전)

import java.util.Stack;

import Stack.Stack3;

public class QuickSort2 {

	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 퀵 정렬(비재귀 버전)---//
	static void quickSort(int[] a, int left, int right) {

		Stack<Point> lst = new Stack<>();
		Point px = new Point(left, right);
		lst.push(px);
		while (lst.isEmpty() != true) {
			px = lst.pop();
			int pl = left = px.ix;
			int pr = right = px.iy;
			int x = a[(left + right) / 2];
			
			do {
				while (a[pl] < x) pl++;
				while (a[pr] > x) pr--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			}while (pl <= pr);
		if (left < pr) {
			Point pt = new Point(left, pr);
			lst.push(pt);
		}
		if (pl < right) {
			Point pt = new Point(pl, right);
			lst.push(pt);
		}
		
		}
	}

	public static void main(String[] args) {
		int nx = 10;
		int[] x = new int[10];
		for (int ix = 0; ix < 10; ix++) {
			double d = Math.random();
			x[ix] = (int) (d * 20);
		}
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		quickSort(x, 0, nx - 1); // 배열 x를 퀵정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
