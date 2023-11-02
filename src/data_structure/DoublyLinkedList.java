package data_structure;

public class DoublyLinkedList {
	int flag=0;
	class node
	{ 
		int data;
		public node prev;
		public node next;
		public node (int data)//consutructor
		{
			this.data=data;
			
		}
	}
	node head=null;
	node tail=null;
	public void addnode(int data) 
	{
		node temp=new node(data);
		if(tail!=null)
		{
			tail.next=temp;
			temp.prev=tail;
			
		}
	  tail=temp;
	  
	  if(head==null) 
	  {
		  head=temp;
	  }
	  System.out.println("new node added:"+data);
	  
	}
	public void addnodefront(int data)
	{
		node temp=new node(data);
		if(tail!=null)
		{
			head.prev=temp; 
			temp.next=head;
			
		}
		head=temp;
		if(tail==null)
		{
			tail=temp;
		}
		System.out.println("new node added:"+data);
	}
	public int removenodefront() {
		node temp=head;
		head=head.next;
		head.prev=null;
		System.out.println("f deleted:"+temp.data);
		return temp.data;
	}
	public int removenodeback() {
		node temp=tail;
		tail=tail.prev;
		tail.next=null;
		System.out.println("deleted:"+temp.data);
		return temp.data;
	}
	public void removelement(int data)
	   
	{
		node temp=head;
		if(head.data==data)
		{
			head=head.next;
			head.prev=null;		
		} 
		
		while(temp!=null)
		{
			if(temp.data==data&&temp.next!=null)
			{
				temp.next.prev=temp.prev; 
				temp.prev.next=temp.next; 
			     flag=1;
			}
			else if(temp.data==data){
				temp.prev.next=null;
				tail=temp.prev;
				
			}
			temp=temp.next;
		}
		if(flag==0)
			System.out.print("element not present");
		
	}
	public void interateForward() {
		node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void interateBackward() {
		node temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.addnode(2);
        dl.addnode(4);
        dl.addnode(6);
        dl.addnodefront(23);
        dl.addnode(8);
        dl.addnode(10);
        dl.removelement(6);
        dl.removenodefront();
        dl.removenodeback();
        System.out.println("forward direction:");
        dl.interateForward();
        System.out.println("backword direction:");
        dl.interateBackward();
       
        
	}

}
