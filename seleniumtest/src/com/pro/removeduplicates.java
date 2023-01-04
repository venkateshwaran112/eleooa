package com.pro;

import java.util.Scanner;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca = new Scanner (System.in);
		System.out.println("Enter the array size");
		int n=sca.nextInt();
		int[]a= new int[n];
		
		
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++) {
		a[i] = sca.nextInt();
		}
		System.out.println("Original array");
		for(int i=0;i<n;i++) {
		System.out.print(a[i]);
		}
		System.out.println("Duplicate free array");
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(a[i]+" ");
			}
					
	}
		
	}
}

