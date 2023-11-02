package data_structure;

public class Circular_linked_list {
	int flag=0;
	 public class Node
	  {
	    int data;
	    Node next;
	    public Node(int data)
	    {
	      this.data=data;
	      next=null;
	    }
	  }
	  public Node head=null;
	  public Node tail=null;
	  
	  public void addnode(int data)
	  {
	    Node newnode=new Node(data);
	    if(head==null)
	    {
	      head=newnode;
	      tail=newnode;
	      newnode.next=head;
	    }
	    else
	    {
	      tail.next=newnode;
	      tail=newnode;
	      tail.next=head;
	    }
	  }
	  public void insertbeg(int data)
	  {
	    Node newnode= new Node(data);
	    newnode.next=head;
	    head=newnode;
	  }
	  public void insertatend(int data)
	  {
	    Node newnode=new Node(data);
	    if(head==null)
	    {
	      head=newnode;
	      tail=newnode;
	      newnode.next=head;
	      return; 
	    }
	    tail.next=newnode;
	    tail=newnode;
	    tail.next=head;
	  }
	 /* public void delete(int data)
	  {
	    Node temp=head;
	    if(head.data==data)
	    {
	      head=head.next;
	      
	    }
	    else if(temp.data==data)
	    {
	      while(temp!=tail)
	      {
	        
	      }
	      temp=temp.next;
	    }
	  }*/
	 /* public static Node addafter(Node last,int data,int item)
		{
			if(last==null)
			{
				return null;
			}
		Node newnode,p;
		p=last.next;
		do {
			if(p.data==item) {
				newnode=new Node(data);
				newnode.data=data;
				newnode.next=p.next;
			}
		}
		}*/
	  public void insertbetween(int data,int item) {
		  Node newnode=new Node(data);
		  Node current=head;
		  if(head==null) {
			  head=newnode;
			  tail=newnode;
			  return;
		  }
		  else {
			  do { 
				  if(current.data==item) {
					  if(current==tail) {
						  tail.next=newnode;
						  tail=newnode;
						  tail.next=head;
						  current=newnode;
					  }
					  else {
						  newnode.next=current.next;
						  current.next=newnode;
						  current=newnode;
					  }
				  }
				  current=current.next;
			  }while(current!=head);
		  }
		  
	  }
	  public void deletenode(int data) {
		  Node newnode=new Node(data);
		  Node current=head;
		  if(head==null) {
			  System.out.println("list is empty");
			  return;
	  }
		  do {
			  if(current==head && current.data==data)
			  {
				  newnode=head.next;
				  tail.next=newnode;
				  head=newnode;
			  }
			  else if(current.next.data==data) {
				  newnode=current.next;
				  current.next=newnode.next;
				  flag=1;
			  }
			  current=current.next;
			  
		  }
		  
		  while(current!=head);
		  if(flag==0) {
			  System.out.println("element not present");
		  }
	  
}
		
	  public void display()
	  {
	    Node current=head;
	    if(head==null)
	    {
	      System.out.println("the list is empty..");
	      return;
	    }
	    else
	    {
	      System.out.println("the nodes of the circularlist are...");
	    do
	    {
	      System.out.println(current.data);
	      current=current.next;
	    }while(current!=head);
	      System.out.println();
	    }
	      
	  }

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
		  Circular_linked_list sc= new Circular_linked_list();
	    sc.addnode(2);
	    sc.addnode(3);
	    sc.addnode(4);
	    sc.addnode(5);
	    sc.addnode(6);
	    sc.insertbeg(9999);
	    sc.insertatend(9);
	    sc.insertbetween(21, 2);
	    sc.deletenode(9999);
	    sc.display();
	    
	    

	  }

	}