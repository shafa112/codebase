package practise.number;
import java.math.BigInteger;

import algo.util.Util;

public class Fibonacci {

	
	//using recursion
	static BigInteger fib(int n) {
		if (n <= 1)
			return BigInteger.valueOf(n);
		else
			return fib(n - 1).add(fib(n - 2));
	}
	
	static void fibIterative(int n,BigInteger[] f)
	{
		f[0]=BigInteger.valueOf(0);
		f[1]=BigInteger.valueOf(1);
		for(int i=2;i<=n;++i)
		{
			BigInteger t = f[i-1].add(f[i-2]);
			f[i]=t;
		}
	}

	public static void main(String args[]) {
		
		int n = 1000;
		//for(int i=0;i<=n;++i)
		{
			System.out.print(fib(1000)+" ");
		}
		System.out.println();
		//BigInteger[] f = new BigInteger[n+1];
		//fibIterative(n, f);
		//Util.printArray(f);
	}
}
