package com.pro;

public class Printaccordinglength {
	public static void main(String[] args) {
		
		String s= "Hi friedns how is today interview";
		String []si=s.split(" ");
		int a=si.length;
//		int ne=a*2;
//		Object []pr= new String[ne];
		
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++) {
				if(si[i].length()>si[j].length()) {
					String temp=si[i];
					si[i]=si[j];
					si[j]=temp;
				}
			}
		}
		for(int j=0;j<a;j++) {
			System.out.print(si[j] + " ");
		}
		
//		----------------------------------------------------------------
		
//		for (int p=0,i=0;p<=a-1;p++,i+=2) {
//			String lo=si[p];
//			int b=lo.length();
//			pr[i]=lo;
//			pr[i+1]=String.valueOf(b);
//		}
//		
//		for(int i=0;i<ne;i++) {
//			if(i%2==0) {
//				System.out.print(pr[i] +"-");
//			}
//			else {
//				System.out.print(pr[i]+"; ");
//			}
//		}
		//-------------------------------------------------------------
		
		
//		TreeMap<String, Integer> tr=new TreeMap<String, Integer>();
//		for (String string : si) {
//			String le=string;
//			int b=le.length();
//			tr.put(le, b);
//		}
//			System.out.println(tr);	
			
			
	}

}
