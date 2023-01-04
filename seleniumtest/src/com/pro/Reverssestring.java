package com.pro;

import java.util.Calendar;


public class Reverssestring {
	public static void main(String[] args) {
		

//	String or = "Venkateshwaran";
//	char ch[] = or.toCharArray();
//	String rev = "";
//	int length = or.length();
//	for(int i=length-1; i>=0; i--) {
//		rev = rev + or.charAt(i);
//	}
//   System.out.println(rev);
//}
		
	
		
	Calendar cal = Calendar.getInstance();
	String[] dateArr = cal.getTime().toString().split(" ");
for (String string : dateArr) {
	System.out.println(string);
}

	}	
}
