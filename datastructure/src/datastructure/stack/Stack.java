package datastructure.stack;

public class Stack {
	
	int[] stack = new int[5];
	int top=-1;
	int size;
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(20);
		s.push(27);
		s.push(100);
		s.push(19);
		s.push(28);
		s.push(10);
		s.display();
		s.peek();
		s.pop();
		s.peek();
		s.display();
		
	}
	public void display()
	{
		for(int i=0;i<stack.length;++i)
			System.out.print(stack[i]+" ");
		System.out.println();
		
	}
	
	public void push(int i) {
		
		if(top+1>=5) {
			System.out.println("Stack full");
			return;
		}
		stack[++top]=i;
	}
	
	public int pop()
	{
		if(isEmpty()!=-1)
		{
			int poppedlement=stack[top];
			--top;
			return poppedlement;
		}
		else 
		{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public int isEmpty()
	{
		if(top==-1)return 1;
		return 0;
	}
	
	public void peek()
	{
		if(isEmpty()!=-1)System.out.println(stack[top]);
		else System.out.println("Stack is empty");
	}

}
