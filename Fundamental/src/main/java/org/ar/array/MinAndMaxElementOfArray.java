package org.ar.array;

public class MinAndMaxElementOfArray {
	public static void main(String[] args) throws Exception {
              int ar[]= {-1,-2,-3,-10,-9};
              int max=findMax(ar,5);
              System.out.println(max);
	}

	private static int findMax(int[] ar, int n) {
		// TODO Auto-generated method stub
		int max=ar[0];
		for(int i=1;i<n;i++) {
			if(max<ar[i])
				max=ar[i];
		}
		return max;
	}
}
