package practice;

public class BST {
	class node{
		int key;
		node left,right;
		public node(int item) {
			key=item;
			left=right=null;
		}
	}
	node root;
	BST(){
		root=null;
	}
	void insert(int key) {
		root=insertkey(root,key); 
	}
	node insertkey(node root,int key)
	{
		if(root==null) {
		 
			root= new node(key);
			return root;
		}
		if(key<root.key)
			root.left=insertkey(root.left,key);
		else if(key>root.key)
			root.right=insertkey(root.right,key);
		return root;
	}
	 void inorder(node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
		}
	}
	 void preorder(node root) {
		 if(root!=null) {
			 System.out.print(root.key+" ");
			 preorder(root.left);
			 preorder(root.right);
			 
		 }
	 }
	void postorder(node root) {
		if(root!=null) {
			preorder(root.left);
			preorder(root.right);
			System.out.print(root.key+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree=new BST();
		tree.insert(56);
		tree.insert(21);
		tree.insert(2);
		tree.insert(1);
		tree.insert(11);
		tree.insert(6);
		tree.insert(57);
		tree.insert(111);
		tree.insert(58);
       System.out.println("inorder");
       tree.inorder(tree.root);
       System.out.println();
       System.out.println("preorder");
       tree.preorder(tree.root);
       System.out.println();
       System.out.println("post order ");
       tree.postorder(tree.root);
	}

}
