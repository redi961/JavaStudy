package edu;
import java.util.Random;

public class Testing04 {
	public static void main(String[] args) {
		int a [][] = new int [2][2];
		int b [][] = new int [2][2];
		int c [][] = new int [2][2];
		Random random = new Random();
		
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a [i][j] = (int)(Math.random()*100);
				b [i][j] = (int)(Math.random()*100);
				c [i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("A행렬");
		for (int i=0;i<a.length;i++) {
			for (int j=0; j<a[i].length;j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		System.out.println("----------");
		System.out.println("B행렬");
		for (int i=0;i<a.length;i++) {
			for (int j=0; j<a[i].length;j++) {
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		System.out.println("-----------");
		System.out.println("합산 결과");
		for (int i=0;i<a.length;i++) {
			for (int j=0; j<a[i].length;j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
	}
	
		
}
