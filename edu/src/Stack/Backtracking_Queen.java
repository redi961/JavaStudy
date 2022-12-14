package Stack;

	class Backtracking_Queen {
		public static void SolveQueen(int[][] d) {
			int count = 0, mode = 0;
			int ix = 0, iy = 0;
			Stack3 st = new Stack3(10);
			Point p = new Point(ix, iy);
			d[ix][iy] = 1;
			count++;
			st.push(p);
			
			while (count < 8) {
				ix++;
				int cy = 0;
				while (ix < d.length) {
					cy = NextMove(d, ix, cy);
					System.out.println("ix = " + ix + "\t cy = " + cy);
					if (cy < d[0].length) {
						Point px = new Point(ix, cy);
						p = st.push(px);
						d[ix][cy] = 1;
						count++;
						break;
					}
					else {	p = st.pop();
						ix = p.getX();
						cy = p.getY();
						d[ix][cy] = 0;
						count--;
						cy++;
					}
				}
			}
		}

		public static boolean checkRow(int[][] d, int crow) {
			for (int i  = 0; i < d.length; i++)
				if (d[crow][i] == 1) return false;					
			return true;
		}

		public static boolean checkCol(int[][] d, int ccol) {
			for (int i  = 0; i < d.length; i++)
				if (d[i][ccol] == 1) return false;
			return true;
		}

		public static boolean checkDiagSW(int[][] d, int x, int y) { // x++, y-- or x--, y++ where 0<= x,y <= 7
			int cx = x, cy = y;
			while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
				if (d[cx][cy] == 1) return false;
				cx--;cy++;
			}
			cx = x; cy = y;
			while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
				if (d[cx][cy] == 1) return false;
				cx++;cy--;
			}
			return true;
		}
			

		public static boolean checkDiagSE(int[][] d, int x, int y) {// x++, y++ or x--, y--
			int cx = x, cy = y;
			while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
				if (d[cx][cy] == 1) return false;
				cx++;cy++;
			}
			cx = x; cy = y;
			while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
				if (d[cx][cy] == 1) return false;
				cx--;cy--;
			}
			return true;
		}

		public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
			if (checkRow(d, x) && checkCol(d, y) &&  checkDiagSW(d, x, y) && checkDiagSE(d, x, y)) return true;
			return false; 
		}

		public static int NextMove(int[][] d, int row, int col) {// 다음 row에 대하여 이동할 col을 조사
			while (col <d.length) {
				if (CheckMove(d, row, col)) return col;
				col++;
			}
			return d.length;
		}

		public class NextMove {
		}

		public static void main(String[] args) {
			int row = 8, col = 8;
			int[][] data = new int[8][8];
			for (int i = 0; i < data.length; i++)
				for (int j = 0; j < data[0].length; j++)
					data[i][j] = 0;

			SolveQueen(data);

			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(" " + data[i][j]);
				}
				System.out.println();
			}
		}
	}

