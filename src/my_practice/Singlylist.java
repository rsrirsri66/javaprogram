package my_practice;

public class Singlylist {
	
	class node
	{
		String data;
		node next;
		public node(String data)
		{
			this.data=data;
			this.next=null;
			
		}
		
	}
	public node head=null;
	public node tail=null;
	
	public void addnode(String data)
	{
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
	public void display()
	{
		node value=head;
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		else
		{
			System.out.println("print data:");
			while(value!=null)
			{
				System.out.println(value.data);
				value=value.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singlylist val=new Singlylist();
		val.display();
		val.addnode("sri");
		val.display();
		

	}

}
