package org.ar.math;

public class ArmstrongNumber {
	public static void main(String[] args) {
		 int n=21;
		 boolean flag=arm(n);
		 if(flag==true)
			 System.out.println("Yes");
		 else
			 System.out.println("No");
	}

private static boolean arm(int n) {
	// TODO Auto-generated method stub
	
	int sum=0;
	int temp=n;
	while(n!=0) {
		System.out.println("N before modification "+n);
		int r=n%10;
		n=n/10;
		sum=sum+(r*r*r);
		System.out.println("last digit "+r);
		System.out.println("number "+n);
		System.out.println("sum "+sum);
	}
	if(sum==temp)
		return true;
	else
	return false;
}
}
