package com.cooper;

public class Countofcapitalorsmall {
public static void main(String[] args) {
	int up=0;
	int low=0;
	int special=0;
	String s ="Venk@tesh is G@0d Boy";
	String []st=s.split(" ");
    for (String string : st) {
    	char ch[]=string.toCharArray();
    	int a=ch.length;
    	for(int i=0;i<a;i++) {
    		if(ch[i]>=65 && ch[i]<=90) {
    			++up;
    		}
    		else if(ch[i]>=97 && ch[i]<=122) {
    			++low;
    		}
    		else
    			++special;
    	}
			
		}
		
    System.out.println("Number of Upper case is" +up);
    System.out.println("Number of Lower case is" +low);
    System.out.println("Number of special character is" +special);
	}
}
	
	
	

