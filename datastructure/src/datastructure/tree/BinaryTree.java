package datastructure.tree;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


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

	//bfs or level order
	public void levelOrder(Node root) {
		if (root == null) return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node node = q.remove();
			System.out.print(node.data + " ");
			if (node.left != null)	q.add(node.left);
			if (node.right != null) q.add(node.right);
		}
	}
	
	public void printEachLevelInNewLine(Node root) {
		if(root == null) return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int sizeOfCurrentLevel = q.size();
			while(sizeOfCurrentLevel-->0) {
				Node node = q.remove();
				System.out.print(node.data + " ");
				if (node.left != null)	q.add(node.left);
				if (node.right != null) q.add(node.right);
			}
			System.out.println();
		}
	}
	
	public void width(Node root)
	{
		if(root==null)return;
		Queue<Node> q = new LinkedList<>();
		HashMap<Node, Integer> map = new HashMap<>();
		q.add(root);
		map.put(root, 0);
		while(!q.isEmpty()) {
			int sizeOfCurrentLevel = q.size();
			int firstNodeId = 0;
			int secondNodeId = 0;
			Node node = null;
			while(sizeOfCurrentLevel-->0) {
				node = q.remove();
				int id = map.get(node);
				if (node.left != null) {
					q.add(node.left);
					map.put(node.left,id-1);
				}
				if (node.right != null) {
					q.add(node.right);
					map.put(node.right,id+1);
				}
				if(firstNodeId==0) {
					firstNodeId = map.get(node);
				}
			}
			secondNodeId = map.get(node);
			System.out.println(secondNodeId-firstNodeId);
		}
		
	}
	
	
	public void levelNodeCountIterative(Node root)
	{
		if(root==null)return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int i=0;
		while(!q.isEmpty())
		{
			int sizeOfCurrentLevel=q.size();
			System.out.println("no.of nodes at level "+i+":" + sizeOfCurrentLevel);
			while(sizeOfCurrentLevel-->0)
			{
				Node node = q.remove();
				if (node.left != null)	q.add(node.left);
				if (node.right != null) q.add(node.right);
			}
			++i;
		}
	}
	
	public int[] levelNodeCountRecursive(Node root) 
	{
		int[] count = new int[height(root)+1];
		if(root==null)return count;
		levelCount(root,0,count);
		return count;
	}
	
	public void levelCount(Node root, int level, int[] count)
	{
		if(root==null)return;
		count[level]++;
		levelCount(root.left,level+1,count);
		levelCount(root.right,level+1,count);
	}

	public int leafCount(Node root)
	{
		if(root==null)return 0;
		if(root.left==null && root.right==null)return 1;
		return leafCount(root.left)+leafCount(root.right);
	}
	
	public boolean checksum(Node root,int sum,int key)
	{
		if(root==null)return false;
		sum+=root.data;
		if(root.left==null && root.right==null &&sum==key)return true;
		boolean x = checksum(root.left, sum, key);
		if(x)return x;
		else return checksum(root.right, sum, key);
	}
	
	public boolean isPathSumExist(Node root,int key)
	{
		if(root==null)return false;
		if(root.left==null && root.right==null && key-root.data==0)return true;
		return isPathSumExist(root.left, key-root.data) 
		      || isPathSumExist(root.right, key-root.data); 
	}
	
	
	//print nodes only at level k
	public void printNodesAtLevel(Node root,int level)
	{
		if(root==null)return;
		if(level==0)System.out.println(root.data);
		printNodesAtLevel(root.left, level-1);
		printNodesAtLevel(root.right, level-1);
	}
	
	int getLowestAncestor(Node root,int node1,int node2)
	{
		ArrayList<Integer> parents1 = new ArrayList<>();
		ArrayList<Integer> parents2 = new ArrayList<>();
		getAllAncestors(root,node1,parents1);
		getAllAncestors(root,node2,parents2);
		for(int p1 : parents1)
		{
			for(int p2 : parents2)
			{
				if(p1==p2)return p1;
			}
		}
		return -1;
		
	}
	
	

	private boolean getAllAncestors(Node root, int node, ArrayList<Integer> A) {
		if(root==null)return false;
		if(root.data==node) 
		{
			A.add(root.data);
			return true;
		}
		if(getAllAncestors(root.left, node, A)) 
		{
			A.add(root.data);
			return true;
		}
		if(getAllAncestors(root.right, node, A))
		{
			A.add(root.data);
			return true;
		}
		return false;
		
	}

	private void buildTree() {
		/*root = new Node(20);
		Node lnode = new Node(28);
		Node rnode = new Node(30);
		root.left=lnode;
		root.right=rnode;
		lnode.left=new Node(10);
		lnode.right=new Node(5);
		rnode.right=new Node(50);
		root.left.left.left=new Node(16);
		root.left.left.right=new Node(23);
		lnode.right.left=new Node(1);
		lnode.right.right=new Node(40);
		rnode.right.left=new Node(100);
		rnode.right.right=new Node(200);*/
		
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.right = new Node(5);
		root.left.left.left = new Node(41);
		root.left.right = new Node(7);
		root.right.right.left = new Node(51);
		
	}
	public static void main(String[] args) {
		
		BinaryTree b = new BinaryTree();
		b.buildTree();
		BinaryTreePrinter.printNode(b.root);
		System.out.println(b.checksum(b.root, 0, 3));
		System.out.println(b.isPathSumExist(b.root, 3));

		System.out.println(b.getLowestAncestor(b.root, 2, 5));
	}
	

}
