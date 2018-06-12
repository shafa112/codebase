package practise.stack;
import java.util.Stack;

public class SortStackIterative {
	
	public static Stack<Integer> sortStack(Stack<Integer> s1) {
		Stack<Integer> s2 = new Stack<Integer>();

		if (!s1.isEmpty()) 	s2.push(s1.pop());
		while (!s1.isEmpty()) 
		{
			if (s1.peek() > s2.peek()) s2.push(s1.pop());
			else
			{
				int p = s1.pop();
				while (!s2.isEmpty() && p < s2.peek())
				{
					s1.push(s2.pop());
				}
				s2.push(p);
			}
		}
		return s2;
	}

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		int key[] = { 5, 2, 3, 1, 0 };
		for (int val : key)
			s1.push(val);
		System.out.println(s1);
		s1= sortStack(s1);
		System.out.println(s1);
	}

}
