package data_structure;
import java.util.*;

public class Singly_linkedlist {
	// creating data stucture
	class Node{
		int data;//class variable
		Node next;
		public Node(int data)//parameter //constructor
		{
			this.data=data;//this is used for difference between class variable and parameter
		    this.next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	//implementation 2
	public void addNode(int data) //void is used for no returns (we will print here itself)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}     
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void insertatbeginning(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public void insertatend(int data)
	{
		Node new_node=new Node(data);
	    if(head==null)
	    { 
	    	head=new_node;
	    	tail=new_node;
	    	return;
	    } 
	    tail.next=new_node;
	    tail=new_node;
	    } 
	public void delnode(int data)
	{
		Node del=new Node(data);
		if(head.data==del.data) {
			head=head.next;
		}
		else {
			Node curr=head;
			while(curr.next!=null) {
				if(curr.next.data==del.data) {
					curr.next=curr.next.next;
				}
				curr=curr.next;
			}
		}
	}
	public void display()
	{
		Node current =head;
		if(head==null)
		{
			System.out.println("list is emty");
			return; //breaking the loop
		}
		else {
			System.out.println("node is singly list:");
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println("node completed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Singly_linkedlist sl=new Singly_linkedlist();
        sl.display();        
        sl.addNode(1);
        sl.addNode(2); 
        sl.addNode(3);
        sl.addNode(4);
        sl.insertatend(183);
        sl.insertatbeginning(10);
        sl.insertatend(18);
        sl.insertatbeginning(110);
        sl.insertatend(1832);
        sl.delnode(2);
        sl.display();

	}

}
