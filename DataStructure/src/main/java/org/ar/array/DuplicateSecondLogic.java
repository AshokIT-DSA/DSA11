package org.ar.array;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateSecondLogic {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    		

    		int n=sc.nextInt();
    		int ar[]=new int[n];
    		for(int i=0;i<n;i++)
    			 ar[i]=sc.nextInt();
    		for(int i=0;i<n;i++) {
    			int key=ar[i];
    			
    	            int c=0;	
    	           // System.out.println(Arrays.toString(ar));
    			for(int j=i+1;j<n;j++) {
    				if(ar[j]==key) {
    					c++;
    					ar[j]=-1;
    				}
    			}
				
				 if(c>0) 
					 System.out.println(key);
				 
    			
    		
    			//System.out.println(Arrays.toString(ar));
    		}
	}
}
