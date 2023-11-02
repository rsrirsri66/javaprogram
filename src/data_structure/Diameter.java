package data_structure;
import java.util.concurrent.atomic.AtomicInteger;
class Node
{
	int data;
	Node left=null,right=null;
	
	Node(int data)
	{
		this.data=data;
	}
}

public class Diameter {
	//Function to find the diameter of the binary tree.Note that the function returns the
	//height of the subtree rooted at a given node.
	//and the diameter is updated within the function as it is passed by
	//reference using the atomicInteger class
	
	public static int getDiameter(Node root,AtomicInteger diameter)
	{
		//base case:tree is empty
		if(root==null)
		{
			return 0;
		}
		
		int left_height = getDiameter(root.left,diameter);
		int right_height = getDiameter(root.left,diameter);
		
		//calculate diameter "through" the current node
		int max_diameter = left_height+ right_height+1;
		
		//update maximum diameter (note that diameter "excluding" the current
		// node in the subtree rooted at the current node is already updated
		// since we are doing post order traversal
		diameter.set(Math.max(diameter.get(), max_diameter));
		
		// it is important to return the height of the subtree rooted at the current node
		return Math.max(left_height, right_height)+1;
		
	}
	
	public static int getDiameter(Node root)
	{
		AtomicInteger diameter =new AtomicInteger(0);
		getDiameter(root,diameter);
		
		return diameter.get();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root= new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.right=new Node(4);
		root.right.left=new Node(5);
		root.right.right=new Node(6);
		root.right.left.left=new Node(7);
		root.right.left.right=new Node(8);
		
		System.out.println("The diameter of the tree is "+getDiameter(root));

	}

}