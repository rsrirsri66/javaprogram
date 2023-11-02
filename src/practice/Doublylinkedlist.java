package practice;

public class Doublylinkedlist {
	class node{
		int data;
		public node next;
		public node prev;
	
	public node(int data) {
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	}
	public node head=null;
	public node tail=null;
	
	public void addnode(int data) {
	
		node temp=new node(data);
		if(tail!=null) {
			tail.next=temp;
			temp.prev=tail;
		}
		tail=temp;
		if(head==null) {
			head=temp;
		}
		System.out.println("Add new node:"+data);
		
	}
	public void addnodefront(int data) {
		node temp=new node(data);
		if(tail!=null) {
			head.prev=temp;
			temp.next=head;
		}
		head=temp;
		if(tail==null) {
			tail=temp;
		}
		System.out.println("Add new node:"+data);
	}
	public int delfrontnode() {
		node temp=head;
		head=head.next;
		head.prev=null;
		
		System.out.println("deleted node:"+temp.data);
		return temp.data;
	}
	public int delbacknode() {
		node  temp=tail;
		tail=tail.prev;
		tail.next=null;
		System.out.println("deleted node:"+temp.data);
		return temp.data;
		
	}
	public void forwward() {
		node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void backward() {
		node temp =tail;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doublylinkedlist s=new Doublylinkedlist();
		s.addnode(21);
		s.addnode(1);
		s.addnode(2);
		s.addnode(3);
		s.addnode(0);
		s.addnodefront(-1);
		s.delfrontnode();
		s.delbacknode();
		System.out.println("forward node:");
		s.forwward();
		System.out.println("backward node:");
		s.backward();
		
	
		

	}

}
