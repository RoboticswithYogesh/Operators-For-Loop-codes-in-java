import java.util.*;
public class Solution {


	

	static int fib(int n)
	{
	if (n <= 1)
	return n;
	return fib(n-1) + fib(n-2);
	}
	
	public static void main (String args[])
	{
	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
	System.out.println(fib(n));
	}

/* This code is contributed by Rajat Mishra */

	}


