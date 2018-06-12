package practise.stack;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

	public static void infixToPostfix(String infix) {
		
		Stack<Character> s = new Stack<Character>();
		
		for(int i=0;i<infix.length();++i)
		{
			if(infix.charAt(i)!='^' && infix.charAt(i)!='+' 
					&& infix.charAt(i)!='-' && infix.charAt(i)!='*' 
					&& infix.charAt(i)!='/' && infix.charAt(i)!='(' 
					&& infix.charAt(i)!=')')
			{
				System.out.print(infix.charAt(i));
			}
			else
			{
				if(s.isEmpty() || infix.charAt(i)=='(') {
					//System.out.println("1. Pushing = " + infix.charAt(i));
					s.push(infix.charAt(i));
				}
				else
				{
					int p=priority(infix.charAt(i));
					if(s.peek()=='(') {
						//System.out.println("4. Pushing = " + infix.charAt(i));
						if(infix.charAt(i)!=')')s.push(infix.charAt(i));
						else s.pop();
					}
					else if(infix.charAt(i)==')') 
					{
						while(s.peek()!='(')System.out.print(s.pop());
						s.pop();
					}
					else if(p>priority(s.peek())) {
						//System.out.println("3. Pushing = " + infix.charAt(i));
						s.push(infix.charAt(i));   //returns true if charAt(i)>=s.peek()
					}
					else
					{
						while(!s.isEmpty() && p<=priority(s.peek()))
						{
							System.out.print(s.pop());
						}
						//System.out.println("2. Pushing = " + infix.charAt(i));
						s.push(infix.charAt(i));
					}
				}
			}
		}
		while(!s.isEmpty())System.out.print(s.pop());
		
	}
	
	

	public static int priority(char sym) {
		if(sym=='^')return 5;
		if(sym=='*' || sym =='/')return 4;
		if(sym=='+' || sym=='-')return 3;
		else return 0;
	}



	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			String infix =s.next();
			infixToPostfix(infix);
			System.out.println();
		}
		
		//String infix = "a+b*(c^d-e)^(f+g*h)-i";
		s.close();
	}
	/*1
	(a-(b^c))+(d)*/
	

}
