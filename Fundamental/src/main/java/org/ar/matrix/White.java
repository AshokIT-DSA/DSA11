package org.ar.matrix;



class ColorException extends Exception{
	
}
class WhiteException extends ColorException{
	
}
abstract class Color{
	abstract void m1()throws ColorException;
}
public class White extends Color{

	@Override
	void m1() throws WhiteException {
		// TODO Auto-generated method stub
		throw new WhiteException();
	}
	public static void main(String[] args) {
		White white=new White();
		int a,b,c;
		a=b=c=0;
		try {
			white.m1();
			a++;
		}
		catch(WhiteException e) {
			b++;
		}
		finally {
			c++;
		}
		System.out.println(a+" "+b+" "+c);
	}
	
	
}
class Test11 {


 
  
  public static void main(String[] args) {
	String s1="sun";
	String s2="java";
	s1.concat(s2);
	System.out.println(s1);
	}
}

