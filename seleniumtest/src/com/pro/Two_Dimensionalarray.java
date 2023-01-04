package com.pro;

import java.util.Scanner;

public class Two_Dimensionalarray {
public static void main(String[] args) {
	
//	int a[][]=new int[3][3];
//	System.out.println("Enter the elements");
//	for(int i=0;i<3;i++) {
//		for(int j=0;j<3;j++) {
//		    Scanner sc= new Scanner(System.in);
//		    a[i][j]=sc.nextInt();	
//		}
//	}
//for(int i=0;i<3;i++) {
//	for(int j=0;j<3;j++) {
//		System.out.print(a[i][j] +" ");
//		
//	}
//	System.out.println();
//}
//System.out.println("Enter the cell you want to display");
//Scanner s = new Scanner(System.in);
//int c=s.nextInt();
//int d=s.nextInt();
//for(int i=0;i<3;i++) {
//		if(i==c) {
//		System.out.println(a[i][d] +" ");
//		c++;
//		}
	
	
	// Finding the square root of a number
System.out.println("Enter the number to find square root");	
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(int i=1;i<=n/2;i++)
{
	if(i*i==n) {
		System.out.println("The Square root of the number is" +i);
		++count;
	}
}
	if(count==0) {
		System.out.println("The given number doesnt have square root");

	}}}
