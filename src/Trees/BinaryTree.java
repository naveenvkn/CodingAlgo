package Trees;

class Node
{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}

public class BinaryTree {
	
	Node root;
	BinaryTree()
	{
		root=null;
	}
	BinaryTree(Node n)
	{
		root=n;
	}
	static void printInOrderTraversal(Node n)
	{
		if(n==null)
			return;
		printInOrderTraversal(n.left);
		System.out.print(n.data+" ");
		printInOrderTraversal(n.right);
	}
	static void printpreOrderTraversal(Node n)
	{
		if(n==null)
			return;
		System.out.print(n.data+" ");
		printpreOrderTraversal(n.left);
		printpreOrderTraversal(n.right);
	}
	static void printpostOrderTraversal(Node n)
	{
		if(n==null)
			return;
		printpostOrderTraversal(n.left);
		printpostOrderTraversal(n.right);
		System.out.print(n.data+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b=new BinaryTree(new Node(1));
		b.root.left=new Node(2);
		b.root.right=new Node(3);
		b.root.left.left=new Node(4);
		b.root.left.right=new Node(5);
		printInOrderTraversal(b.root);
		System.out.println();
		printpreOrderTraversal(b.root);
		System.out.println();
		printpostOrderTraversal(b.root);

	}

}
