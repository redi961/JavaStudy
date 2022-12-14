package Merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class MergeList {
	
	public static String[] removeElement (String [] arr , String item) {
		List<String>list = new ArrayList<>(Arrays.asList(arr));
		list.remove(item);
		return list.toArray(String[]::new);
	}
	
	public static String[] removeDuplicate (String [] lst1) {
		int count = lst1.length;
		for (int i=0; i< count; i++) {
			// for (int j = i+1; j<count; j++)
			int j = i+1;
			while (j<count) {
				if ((lst1[i].compareTo(lst1[j])) == 0) {
					lst1 = removeElement(lst1, lst1[j]);
					count--;
					
				}
				else j++;
			}
	}
		return lst1;
}
	 
	public static String[] Insertlst (String [] lst1, String [] lst2, String [] lst3) {
		int i=0;
		int j=0;
		int k=0;
		int lstcnt=0;
		// CompareTo를 이용한 배열정렬 // lstcnt는 완성된 배열의 사이즈 측정용 변수
		while(i<lst1.length && j<lst2.length) {
			if(lst1[i].compareTo(lst2[j]) < 0) {
				lst3[k] = lst1[i];	i++; k++; lstcnt++;}
			else if (lst1[i].compareTo(lst2[j]) == 0) {
				lst3[k] = lst1[i];	i++; j++; k++; lstcnt++;}
			else if (lst1[i].compareTo(lst2[j]) > 0) {
				lst3[k] = lst2[j]; j++; k++; lstcnt++;}
		}
		while(i<lst1.length) {
			lst3[k] = lst1[i]; i++; k++;
		}
		while(j<lst2.length) {
			lst3[k] = lst2[j]; j++; k++;
		}
		return lst3;
}

	public static void main(String[] args) {

				int i=0; 
				int j=0; 
				int k=0;
				int lstcnt = 0;
		
				ArrayList<String> list1 = new ArrayList<String>();
				list1.add("서울");
				list1.add("북경");
				list1.add("상해");
				list1.add("서울");
				list1.add("도쿄");
				list1.add("뉴욕");

				ArrayList<String> list2 = new ArrayList<String>();
				list2.add("뉴욕");
				list2.add("런던");
				list2.add("로마");
				list2.add("방콕");
				list2.add("북경");
				list2.add("도쿄");
				list2.add("런던");
				list2.add(1, "LA");
				
			    Collections.sort(list1);
			    System.out.print("list1 :: ");
			    for (String city: list1)
			    	System.out.print(city+ " ");
			    System.out.println("");
			    System.out.print("list2 :: ");
			    Collections.sort(list2);
			    for (String city: list2)
			    	System.out.print(city+ " ");
				ArrayList<String> list3 = new ArrayList<String>();
				// 리스트를 Array로 변환하며 파라메터로 들어가는 인자와 Size를 맞춤
				// 파라메터로 들어가는 인자보다 list의 Size가 클시 list의 사이즈를 유지하며
				// list의 Size가 인자보다 작을시 인자의 Size로 Array를 구축한다.
				String []lst1 = new String[0];
				lst1 = list1.toArray(lst1);
				String []lst2 = new String[0];
				lst2 = list2.toArray(lst2);
				String [] lst3 = new String[10];
				int count = lst1.length;
				Collections.sort(list1);
				Collections.sort(list2);
				
				Iterator<String> iter1 = list1.iterator();
//				while(iter1.hasNext()) {
//					String obj = (String)iter1.next();
//					list3.add(obj);
//				}
				
				Iterator<String> iter2 = list2.iterator();
//				while(iter2.hasNext()) {
//					String obj = (String)iter2.next();
//					list3.add(obj);
//				}
				
				System.out.println("");
				String st1 = iter1.next();
				String st2 = iter2.next();
				while (iter1.hasNext() && iter2.hasNext()) {
					if(st1.compareTo(st2) < 0) 
					{
						list3.add(st1);
						st1 = iter1.next();
					}
					else if (st1.compareTo(st2) > 0) 
					{
						list3.add(st2);
						st2 = iter2.next();
					}else 	{
						list3.add(st1);
						st1 = iter1.next();
						st2 = iter2.next();
					}
				while(iter1.hasNext()) {
						list3.add(st1);
						st1 = iter1.next();
					}
				while(iter2.hasNext()) {
						list3.add(st2);
						st2 = iter2.next();
					}
				}
			
				Iterator<String> iter3 = list3.iterator();
				System.out.print("MergeList :: ");
				for (String city : list3)
					System.out.print(city + " ");
				while (iter3.hasNext()) {
					count = 0;
					String str = iter3.next();
					for (i=0; i < list3.size(); i++) {
						//Str문과 list3의 i번째 문과의 비교
						//비교를 시작할때 자신과 비교함으로써 count 값이 1이되고 추가 중복 발생시 count2 값이 2가되며, 해당 배열을 삭제처리함
						// 배열 검사 확인용 코드
						// System.out.println(str + "//" + list3.get(i) + " C : " + count );
						if (list3.get(i) == str) {
							count++;
						}
					}
					if (count >= 2) {
						iter3.remove();
					}
					count =0;
				}
				
				Collections.sort(list3);
				lst1 = removeDuplicate(lst1);
				lst2 = removeDuplicate(lst2);
				
				System.out.println("\n========");
				System.out.print("List 1 :: ");
				for (String city : lst1)
					System.out.print(city + " ");
				System.out.println("");
				System.out.print("List 2 :: ");
				for (String city : lst2)
					System.out.print(city + " ");
				
				Insertlst(lst1, lst2, lst3);
				System.out.println("");
				
//				String [] lst4 = new String[lstcnt];
//				for (i=0; i<lstcnt; i++) {
//					lst4[i] = lst3[i];
//				}
				
				System.out.print("list 3 :: ");
				for (String city : lst3)
					System.out.print(city + " ");
				
				System.out.println("");
				System.out.print("Sort MergeList :: ");
				for (String city : list3)
					System.out.print(city + " "); 
	}
}
