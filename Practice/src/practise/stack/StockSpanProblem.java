package practise.stack;
// i/p-- 5 10 2 4 7 8 2
// o/p--1 2 1 2 3 4 1



import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblem {

	public static int[] stockSpan(int[] a) 
	{
		int[] ans = new int[a.length];
		ans[0]=1;
		int count = 0;
		for(int i=1;i<a.length;++i)
		{
			count=0;
			if(a[i]<a[i-1])ans[i]=1;
			else
			{
				count=1+ans[i-1];
				int j=i-1-ans[i-1];
				while(j>=0 && a[i]>=a[j]) {
					count+=ans[j];
					j=j-ans[j];
				}
				ans[i]=count;
			}
		}
		return ans;
	}
	
	public static int[] stockSpanUsingStack(int[] a) {
		Stack<Integer> s = new Stack<Integer>();
		int[] ans = new int[a.length];
		int i=0;
		Arrays.fill(a, 1);
		int n = a.length;
		
		s.push(n-1);
		i=n-2;
		
		while (i >= 0) {
			while (!s.isEmpty() && a[s.peek()] < a[i])
			{
				int p = s.pop();
				if (!s.isEmpty())ans[s.peek()] += ans[p];
			}
			s.push(i);
			--i;
		}

		while(!s.isEmpty())
		{
			int p = s.pop();
			if(!s.isEmpty())ans[s.peek()] += ans[p];
		}
		
		return ans;
	}
	
	//shady solution
	public static int[] findMaxSpan(int[] a) {
	    int n = a.length;
	    int span[] = new int[n];
	    Stack<Integer> s = new Stack<>();
	    for(int j = 0; j < n ;j++){
	    	span[j]=1;
	    	while(!s.isEmpty() && a[s.peek()] <= a[j]){
	    		span[j]+=span[s.pop()];
	    	}
	    	s.push(j);
	    }
	    return span;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-->0) {
			int n = in.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)a[i]=in.nextInt();
			int ans[] = stockSpan(a);
			for(int i=0;i<n;i++)System.out.print(ans[i]+" ");
			System.out.println();
		}
		in.close();
	}
}
