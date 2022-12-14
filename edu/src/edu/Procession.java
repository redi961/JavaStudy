package edu;
import java.util.Random;

public class Procession {
		private int numA, numB, numC, numD;
		
		int procA[][] = {};
		int procB[][] = {};
		int procC[][] = {};
		
		String a;
		
		Random random = new Random();
// A행열 행/열 크기 선언		
		public void setNum1 (int numA, int numB ) {
			int procA[][] = new int[numA][numB];
			this.procA = procA;
					
		}

// B행열 행/열 크기 선언		
		public void setNum2 (int numC, int numD) {
			int procB[][] = new int[numC][numD];
			this.procB = procB;
		}

// 행렬길이 확인용 메소드		
		public void showLengthA () {
			System.out.println(procA.length + "," + procA[0].length);
		}
		public void showLengthB () {
			System.out.println(procB.length + "," + procB[0].length);
		}
		
// A의 행과 B의 열이 일치하는 경우 함수 실행 -> A/B 행렬에 10 미만의 랜덤숫자 대입됨
		public void setRandom () {
			if (procA[0].length == procB.length) {
				for(int i = 0;i<procA.length; i++) {
					for (int j =0;j<procB[0].length;j++) {
						for (int k =0; k<procA[0].length; k++) {
							procA [i][k] = (int)(Math.random()*10);
							procB [k][j] = (int)(Math.random()*10);
						}
					}
				}
// C행렬 선언 및 행렬 곱셈 계산
				int procC [][] = new int [procA.length][procB[0].length];
				for(int i = 0; i<procA.length; i++) {
					
					for (int j=0;j<procB[0].length;j++) {
						for (int k=0; k <procA[0].length; k++ ) {
							procC [i][j] += procA[i][k] * procB[k][j];
						}
					}
				}
// Random 함수 적용된 행렬의 표기				
				System.out.println("A 행렬\n");
				for (int i=0;i<procA.length;i++) {
					for (int j=0; j<procA[i].length;j++) {
						System.out.print(procA[i][j]);
						System.out.print("\t");
					}
					System.out.println("\n");
				}
				System.out.println("B 행렬\n");
				for (int i=0;i<procB.length;i++) {
					for (int j=0; j<procB[i].length;j++) {
						System.out.print(procB[i][j]);
						System.out.print("\t");
					}
					System.out.println("\n");
				}
				System.out.println("합산 결과\n");
				for (int i=0;i<procC.length;i++) {
					for (int j=0; j<procC[i].length;j++) {
						System.out.print(procC[i][j]);
						System.out.print("\t");
					}
					System.out.println("\n");
				}		
				this.procC = procC;
			}
// A의 열과 B의 행이 일치하지않을시 메세지 출력후 계산 진행하지 않음
			else {
				System.out.println("식에 오류가 있습니다.");
				}

	}
}
	
		

		

		
	

	


