package practise.array;

import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		
		while(t-->0)
		{
			int[] a = new int[s.nextInt()-1];
			int n1=sum(a.length+1);
			int sum=0;
			for(int i=0;i<a.length;++i)sum+=s.nextInt();
			System.out.println(n1-sum);
		}
		s.close();
	}

	private static int sum(int n) {
		int sum=0;
		for(int i=1;i<=n;++i)
		{
			sum+=i;
		}
		return sum;
	}
}
