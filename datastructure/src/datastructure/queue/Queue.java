package datastructure.queue;

public class Queue {
	
	int[] queue = new int[5];
	int rear=-1;
	int front=-1;
	
	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		//q.enque(60); q full
		q.display();
		System.out.println(q.dequeue());
		q.display();
		System.out.println(q.peek());
		
		
	}

	public void display()
	{
		if(isEmpty()==0)
		{
			for(int i=front;i<=rear;++i)
			{
				System.out.print(queue[i]+" ");
			}
		}
		System.out.println();
	}
	
	public void enque(int i) {
		
		if(isFull()==1)
		{
			System.out.println("Queue is full");
			return;
		}
		if(rear==-1 && front==-1)
		{
			queue[++rear]=i;
			++front;
		}
		else
		{
			queue[++rear]=i;
		}
			
		
	}
	
	public int isEmpty()
	{
		if(rear==-1)return 1;
		return 0;
	}
	
	public int dequeue()
	{
		if(isEmpty()==0)
		{
			int deletedelement = queue[front];
			if(front==rear)
			{
				front=rear=-1;
			}
			else
				front=front+1;
			return deletedelement;
		}
		else
		{
			System.out.println("Queue is empty");
			return -1;
		}
	}
	
	public int peek()
	{
		if(isEmpty()==0)return queue[front];
		else
		{
			System.out.println("queue is empty");
			return -1;
		}
	}
	
	public int isFull()
	{
		if(rear+1>=5)return 1;
		else return 0;
	}
	

}
