package Merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Exam01 {
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	for (int i=0; i<5; i++) {
		String input = sc.next();
		list1.add(i, input);
	}
	
	System.out.println("list 1 :: " + list1 + "\n");
	Collections.sort(list1);
	System.out.println("오름차순 list 1 정렬 :: " + list1 + "\n");
	Collections.sort(list1, Collections.reverseOrder());
	System.out.println("내림차순 list 1 정렬 :: " + list1 + "\n");
	
	}
	
	
}
