package interviews;

// Java program to find given two array
// are equal or not
import java.io.*;
import java.util.*;

public class FindIfArrayEquals {


	// Returns true if arr1[0..n-1] and arr2[0..m-1]
	// contain same elements.
	public static boolean areEqual(int arr1[],
								int arr2[])
	{
		
		// Length of the two array
		int n = arr1.length;
		int m = arr2.length;
		
		// If lengths of arrays are not equal
		if (n != m)
			return false;
			
		// To store xor of both arrays
		int b1 = arr1[0];
		int b2 = arr2[0];
		
		// Find xor of each elements in array
		for(int i = 1; i < n; i++)
		{
			b1 ^= arr1[i];
		}
		for(int i = 1; i < m; i++)
		{
			b2 ^= arr2[i];
		}
		int all_xor = b1 ^ b2;
		
		// If xor is zero means they are
		// equal (5^5=0)
		if (all_xor == 0)
			return true;
			
		// If all elements were not same,
		// then xor will not be zero
		return false;
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr1[] = { 3, 5, 2, 5, 2 };
		int arr2[] = { 2, 3, 8, 8, 2 };
		
		// Function call
		if (areEqual(arr1, arr2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	}

	// This code is contributed by sayantanbose2001

