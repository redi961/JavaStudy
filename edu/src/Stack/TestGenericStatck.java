package Stack;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class TestGenericStatck {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Point p = new Point (8 , 8);
		Stack3 s = new Stack3 (64); // 최대 64 개를 푸시할 수 있는 스택
		
		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			switch (menu) {
			case 1: // 푸시
				System.out.print("데이터: ");
				
				if (s.isFull())
					System.out.println("스택이 가득찼있습니다.");
				else {
					double a = Math.random() * 10;
					double b = Math.random() * 10;
					int x = (int)a;
					int y = (int)b;
					
					System.out.println(p.getX() + ", " + p.getY());
					Point pa = new Point (x,y);
					
					p = pa;
					s.push(p);
				}
				break;

			case 2: // 팝
				if (s.isEmpty())
					System.out.println("스택이 비어있습니다.");
				else {
					p = s.pop();
					System.out.println("팝한 데이터는 " + p + "입니다.");
				}
				break;

			case 3: // 피크
				if (s.isEmpty())
					System.out.println("스택이 비어있습니다.");
				else {
					p = s.peek();
					System.out.println("피크한 데이터는 " + p + "입니다.");
				}
				break;

			case 4: // 덤프
				s.dump();
				break;
			}
		}
	}
}