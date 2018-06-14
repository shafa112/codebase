package practise.stack;

import java.util.Stack;

public class QueueUsingTwoStacks {

	Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    /* The method insert to push element into the queue */
    //O(1)
    public void enqueue(int x)
    {
	   s1.push(x);
    }
	
    
    /*The method remove which return the element popped out of the queue*/
    
    //Average O(1)
    int dequeue()
    {
        int p=-1;
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())s2.push(s1.pop());
            if(!s2.isEmpty())p=s2.pop();
        }
        else p=s2.pop();
        return p;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
