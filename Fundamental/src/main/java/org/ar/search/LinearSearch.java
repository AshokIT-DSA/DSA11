package org.ar.search;

public class LinearSearch {
public static void main(String[] args) {
	int ar[]= {-11,-4,10,15,17,20,25,30,35};
	//boolean res=ls(ar,6,0);
	boolean res1=lsForSortedArray(ar,9,715);
	System.out.println(res1);
}

private static boolean lsForSortedArray(int[] ar, int n, int key) {
	// TODO Auto-generated method stub
	
	
	//O(n)
	
	for(int i=0;i<n;i++) {
		if(ar[i]==key)
			return true;
	}
	
	return false;
	
}

private static boolean ls(int[] ar, int n,int key) {
	// TODO Auto-generated method stub
	for(int i=0;i<n;i++) {
		if(ar[i]==key)
			return true;
			
	}
	System.out.println("key not found");
	return false;
}
}
