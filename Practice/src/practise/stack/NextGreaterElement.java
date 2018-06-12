package practise.stack;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

	public static int[] nextGreaterElement(int[] a) {

		int[] ans = new int[a.length];
		Stack<Integer> s = new Stack<Integer>();
		
		for (int i = a.length - 1; i >= 0; --i) 
		{
			while (!s.isEmpty() && a[i] >= s.peek())	s.pop();
			
			if (s.isEmpty())ans[i] = -1;
			else ans[i] = s.peek();
			
			s.push(a[i]);
		}
		return ans;
		
	}
	
     //12 12 13 5 5 13 -1 -1 
	public static void main(String[] args) {

		/*int[] a = { 5, 1, 12, 3, 2, 5, 13, 10 };
		int[] ans = new int[a.length];
		ans = nextGreaterElement(a);
		Util.printArray(ans);*/
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-->0) {
			int n = in.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)a[i]=in.nextInt();
			int ans[] = nextGreaterElement(a);
			for(int i=0;i<n;i++)System.out.print(ans[i]+" ");
			System.out.println();
		}
		in.close();
	}

}
