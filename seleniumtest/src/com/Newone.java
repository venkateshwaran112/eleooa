package com;

public class Newone {

	public static void main(String[] args) {
		String S="V3en1kat2esh5war6an8";
		char[] ch = S.toCharArray();
		for (char c : ch) {
			int count=0;
			if(c>='0' && c<='9') {
				count++;
			}
			else
				System.out.print(c);
			
		}
		
	}
}
