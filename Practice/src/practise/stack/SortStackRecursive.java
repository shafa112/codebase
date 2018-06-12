package practise.stack;
import java.util.Stack;

public class SortStackRecursive {

	
	
	public static void sortStack(Stack<Integer> s) {
		if(s.isEmpty())return;
		int p=s.pop();
		sortStack(s);
		insertInPlace(s,p);
	}
	
	public static void insertInPlace(Stack<Integer> s, int key) {
		
		if(s.isEmpty())s.push(key);
		else
		{
			if(key<s.peek())
			{
				int p =s.pop();
				insertInPlace(s, key);
				s.push(p);
			}
			else s.push(key);
		}
		
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		int key[] = {5,2,3,1,0};
		for(int val :key)s.push(val);
		System.out.println(s);
		sortStack(s);
		System.out.println(s);
	}

	
}
