package assessment_4;

import java.util.*;

public class Singly_linked_list {
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		    this.next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data) 
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
	public void insertatthebeginning(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public void insertattheend(int data)
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
	
	
	public void display()
	{
		Node current =head;
		if(head==null)
		{
			System.out.println("list is emty");
			return; 
		}
		else {
			System.out.println("node is singly list:");
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Singly_linked_list s=new  Singly_linked_list();
          s.display();
          s.addNode(10);
          s.addNode(20);
         
          s.addNode(30);
          s.addNode(40);
          s.insertattheend(100);
          s.insertatthebeginning(1000);
          s.insertatthebeginning(2000);
        
          s.display();
	}

}
