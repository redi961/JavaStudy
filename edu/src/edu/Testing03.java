package edu;
import java.util.Random;

public class Testing03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [][] = new int [5][5];
		Random random = new Random();
		
		for (int i=0; i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				a [i][j] = (int)(Math.random()*100);
			}
		}
		
		for (int i=0;i<a.length;i++) {
			for (int j=0; j<a[i].length;j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

}
