package datastructure.linkedlist;
/*
 * Insert at start,end and position
 * Delete at start,end and position
 * Traverse
 * hasCylce
 * nthNOdeFromEnd
 * getMid
 * 
 */

public class LinkedList{
	
	Node head;
	Node tail;
	int size;
	
	public void insertAtEnd(int data)
	{
		if(head==null)
		{
			head = new Node(data);
			tail = head;
		}
		else
		{
			tail.next = new Node(data);
			tail = tail.next;
		}
		++size;
	}
	
	public void insertAtStart(int data)
	{
		Node temp = new Node(data);
		if(head == null)
		{
			temp.next = head;
			head = temp;
			tail = head;
		}
		else
		{
			temp.next = head;
			head = temp;
		}
		++size;
	}
	
	public void insertAtPosition(int position,int data)
	{
		
		if(position == 1) {
			insertAtStart(data);
		}else if(position == size+1) {
			insertAtEnd(data);
		}else if(position>size+1) {
			System.out.println("postion greater than linkedlist size+1");
		}else {
			int step = position-2;
			Node temp = head;
			while(step>0) {
				temp = temp.next;
				step--;
			}
			Node newNode = new Node(data);
			newNode.next = temp.next;
			temp.next = newNode;
			++size;
		}
	}
	
	/*public void reverse()
	{
		Node temp=r(head);
		temp.next=null;
		head=tail;
		tail=temp;
		
		
		//for displaying
		temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
		
	}
	public Node r(Node head) {
		
		if(head.next==null)return head;
		else
		{
			Node temp=r(head.next);
			temp.next=head;
			return temp.next;
		}
		
	}*/
	
	public Node reverseRecursive(Node head)
	{
		if(head.next==null)return head;
		Node head1=reverseRecursive(head.next);
		head.next.next=head;
		head.next=null;
		return head1;
	}

	public void display() {
		
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void deleteAtStart()
	{
		if(size==0) {
			System.out.println("LinkedList is already empty");
			return;
		}else if(size==1) {
			head = null;
			tail = null;
		}
		else {
			head = head.next;
		}
		--size;
	}
	
	public void deleteAtpostion(int position)
	{
		if(position==1)
		{
			deleteAtStart();
		}
		else if(position == size)
		{
			deleteAtEnd();
		}
		else if(position > size)
		{
			System.out.println("Cannot delete");
		}
		else
		{
			Node curr = head;
			int step = position - 2;
			while(step>0)
			{
				curr = curr.next;
				--step;
			}
			curr.next = curr.next.next;
			--size;
		}
	}
	
	public void deleteAtEnd()
	{
		if(size==1)
		{
			head = null;
			tail = null;
		}
		else if(size == 0)
		{
			System.out.println("LinkedList is empty!");
			return;
		}
		else
		{
			Node temp = head;
			while(temp.next!=tail)
			{
				temp = temp.next;
			}
			tail = temp;
			temp.next = null;
		}
		--size;
	}
	
	public void reverseRightHalf(Node head,int size)
	{
		size=size/2+1;
		Node prev=null;
		while(size>1)
		{
			prev=head;
			head=head.next;
			--size;
		}
		
		prev.next=null;
		System.out.println(prev.data);
		System.out.println(head.data);
		Node t =reverseIterative(head);
		prev.next=t;
	}
	
	public Node reverseIterative(Node head) {
		if(head==null)return null;
		Node prev=null;
		Node next=null;
		Node curr=head;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
		
	}

	public void kthNodeFromEnd(int position)
	{
		/*//Without using size of LinkedList
		int step = 0;
		Node kthnode=head;
		Node temp = head;
		while(temp!=null)
		{
			++step;
			if(position-step<0)
			{
				kthnode = kthnode.next;
			}
			temp = temp.next;
		}
		System.out.println(kthnode.data);*/
		
		if(position>size)
		{
			System.out.println("position greater tha ll size");
			return;
		}
		Node t1=head;
		Node t2 = head;
		int step=position-1;
		while(step>0 && t2!=null)
		{
			t2=t2.next;
			--step;
		}
		while(t2.next!=null)
		{
			t1=t1.next;
			t2=t2.next;
		}
		
		System.out.println(t1.data);
		
		
		
		/*
		 * 
		 * using size of LinkedList
		if(size == 0)
		{
			System.out.println("LinkedList is empty");
			return;
		}
		if(position>size)
		{
			System.out.println("position greater than size");
			return;
		}
		int step = size-position+1;
		Node temp = head;
		while(step>1) {
			temp=temp.next;
			--step;
		}
		System.out.println("nth node from end "+temp.data);*/
	}
	
	public boolean hasCycle()
	{
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast= fast.next.next;
			if(slow== fast) {
				return true;
			}
		}
		return false;
	}
	

	public static Node mid(Node head)
	{
		
		Node t1=head;
		Node t2=head;
		while(t1!=null && t1.next!=null)
		{
			t2=t2.next;
			t1=t1.next.next;
		}
		return t2;
	}
	
	public void getMid()
	{
		if(head==null)
		{
			System.out.println("LL is empty");
			return;
		}
		Node curr = head;
		Node prev = head;
		
		while(curr!=null)
		{
			if(curr.next!=null)
			{
				if(curr.next.next!=null)
				{
					prev= prev.next;
					curr=curr.next.next;
				}
				else
				{
					curr=curr.next;
				}
			}
			else
			{
				curr=curr.next;
			}
		}
		System.out.println("mid ele is "+prev.data);
		
	}
	
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.insertAtEnd(10);
		l.insertAtEnd(40);
		l.insertAtPosition(2, -1);
		l.insertAtPosition(4, 99);
		l.insertAtEnd(20);
		
		//l.insertAtPosition(6, 87);
		l.display();
		//l.deleteAtEnd();
		//l.display();
		//l.deleteAtStart();
		//l.display();
		//l.deleteAtpostion(2);
		//l.display();
		System.out.println(l.size);
		//l.kthNodeFromEnd(5);
		//l.reverse();
		//l.hasCycle();
		//l.getMid();
		//Node t = mid(l.head);
		//System.out.println(t.data);
		//l.reverseRightHalf(l.head, l.size);
		//l.display();
		//l.head=l.reverseIterative(l.head);
		//l.display();
	}

	

	
}
 
 