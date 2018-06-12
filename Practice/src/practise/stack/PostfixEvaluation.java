package practise.stack;
import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {

	public static int postfixEvaluation(String postfix) {
		Stack<Integer> operand = new Stack<Integer>();
		int result=0;
		for(int i=0;i<postfix.length();++i)
		{
			if(isDigit(postfix.charAt(i)))
			{
				operand.push(postfix.charAt(i)-'0');
			}
			else
			{
				
				int opnd2=operand.pop();
				int opnd1=operand.pop();
				result=evaluate(opnd1,opnd2,postfix.charAt(i));
				operand.push(result);
			}
		}
		return operand.pop();
	}
	
	private static boolean isDigit(char ch) {
		return Character.isDigit(ch);
	}

	public static int evaluate(int opnd1, int opnd2, char sym) {
		if(sym=='^')return opnd1^opnd2;
		if(sym=='*')return opnd1*opnd2;
		if(sym =='/')return opnd1/opnd2;
		if(sym =='+')return opnd1+opnd2;
		if(sym=='-')return opnd1-opnd2;
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			System.out.println(postfixEvaluation(in.next()));
		}
		in.close();
	}
}
