package edu;
import java.util.Random;


public class Procession {
		private int numA;
		private int numB;
		private int numC;
		private int numD;
		
		Random random = new Random();
		
		public void setNum1 (int numA, int numB ) {
			this.numA = numA;
			this.numB = numB;
					
		}
		public void setNum2 (int numC, int numD) {
			this.numC = numC;
			this.numD = numD;
		}
		int procA[][] = new int[numA][numB];
		int procB[][] = new int[numC][numD];
		// int procC[][] = new int[procA.length][procB[0].length];
		
		public void setRandom () {
			if (numB == numC) {
				for(int i = 0;i<procA.length; i++) {
					for (int j =0;j<procB[0].length;j++) {
						for (int k =0; k<procA[0].length; k++) {
							procA [i][k] = (int)(Math.random()*10);
							procB [k][j] = (int)(Math.random()*10);
						}
					}
				}
				System.out.println("A행렬");
				for (int i=0;i<procA.length;i++) {
					for (int j=0; j<procA[i].length;j++) {
						System.out.print(procA[i][j]);
						System.out.print("\t");
					}
					System.out.println("\n");
				}
				
				System.out.println("----------");
				System.out.println("B행렬");
				for (int i=0;i<procB.length;i++) {
					for (int j=0; j<procB[i].length;j++) {
						System.out.print(procB[i][j]);
						System.out.print("\t");
					}
					System.out.println("\n");
				}
			}
				
//				for(int i = 0;i<procA.length; i++) {
//					for (int j =0;j<procB[0].length;j++) {
//						for (int k =0; k<procA[0].length; k++) {
//							procC [i][j] += procA[i][k] * procB[k][j];
//						}
//					}
//				}
//			}
			else {
				System.out.println("식에 오류가 있습니다.");
			}
		this.procA = procA;
		this.procB = procB;
		//this.procC = procC;
	}
		
	
//			System.out.println("합산 결과");
//			for (int i=0;i<procC.length;i++) {
//				for (int j=0; j<procC[i].length;j++) {
//					System.out.print(procC[i][j]);
//					System.out.print("\t");
//				}
//				System.out.println("\n");
//			}
		}
		
	

	


