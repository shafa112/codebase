package practise.array;

import java.util.Scanner;

public class MaximumSubArraySum {
	
	//Kadane Algorithm 1-d array
	public static int largestContiguosSum(int[] a) {
		int max=a[0];
		int currentMax=max;
		for(int i=1;i<a.length;i++) 
		{
			currentMax = Math.max(currentMax+a[i], a[i]);
			max = Math.max(max, currentMax);
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		
		/*int[] a ={-2, -3, 4, -1, -2, 1, 5, -3};
		int max=largestContiguosSum(a);
		System.out.println(max);*/
		
		
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int[] a = new int[s.nextInt()];
			for(int i=0;i<a.length;++i)a[i]=s.nextInt();
			int max=largestContiguosSum(a);
			System.out.println(max);
		}
		s.close();
	}

}
