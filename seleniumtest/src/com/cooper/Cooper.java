package com.cooper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cooper {
	private static final Comparator<? super Integer> Integer = null;
	private static final Comparator<? super String> String = null;

	public static void main(String[] args) {
//		List<String> string = Arrays.asList("ab","aba","pop","xyz");
//		string.stream().filter(x->x.length()>0 && x.endsWith(String.valueOf(x.charAt(0)))).forEach(System.out::println);
		
//		int a[]= {0,1,1,1,1,0,1,0,1,0,1,1,0,0,1,1,0,1,0,1,0,1};
//		int count=0;
//		int b= a.length;
//		for(int i=0;i<b;i++) {
//			if(a[i]==1) {
//				++count;
//			}
//			}
//		System.out.println("Number of 1s is"+count);
//		System.out.println("Number of 0s is"+(b-count));
//		}
//	
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("venk");
		a.add("raj");
		a.add("vasu");
		a.add("Muru");
//		a.sort(String);
		System.out.println(a.get(0));
		Collections.sort(a);
		System.out.println(a);
		
		
	}

}
