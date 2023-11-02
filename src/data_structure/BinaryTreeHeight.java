package data_structure;

public class BinaryTreeHeight {
	public static class Node{
		int data;
		Node left;
		Node right;
		
	
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
		
		
	}
	}
	public Node root;
	public BinaryTreeHeight() { //constructor calls autometical
		root=null;
	}
	public int findHeight(Node temp) {
		if(root==null) {
			System.out.println("tree is empty");
			return 0;
		}
		else {
			int leftHeight=0,rightHeight=0;
			if(temp.left!=null)
				leftHeight=findHeight(temp.left);
			if(temp.right!=null)
				rightHeight=findHeight(temp.right);
			int max=(leftHeight>rightHeight)?leftHeight:rightHeight;
			return(max+1); 
		}
	}

	public static void main(String[] args) {
		
		BinaryTreeHeight s=new BinaryTreeHeight();
		s.root=new Node(1);
		s.root.left=new Node(2);
		
		s.root.left.left=new Node(4);
		s.root.left.left.right=new Node(5);
		s.root.left.left.left=new Node(7);
		s.root.left.left.right=new Node(8);
		s.root.left.left.left.left=new Node(9);
		s.root.right=new Node(3);
		s.root.right.right=new Node(6);
		s.root.right.right.left=new Node(10);
		s.root.right.right.left.left=new Node(12);
		s.root.right.right.left.right=new Node(13);
		System.out.println("max height of given binary tree:"+s.findHeight(s.root));
		

	}

}
