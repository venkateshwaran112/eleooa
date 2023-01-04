package com.pro;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Javapgms {
	
		public static void main(String[] args) {
		        <String> list = new ArrayList<String>();
			list.add("ven");
			list.add("raj");
			list.add("raj");
			list.add("vasu");
			list.add("ven");
//			list.add("c");
//			list.add("a");
//			list.add("a");
//			list.add("a");
			System.out.println("Count all with frequency");
			Set<String> uniqueSet = new HashSet<String>(list);
			for (String temp : uniqueSet) {
				System.out.println(temp + ": " + Collections.frequency(list, temp));
			}
		}
	}

	


