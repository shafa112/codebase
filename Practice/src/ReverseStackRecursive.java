import java.util.Stack;

public class ReverseStackRecursive {
	
	public static void reverseStack(Stack<Integer> s) {
		if(s.isEmpty())return;
		int p=s.pop();
		reverseStack(s);
		insertAtbottom(s,p);
		
	}
	
	public static void insertAtbottom(Stack<Integer> s, int p) {
		if(s.isEmpty()) {
			s.push(p);
			return;
		}
		int p1=s.pop();
		insertAtbottom(s,p);
		s.push(p1);
		
	}


	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		int key[] = {4,3,2,1};
		for(int val :key)s.push(val);
		System.out.println(s);
		reverseStack(s);
		System.out.println(s);
	
		
	}

	
	

}
