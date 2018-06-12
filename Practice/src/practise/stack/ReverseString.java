package practise.stack;


import java.util.Stack;

public class ReverseString {
	
	public static void reverseString(String str) {
		Stack<Character> s = new Stack<Character>();
		int i=0;
		while(i<str.length()) {
			s.push(str.charAt(i));
			++i;
		}
		while(!s.isEmpty())System.out.print(s.pop());
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		String str = "abc";
		reverseString(str);
	}

	
}
