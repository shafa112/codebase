package datastructure.tree;

public class BinaryTree {
	Node root;
	
	public static void main(String[] args) {
		
		BinaryTree b = new BinaryTree();
		b.buildTree();
		System.out.println("Preorder");
		b.preorderTraversal(b.root);
		System.out.println("\n\nInorder");
		b.inorderTraversal(b.root);
		System.out.println("\n\nPostorder");
		b.postorderTraversal(b.root);
		System.out.println();
		System.out.println(b.search(b.root,60));
	}

	public int search(Node root,int key) {
			if(root==null)return -1;
			if(root.data==key)return key;
			int lsearch=search(root.left, key);
			int rsearch=search(root.right, key);
			if(lsearch!=-1)return lsearch;
			else return rsearch;
	}

	public void postorderTraversal(Node root) {
		
		if(root==null)return;
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.data+" ");
		
	}

	public void inorderTraversal(Node root) {
		
		if(root==null)return;
		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);
		
	}

	public void preorderTraversal(Node root) {
		if(root==null)return;
		System.out.print(root.data+" ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		
	}

	public void buildTree() {
		root = new Node(20);
		Node lnode = new Node(28);
		Node rnode = new Node(30);
		root.left=lnode;
		root.right=rnode;
		lnode.left=new Node(10);
		lnode.right=new Node(5);
		rnode.right=new Node(50);
		
	}
	
	public void deleteNode()
	{
		
	}

}
