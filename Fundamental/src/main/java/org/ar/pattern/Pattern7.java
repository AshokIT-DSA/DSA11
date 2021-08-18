package org.ar.pattern;

import java.util.HashSet;
import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
			/*
			 * 1 23 456 78910
			 */
             int count=1;
		 for(int r=1;r<=n;r++) {
			 
			
			 for(int c=1;c<=r;c++) {
				 System.out.print(count+" ");
				 count++;
			 }
			 System.out.println();
		 }    
	} 
}
