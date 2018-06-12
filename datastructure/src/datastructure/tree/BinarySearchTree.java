package datastructure.tree;

public class BinarySearchTree extends BinaryTree{
	
	Node root;
	
	public Node searchIterative(int key)
	{
		Node ptr = root;
		while(ptr!=null)
		{
			if(key==ptr.data)return ptr;
			else if(key<ptr.data)ptr=ptr.left;
			else ptr=ptr.right;
		}
		return null;
	}
	
	public Node search(Node root,int key) {
		if(root==null)return null;
		if(root.data==key)return root;
		if(root.data>key)return search(root.left, key);
		else return search(root.right, key);
	}

	public void insertIterative(int data)
	{
		if(root==null)
		{
			root= new Node(data);
		}
		else
		{
			boolean isInserted = false;
			Node ptr = root;
			while(!isInserted)
			{
				if(data==ptr.data) {
					ptr.count++;
					isInserted=true;
				}
				else if(data<ptr.data)
				{
					if(ptr.left==null) {
						ptr.left= new Node(data);
						isInserted=true;
					}
					else ptr=ptr.left;
				}
				else 
				{
					if(ptr.right==null) {
						ptr.right=new Node(data);
						isInserted=true;
					}
					else ptr=ptr.right;
				}
			}
		}
	}
	
	public void insert(int key) {
		if(root==null) {
			root = new Node(key);
		}
		else insert(root, key);
	}
	
	private void insert(Node node, int key) {
		if(key == node.data) {
			node.count++;
		}
		else if(key<node.data) {
			if(node.left == null) {
				node.left = new Node(key);
			}
			else insert(node.left, key);
		}
		else if(key>node.data) {
			if(node.right == null) {
				node.right = new Node(key);
			}
			else insert(node.right, key);
		}
		
	}
	
	public void deleteNode(int key)
	{
		Node ptr=root;
		Node ptrprev=root;
		boolean isDeleted=false;
		while(!isDeleted && ptr!=null)
		{
			if(key==ptr.data)
			{
				if(ptr.left!=null)
				{
					Node t = ptr.left;
					Node prev=ptr;
					while(t.right!=null) 
					{
						prev=t;
						t=t.right;
					}
					if(prev==ptr) prev.left = t.left;
					else prev.right=t.left;
					t.right = ptr.right;
					t.left = ptr.left;
					
					if(root == ptr) root = t;
					if(ptrprev.right == ptr) ptrprev.right = t;
					else ptrprev.left = t;
				}
				else
				{
					if(root == ptr) root = root.right;
					if(ptrprev.left==ptr)ptrprev.left=ptr.right;
					else ptrprev.right=ptr.right;
						
				}
				isDeleted = true;
			}
			else if(key<ptr.data)
			{
				ptrprev=ptr;
				ptr=ptr.left;
			}
			else 
			{
				ptrprev=ptr;
				ptr=ptr.right;
			}
		}
	}
	
	//gives count of elements greater than key
	public int greaterCount(int key)
	{
		int count=0;
		Node ptr=root;
		boolean found=false;
		while(!found)
		{
			if(key==ptr.data) {
				count+=nodeCount(ptr.right);
				found=true;
			}
			else if(key<ptr.data)
			{
				count+=1+nodeCount(ptr.right);
				ptr=ptr.left;
			}
			else
			{
				ptr=ptr.right;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		//int key[] = {50,30,20,40,45,70,60,80};
		int key[] = {8,3,1,6,7,4,10,14,13};
		for(int k:key)b.insert(k);
		
		b.inorderTraversal(b.root);
		System.out.println();
		b.preorderTraversal(b.root);
		System.out.println();
		
		//for(int k:key)b.deleteNode(k);
		
		Node node = b.searchIterative(50);
		if(node!=null)System.out.println(node);
		else System.out.println("not found");
		
		System.out.println("Done");
		System.out.println(b.greaterCount(1));
		
		
	}


}
