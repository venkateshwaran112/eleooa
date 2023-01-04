package com.pro;

public class Stringcapitals {

	public static void main(String[] args) {
         String s="a maNUal tester with foUr years of excellence";
        String c= s.toLowerCase();
        int al=c.length();
         String si[]= c.split(" ");
         String rev="";	 
        for (String string : si) {
        	String sd=string;
        	int b=sd.length();
        	for(int i=b-1;i>=0;i--) {
        		rev=rev+sd.charAt(i);
        	}
        	rev=rev+" ";	
		}
        String re[]=rev.split(" ");
        for (String string : re) {
        	 int a=string.length();
         	System.out.print(string.substring(0,1).toUpperCase()+string.substring(1,a)+" ");
		}
      

         
	}

}
