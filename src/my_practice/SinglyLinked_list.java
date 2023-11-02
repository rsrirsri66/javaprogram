package my_practice;

public class SinglyLinked_list {
	
	class node{
		int data; //class variables
		node next;

	public node(int data) {//constructor
		this.data=data;     
		this.next=null;
	}
	}
	public node head=null;
	public node tail=null;
	
	public void addnode(int data){
		
		node newnode=new node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else {
			tail.next=newnode;
			tail=newnode;
		}
		
	}
	public void nodeatfront(int data) {
		node newnode=new node(data);
		newnode.next=head;
		newnode=head;

	}
	public void end(int data) {
		node newnode=new node(data);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}
		tail.next=newnode;
		tail=newnode;
	}
	public void del(int pos) {
		node temp=head;
		if(head==null)
			return ;
		else if(pos==0) { 
			head=temp.next;
			return;
		}
		for(int i=0;temp!=null&i<pos-1;i++)
		{
			temp=temp.next; 
			
			if(temp==null||temp.next==null) {
				return;
			}
			node delt=temp.next.next;
			temp.next=delt;
		}
	}
	
	public void display() {
		node pres=head;
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else {
			System.out.println("singly linked list is :");
			while(pres!=null)
			{
				System.out.println(pres.data);
				pres=pres.next;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinked_list a=new SinglyLinked_list();
		a.addnode(11);
		a.addnode(123);
		a.addnode(456);
		a.addnode(78);
		a.end(111);
		a.nodeatfront(1);
		
		a.display();
		a.del(0);
		a.display();
 
	}

}
