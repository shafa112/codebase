package practise.number;

import java.util.ArrayList;

public class DecimalToBinary {

	public static void decimalToBinary(int n) {
		
		ArrayList<Integer> al = new ArrayList<>();
		while(n/2!=0)
		{
			al.add(n%2);
			n=n/2;
		}
		al.add(n%2);
		System.out.println(al);
	}
	
	public static void main(String[] args) {
		int n=2;
		decimalToBinary(n);
		//dectobinary(n);
	}
	
	public static void dectobinary(int n)
	{
		if(n==0)return;
		dectobinary(n/2);
		System.out.print(n%2);
	}

	
}
