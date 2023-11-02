package collection;
import java.util.*;

public class Queue_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new LinkedList<String>(); 
		
		q.add("Rick");
		q.add("Sri");
		q.add("Sharoo");
		q.add("Negan");
		q.add("Billa");
		
		System.out.println("elements in queue:"+q);
		System.out.println("removed element:"+q.remove());
		System.out.println("head: "+q.element());
		System.out.println("poll: "+q.poll());
		System.out.println("peek: "+q.peek());//current which is pointer 
		System.out.println("elements in queue: "+q);
		

	}

}
 