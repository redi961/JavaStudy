package Stack;

class items {
	int x;
	int y;
	int dir;

	public items(int a, int b, int c) {
		this.x = a;
		this.y = b;
		this.dir = c;
	}

	public String toString() {
		return "<<" + x + y + dir;
	}
}

class offsets {
	int a, b;
	public offsets(int ax, int bx) {
		a = ax; b = bx;
	}
}

public class Mazegame {

	static int maze[][] = new int[100][100];
	static int mark[][] = new int[100][100];

	static void path(int[][] maze2, int[][] mark2, int m, int p) {
		offsets moves[] = new offsets[8];
		for (int i = 0; i < 8; i++)
		moves[i] = new offsets(0,0);
		
		moves[0].a = -1;
		moves[0].b = 0;
		moves[1].a = -1;
		moves[1].b = 1;
		moves[2].a = 0;
		moves[2].b = 1;
		moves[3].a = 1;
		moves[3].b = 1;
		moves[4].a = 1;
		moves[4].b = 0;
		moves[5].a = 1;
		moves[5].b = -1;
		moves[6].a = 0;
		moves[6].b = -1;
		moves[7].a = -1;
		moves[7].b = -1;
		mark[1][1] = 1;
		Stack2 st = new Stack2(50);
		items temp = new items(1, 1, 2);
		st.push(temp);

		while (!st.isEmpty()) // stack not empty
		{
			temp = st.pop(); // unstack
			int i = temp.x;
			int j = temp.y;
			int d = temp.dir;
			while (d < 8) // moves forward
			{
				// outFile << i << " " << j << " " << d << endl;
				System.out.println("outFile : i : " + i + "\t j : "+ j + "\t d : " +d);
				int g = i + moves[d].a;
				int h = j + moves[d].b;
				if ((g == m) && (h == p)) { // reached exit
											// output path
					
					// cout << stack;

					// cout << "the term near the exit: " << i << " " << j << endl;
					System.out.println("the ");
					
					// cout << "exit: " << m << " " << p << endl;
					return;
				}
				if ((maze[g][h] == 0) && (mark[g][h] == 0)) { // new position
					mark[g][h] = 1;
					// push the old temp to the stack, but the direction changes.
					// Because the neighbor in the direction of d has been checked.
					items tp = new items(1, 1, 2);
					tp.x = i;
					tp.y = j;
					tp.dir = d + 1;
					
					st.push(tp); // stack it
					i = g;
					j = h;
					d = 0; // moves to (g,h)
				} else
					d++; // try next direction
			}
		}
		// cout << "no path in maze " << endl;
	}

	/*
	 * //maze[][], mark[][]를 class의 private data member로 선언 //main()에서는 class의
	 * public function의 호출로 미로 찾기 //
	 */
//void main() {
	public static void main(String[] args) {
		int input[][] = { // 12 x 15
				{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 }, { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, { 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 }, };

		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 17; j++) {
				if ((i == 0) || (j == 0) || (i == 13) || (j == 16))
					maze[i][j] = 1;
				else {
					maze[i][j] = input[i - 1][j - 1];
				}
				mark[i][j] = 0;

			}
		}
		System.out.println("maze[12,15]::");
		for (int i = 0; i <= 13; i++) {
			for (int j = 0; j <= 16; j++) {
				System.out.print(maze[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("mark::");
		for (int i = 0; i <= 13; i++) {
			for (int j = 0; j <= 16; j++) {
				System.out.print(mark[i][j] + " ");

			}
			System.out.println();
		}
		path(maze, mark, 12, 14);
		System.out.println("mark::");
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 15; j++) {
				System.out.print(mark[i][j] + " ");

			}
			System.out.println();
		}

	}
}
