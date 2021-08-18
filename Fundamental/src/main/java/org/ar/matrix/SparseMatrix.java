package org.ar.matrix;

import java.util.Scanner;

public class SparseMatrix {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int totalElement=r*c;
		int mat[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int zero=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(mat[i][j]==0)
					zero++;
			}
		}
		int nonZero=totalElement-zero;
		if(zero>nonZero)
			System.out.println("YES");
		else
			System.out.println("NO");
        		 
	}
}
