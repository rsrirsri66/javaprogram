package data_structure;


public class Intersection_nodes {
	static class Node{
		int data;
		Node next;
	}
	public static Node push(Node head,int data){//add fornt 
		
	Node node=new Node();
	node.data=data;
	node.next=head;
	return node;
	}
	//function to find the intersection of two linked lists
	private static Node intersectionPoint(Node list1,Node list2) {
		Node firstTemp=list1;
		while(firstTemp!=null) {
			Node temp=list2;
			while(temp!=null) {
				//if both linked lists points to the same node
				if(firstTemp==temp) {
					return firstTemp;
				}
				temp=temp.next;
			}
			firstTemp=firstTemp.next;
		}
		//if no intersection
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node first=null;
		for(int i=7;i>0;i--) {
			first=push(first,i);
		}
		Node second=null;
		for(int i=3;i>0;i--) {
			second =push(second,i);
		}
		//link tail of the second list to the fourth node of the first list
		second.next.next.next=first.next.next.next;
		Node addr=intersectionPoint(first,second);
		if(addr!=null) {
			System.out.println("the intersection point is:"+addr.data);
		}
		else {
			System.out.println("the intersection point does not exist ");
		}
       
	}

}
