package org.ar.math;

public class SumOfADigit {
  public static void main(String[] args) {
	   long n=123;
	   long sum=digit(n);
	 //  System.out.println(sum);
	   String m="123";
	   long sum1=digitStringSum(m);
	   System.out.println("final ans"+sum1);
}

private static long digitStringSum(String m) {
	// TODO Auto-generated method stub
	long sum=0;
	for(int i=0;i<m.length();i++) {
		char ch=m.charAt(i);
		//'1' is different 1
		//1--49-48
		//2--50-48
		//3--51-48
		sum=sum+ch-48;
		System.out.println("char "+ch);
		System.out.println(sum);
	}
	return sum;
}

private static long digit(long n) {
	// TODO Auto-generated method stub
	long sum=0;
	while(n>0) {
		long r=n%10;
		n=n/10;
		sum=sum+r;
		//System.out.println("r "+r);
		//System.out.println("sum "+sum);
		//System.out.println("n value "+n);
		//System.out.println();
	}
		
	return sum;
}
}
