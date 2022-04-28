package com.cg.assignment;

public class NoOfPossiblePath {

	static int Paths(int m, int n)
    {
        if (m == 1 || n == 1)
            return 1;
 
        
        return Paths(m - 1, n) + Paths(m, n - 1);
        
    }
	public static void main(String[] args) {
		int m=3,n=3;
		System.out.println(Paths(m,n));


	}

}
