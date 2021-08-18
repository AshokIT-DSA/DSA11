package org.ar.recursion;

public class Test {
public static void main(String[] args) {
	int a=10;
	m1(a-1);
	System.out.println(a+" main");
}

private static void m1(int a) {
	// TODO Auto-generated method stub
	a=a*10;
	System.out.println(a);
		
}
}
