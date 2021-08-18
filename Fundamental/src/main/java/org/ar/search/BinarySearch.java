package org.ar.search;

public class BinarySearch {
public static void main(String[] args) {
	          //0   1  2  3  4  5  6 7  8
	int ar[]= {-11,-4,10,15,17,20,25,30,35};
	int size=ar.length-1;
	int key=-10;
	boolean flag=bs(ar,size,key);
}

private static boolean bs(int[] ar, int n, int key) {
	// TODO Auto-generated method stub
	int lo=0;
    int hi=ar.length-1;//3
    while(lo<=hi) {
    	int mid=(lo+hi)/2;//1
    	System.out.println(lo+" "+hi+" "+ar[mid]);
    	if(ar[mid]>key) {
    		hi=mid-1;
    	}
    	else if(ar[mid]<key) {
    		lo=mid+1;
    	}
    	else {
    		return true;
    	}
    }
    System.out.println("after while"+lo+" "+hi);
	return false;
}
}
