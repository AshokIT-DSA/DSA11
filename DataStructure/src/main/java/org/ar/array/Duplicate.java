package org.ar.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	

	int n=sc.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<n;i++)
		 ar[i]=sc.nextInt();
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		Integer key=ar[i];
		key.hashCode();
            int c=0;		
		for(int j=i+1;j<n;j++) {
			if(ar[j]==key)
				c++;
		}
		
		//1000
		//1000
		//1
		//1
		//1
		if(c>0) {
			boolean flag=true;
			for(int k=0;k<al.size();k++) {
				
				//==compare obj
				//-128 to 127 there is integer pooling  ->FOr 1 its true
				//but for 1000 it yields false
				
				if(al.get(k)==key) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
			//System.out.println(key);
			al.add(key);
			}
		}
	}
	
}
}
