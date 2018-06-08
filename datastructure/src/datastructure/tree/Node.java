package datastructure.tree;

public class Node {
	
	public Node left;
	public Node right;
	public int data;
	public int count=1;
	Node(){}
	Node(int data){
		this.data=data;
	}

	public String toString() {
		return "[ " + data + " ]";
	}
}
