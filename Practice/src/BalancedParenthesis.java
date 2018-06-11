

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {


	public static boolean isBalancedParenthesis(String exp) {

		Stack<Character> s = new Stack<Character>();

		for (int i = 0; i < exp.length(); ++i) {
			
			if (exp.charAt(i) == '[' || exp.charAt(i) == '(' || exp.charAt(i) == '{') 
			{
				s.push(exp.charAt(i));
			}
			else 
			{
				char ch;
				if (exp.charAt(i) == ']') {
					ch = '[';
				} else if (exp.charAt(i) == ')') {
					ch = '(';
				} else {
					ch = '{';
				}
				if (s.isEmpty()) return false;
				if (s.peek() != ch) return false;
				else s.pop();
			}

		}
		if(!s.isEmpty())return false;
		else return true;
	}
	

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0)
		{
			String exp = in.next();
			boolean isbalanced = isBalancedParenthesis(exp);
			if (isbalanced)
				System.out.println("balanced");
			else
				System.out.println("not balanced");
		}
		in.close();
	}

}
