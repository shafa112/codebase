package shebipracques;

public class StringQues {
	
	public static void main(String[] args) {
		String str = "abcdef";
		
		print(str);
		System.out.println();
		printReverse(str);
		System.out.println();
		//System.out.println(str.length());
		//PrintreverseString(str,0);
		String s=reverseString(str, 0);
		System.out.println(s);
	}

	public static void print(String str) {
		print1(str,0);
	}

	public static void print1(String str, int i) {
		if(i==str.length())return;
		System.out.print(str.charAt(i));
		print1(str,i+1);
		
	}

	public static void printReverse(String str) {
		printReverse1(str,str.length()-1);
		
	}

	public static void printReverse1(String str, int i) {
		if(i<0)return;
		System.out.print(str.charAt(i));
		printReverse1(str, i-1);
		
	}

	public static void PrintreverseString(String str,int i) {
		if(i==str.length()-1)
		{
			System.out.print(str.charAt(i));
			return;
		}
		PrintreverseString(str, i+1);
		System.out.print(str.charAt(i));
		
	}
	
	public static String reverseString(String str,int index)
	{
		if(index==str.length())return "";
		return reverseString(str, index+1)+str.charAt(index);
	}

}
