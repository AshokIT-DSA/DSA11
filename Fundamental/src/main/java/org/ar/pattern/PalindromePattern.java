package org.ar.pattern;


import java.util.Scanner;
//A
//ABa
//ABCba
//ABCDcba
//ABCDEdcba
public class PalindromePattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int r=1;r<=n;r++) {
		//System.out.println(r);
		char ch='A';
		for(int c=1;c<=r;c++) {
			System.out.print(ch+" ");
			ch++;
		}
		//System.out.println("\n"+ch+" after the loop");
			ch--;	
		for(int c=1;c<=r-1;c++) {
			System.out.print(--ch+" ");
		}
		System.out.println();
	}
	
}
}
