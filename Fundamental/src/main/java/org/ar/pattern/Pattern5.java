package org.ar.pattern;

import java.util.Scanner;

public class Pattern5 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 //***1
	 //**12
	 for(int r=1;r<=n;r++) {
		 
		 for(int wb=1;wb<=n-r;wb++) {
			 System.out.print("*");
		 }
		 for(int c=1;c<=r;c++) {
			 System.out.print(c);
		 }
		 System.out.println();
	 }
}
}
