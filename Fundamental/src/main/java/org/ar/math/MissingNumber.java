package org.ar.math;

public class MissingNumber {
public static void main(String[] args) {
	int ar[]=new int[] {1,2,6,7,8,9,10,4,3};
	int res=m1(ar);
	System.out.println(res);
}

private static int m1(int[] ar) {
	
	for(int num=1;num<=10;num++) {
		boolean flag=false;
	for(int i=0;i<9;i++) {
		//System.out.println();
		if(ar[i]==num) {
			flag=true;
			break;
		}
	}
	if(flag==false)
		return num;
	}
	

	

	return 0;
}
}
