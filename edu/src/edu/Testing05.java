package edu;
import java.util.Random;

public class Testing05 {

	public static void main(String[] args) {
		
		int a[][] = new int [2][3];
		int b[][] = new int [3][2];
		int c[][] = new int [a.length][b[0].length];
		
		Random random = new Random();
		
		for(int i = 0; i<a.length; i++) {
			for (int j=0;j<b[0].length;j++) {
				for (int k=0; k <a[0].length; k++ ) {
					a [i][k] = (int)(Math.random()*10);
					b [k][j] = (int)(Math.random()*10);
					
				}
			}
		}
		for(int i = 0; i<a.length; i++) {
			
			for (int j=0;j<b[0].length;j++) {
				for (int k=0; k <a[0].length; k++ ) {
					c [i][j] += a[i][k] * b[k][j];
				}
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
		for (int i=0;i<b.length;i++) {
			for (int j=0; j<b[i].length;j++) {
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		System.out.println("-----------");
		System.out.println("합산 결과");
		for (int i=0;i<c.length;i++) {
			for (int j=0; j<c[i].length;j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
	
	
}
