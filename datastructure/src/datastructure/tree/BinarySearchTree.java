package datastructure.tree;

public class BinarySearchTree {
	BSTNode root;
	
	
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.root=b.insert(b.root,50);
		b.insert(b.root, 30);
		b.insert(b.root, 20);
		b.insert(b.root, 40);
		b.insert(b.root, 70);
		b.insert(b.root, 60);
		b.insert(b.root, 80);
		b.inorderTraversal(b.root);
		System.out.println();
		System.out.println(b.search(b.root,25));
		
	}

	public int search(BSTNode root,int key) {
		if(root==null)return -1;
		if(root.data==key)return key;
		if(root.data>key)return search(root.left, key);
		else return search(root.right, key);
	}

	public BSTNode insert(BSTNode root,int i) {
		if(root==null)
		{
			root=new BSTNode(i);
		}
		else if(i==root.data)
		{
			++root.count;
			
		}
		else if(i<root.data)
		{
			root.left=insert(root.left, i);
		}
		
		else
		{
			root.right=insert(root.right, i);
		}
		return root;
		
	}
	
	public void inorderTraversal(BSTNode root) {
		
		if(root==null)return;
		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);
	}

}
