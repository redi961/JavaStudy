package edu;
import java.util.Scanner;

public class Testing02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a [][]  = new int[5][5];
		for (int i = 0; i<a.length; i++ ) {
			for (int j=0; j<a[i].length; j++) {
				
				int n = scan.nextInt();
				a [i][j] = n;
			}
		}
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		scan.close();
		
	}

}
