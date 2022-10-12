package Merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Merge_String {
	public static void main(String[] args) {
				ArrayList<String> list1 = new ArrayList<String>();
				list1.add("서울");
				list1.add("북경");
				list1.add("상해");
				list1.add("서울");
				list1.add("도쿄");
				list1.add("뉴욕");
				list1.add(1, "LA");

				ArrayList<String> list2 = new ArrayList<String>();
				list2.add("런던");
				list2.add("로마");
				list2.add("방콕");
				list2.add("북경");
				list2.add("도쿄");
				list2.add("서울");
				list2.add(1, "LA");
				
//				String a = "hello", b = "bye", temp = "";
//				temp = a;
//				a = b; // A와 B가 겹쳐서 Hello가 표기되지 않는경우 -> 가비지 
//				b = temp;
//				System.out.println(a);
//				System.out.println(b);

//				System.out.println("collection.sort()::");
			    Collections.sort(list1);
//			    System.out.println("list1::");
//			    for ( String city: list1)
//			    	System.out.print(city+ " ");
//			    System.out.println();
//			    System.out.println("list2::");
			    Collections.sort(list2);
//			    for ( String city: list2)
//			    	System.out.print(city+ " ");
				ArrayList<String> list3 = new ArrayList<String>();
				
				Iterator<String> iter1 = list1.iterator();
				//Iterator 안에 다음 값이 들어있는지 확인 true or False 로 표현
				String eq1 = "";
				String eq2 = "";
				
				
//				for (int i=0;i<list1.size();i++) {
//					for (int j=0; j<list2.size();j++) {
//						eq2 = list2.get(i);
//					}
//					eq1 = list1.get(i);
//					System.out.println("비교대상 eq1 : " + eq1 + "\t eq2 : " + eq2 );
//					// 해당 문자열의 첫글자끼리 아스키코드열의 비교 후 수치로 표기 // 앞 - 뒤 = 의 값이나옴
//					System.out.println("CompareTo " + i + "번째 확인문 : " + eq1.compareToIgnoreCase(eq2) + "\n");	
//				}
				
				
				while(iter1.hasNext()) {
					String obj = (String)iter1.next();
					list3.add(obj);
				}
				
				Iterator<String> iter2 = list2.iterator();
				while(iter2.hasNext()) {
					String obj = (String)iter2.next();
					list3.add(obj);
				}
				
				System.out.println();
			    System.out.println("merge:: ");
			    for ( String city: list3)
			    	System.out.print(city+ " ");
			    
			    
			    HashSet<String> hash = new HashSet<>();
			    for (String item : list3) {
			    	hash.add(item);
			    }
			    
			    System.out.println("\n중복 제거 :" + hash );
			}	
}
