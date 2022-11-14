package Chap11_Hashing;

public class Chap11_Test_ChainHash {

}
package Chap11_Hashing;
//hash node가 student 객체일 때를 구현하는 과제
//체인법에 의한 해시
import java.util.Scanner;

import Chap11_Hashing.ChainHashTester.Data;

class Student {
  static final int NO   = 1;        // 번호를 읽어 들일까요?
  static final int NAME = 2;        // 이름을 읽어 들일까요?

  private Integer no;                      // 회원번호(키값)
  private String  name;                    // 이름

  //--- 키값 ---//
  public Integer keyCode() {
      return no;
  }

  //--- 문자열 표현을 반환 ---//
  public String toString() {
      return name;
  }
  public Student(Integer snum, String sname) {
  	no = snum; name = sname;
  }
  public Student(Student s) {
  	no = s.no; name = s.name;
  }
  public Student() {
  	no = null; name = null;
  }
  //--- 데이터를 읽어 들임 ---//

}
class ChainHash2 {
//--- 해시를 구성하는 노드 ---//
class Node2 {
   private Student data;                 // 키값
   private Node2 next;        // 뒤쪽 포인터(뒤쪽 노드에 대한 참조)

   //--- 생성자(constructor) ---//
   public Node2(Student s) {
       this.data  = new Student(s);
       this.next = null;
   }
   Node2(Student s, Node2 p) {
       this.data  = s;
       this.next = p;

   }
   Node2() {
       this.data  = null;
       this.next = null;
   }
   //--- 키값을 반환 ---//
   Integer getKey() {
       return data.keyCode();
   }

   //--- 키의 해시값을 반환 ---//
   public int hashCode() {
   	int hash = 11;
   	hash = 31* hash * getKey();
   	hash = hash * hash;
       return hash;
   }
}

private int    size;              // 해시 테이블의 크기
private Node2[] table;        // 해시 테이블

//--- 생성자(constructor) ---//
public ChainHash2(int capacity) {
   try {
       table = new Node2[capacity];
       this.size = capacity;
   } catch (OutOfMemoryError e) {        // 테이블을 생성할 수 없음
       this.size = 0;
   }
}

//--- 해시값을 구함 ---//
public int hashValue(Object key) {
	int hash = 11;
	hash = 31* hash * (int)key;
	hash = hash * hash;
   return hash;


}

//--- 키값이 key인 요소를 검색(데이터를 반환) ---//
public int search(int key) {
   int hash = hashValue(key);            // 검색할 데이터의 해시값
   Node2 p = table[hash];            // 선택 노드

   while (p != null) {
       if (p.getKey() == key)
           return p.getKey();                // 검색 성공
       p = p.next;                             // 다음 노드를 선택
   }
   return 0;                                // 검색 실패
}

//--- 키값이 key인 데이터를 data의 요소로 추가 ---//
public int add(Student st) {
   int hash = hashValue(st.keyCode()) % 9;            // 추가할 데이터의 해시값
   Node2 p = table[hash];            // 선택 노드
//구현 필요함
}

//--- 키값이 key인 요소를 삭제 ---//
public int remove(int key) {
   int hash = hashValue(key);            // 삭제할 데이터의 해시값
   Node2 p = table[hash];            // 선택 노드
   Node2 pp = null;                  // 바로 앞의 선택 노드
   //구현실습 
  
 
    
   return 1;                             // 찾는 키값이 없음
}

//--- 해시 테이블을 덤프(dump) ---//
public void dump() {
   for (int i = 0; i < size; i++) {
       Node2 p = table[i];
       System.out.printf("%02d  ", i);
       while (p != null) {
           System.out.printf("→ %s ", p.getKey());
           p = p.next;
       }
       System.out.println();
   }
}
}


public class ChainHash_student {
	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		ChainHash2 hash = new ChainHash2(11);
		Student data;
		int select = 0;
		final int count = 3;
		while (select != 6) {
			System.out.println(1);
			System.out.println(
					"SimpleChainHash. Select 1:Add, 2. Delete, 3:Search, 4. PrintDump, 5. Quit =>");

			select = stdIn.nextInt();
			switch (select) {
			case 1:
				Student[] input = new Student[count];
				Integer sno = 0;
				String sname = null;
				for (int ix = 0; ix < count; ix++) {

	                 System.out.println("입력 데이터(sno, sname):: ");

	                 System.out.print("번호: ");
	                 sno = stdIn.nextInt();

	                 System.out.print("이름: ");
	                 sname = stdIn.next();
	                 System.out.print("sno =  " + sno);
	                 input[ix] = new Student(sno, sname);
	                  hash.add(input[ix]);
				
					System.out.print(" " + input[ix]);
				}
				break;
			case 2:
				// Delete
				break;
			case 3:
				System.out.println("Search Value:: ");
				int val = stdIn.nextInt();
				hash.search(val);
				System.out.println();
				break;
			case 4:
				hash.dump();
				break;
			case 5:
				System.out.println("Quit");
				break;

			default:
				System.out.println("WRONG INPUT  ");
				System.out.println("Re-Enter");
				break;
			}
		}
	}
}
