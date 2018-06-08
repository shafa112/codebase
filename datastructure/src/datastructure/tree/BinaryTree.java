package datastructure.tree;

public class BinaryTree {
	Node root;
	
	public Node mirror(Node root)
	{
		if(root==null)return null;
		Node mirrorroot=new Node(root.data);
		mirrorroot.left=mirror(root.right);
		mirrorroot.right=mirror(root.left);
		return mirrorroot;
	}
	
	public Node copy(Node root)
	{
		if(root==null)return null;
		Node copyroot=new Node(root.data);
		copyroot.left=copy(root.left);
		copyroot.right=copy(root.right);
		return copyroot;
	}
	
	public int height(Node root)
	{
		if(root==null)return -1;
		int lheight = height(root.left);
		int rheight = height(root.right);
		return 1 + Math.max(lheight, rheight);
	}

	public int nodeCount(Node root)
	{
		if(root==null)return 0;
		int lcount= nodeCount(root.left);
		int rcount = nodeCount(root.right);
		return 1+lcount+rcount;
	}
	
	public Node search(Node root,int key) {
			if(root==null)return null;
			if(root.data==key)return root;
			Node lsearch=search(root.left, key);
			if(lsearch!=null)return lsearch;
			Node rsearch=search(root.right, key);
			return rsearch;
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

	private void buildTree() {
		root = new Node(20);
		Node lnode = new Node(28);
		Node rnode = new Node(30);
		root.left=lnode;
		root.right=rnode;
		lnode.left=new Node(10);
		lnode.right=new Node(5);
		rnode.right=new Node(50);
		
	}
	

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
		
		Node key=b.search(b.root,10);
		if(key!=null)System.out.println(key.data);
		else System.out.println("not found");
		
		System.out.println(b.nodeCount(b.root));
		
		System.out.println("\nheight:"+b.height(b.root));
		System.out.println("\ncopy");
		b.inorderTraversal(b.copy(b.root));
		System.out.println("\n\nmirror");
		b.inorderTraversal(b.mirror(b.root));
	}
	

}
