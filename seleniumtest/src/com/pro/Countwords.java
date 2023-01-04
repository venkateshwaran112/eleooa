package com.pro;

import java.util.ArrayList;
import java.util.Scanner;

public class Countwords {
	
	public static void main(String[] args) {
//		Scanner snr = new Scanner(System.in);
//		System.out.println("Enter the String");
//		String []arr = new String[6];
//		for(int i=0;i<5;i++) {
//		arr[i] = snr.nextLine();
//		}
		
//		String str2="cALLfortheDAY";
//		String str3="callfortheday";
//		if(str2.equalsIgnoreCase(str3))
//		{
//			System.out.println("Both the strings are equal");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names you want to add in list");
		String ab[]= new String[6];
		for(int i=0;i<5;i++)
		{
			ab[i]= sc.nextLine();
		}
		ArrayList<String> myarrlist = new ArrayList<String>();
		for(int i=0;i<5;i++) {
		System.out.println(myarrlist.add(ab[i]));
		}
		
	
			System.out.println(myarrlist);
			
	
		
//		for (int i=0;i<5;i++) {
//			System.out.println(arr[i]);
//			
//		}
//		String s="This is the story about the boy in london";
//		HashMap<String,Integer> ha = new HashMap<String, Integer>();
//		String []a = s.split(" ");
//		for (String str : a) {
//			if(ha.containsKey(str)) {
//				int ab = ha.get(str);
//				ha.put(str, ab+1);
//			}
//			else {
//				ha.put(str,1);
//							}}
//		
//		if(ha.containsKey("the")) {
//		
//			System.out.println("The recurrant value" +ha.get("the"));
//				
//			
//		}
//		
	}

}
