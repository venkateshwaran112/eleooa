package com.pro;

public class Vowels {
	public static void main(String[] args) {
//		String s ="God 98is G93764reat";
//		int a=s.length();
//		for(int i=0;i<a;i++) {
//			char ch=s.charAt(i);
//			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//				System.out.print(ch);
//			}
//		}
		
		String s="god is great";
		char[] cha = s.toCharArray();
		
		int le = cha.length;
	     char[] ne = new char[le];
		for (char c : cha) {
			if(c>=97 && c<=122) {
				char te= (char)(c-32);
                System.out.print(te);
			}
			
		}
	}

}
