package com.java.programs;

//Java implementation of the approach
class GFG
{
	static final int MOD = (int)1e9 + 7;
	
	// Function to return (x^y) % MOD
	// in O(log(y))
	static long power(long x,
					long y)
	{
		long res = 1;
		while (y > 0)
		{   long temp = y &1;
			System.out.println("y "+ y +  " y & 1: " + temp);
			if ((y & 1) != 0)
				res = (res * x) % MOD;
			x = (x * x) % MOD;
			y /= 2;
		}
		return res;
	}
	
	// Function to return the count of distinct
	// graphs possible with n vertices
	static long countGraphs(int n)
	{
	
		// Maximum number of edges for a
		// graph with n vertices
		long x = n * (n - 1) / 2;
		System.out.println("total graphs:" + x);
		// Function to calculate
		// (2^x) % mod
		return power(2, x);
	}
	
	// Driver code
	public static void main (String[] args)
	{
		int n = 3;
		Long result = (countGraphs(n));
		System.out.println(Integer.parseInt(result.toString()));
	}
}

//This code is contributed by AnkitRai01
