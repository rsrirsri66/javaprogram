package data_structure;

import java.util.*;

public class Circular_linked {

	
		public class node{
			int data;
			node next;
			public node(int data) {
				this.data=data;
			}
		}
		public node head=null;
		public node tail=null;
		
		public void add(int data) {
			node newnode=new node(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
				newnode.next=head;
			}
			else {
				tail.next=newnode;
				tail=newnode;
				tail.next=head;
			}
		}
		public void end(int data) {
			node newnode=new node(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
				newnode.next=head;
				return;
			}
			else {
				tail.next=newnode;
				newnode=tail;
				tail.next=head;
			}
		}
		
		public void display() {
			node current=head;
			if(head==null) {
				System.out.println("list is empty:");
				return;
				
			}
			else {
				System.out.println("circular linked list");
				do {
					System.out.println(" "+current.data);
					current=current.next;
					
				}
				while(current!=head);
				System.out.println();
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Circular_linked n=new Circular_linked();
			n.add(12);
			n.add(123);
			n.add(11);
			//n.insertatbeginging(111);
			n.end(13);
			n.display();
			//n.insertatbeginging(9);
			//n.display();
		} 

	}
	


