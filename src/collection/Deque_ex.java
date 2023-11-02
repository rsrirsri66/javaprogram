package collection;

import java.util.LinkedList;
import java.util.*;

public class Deque_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Deque<String> dq=new ArrayDeque<String>(); 
		
		dq.add("Rick");
		dq.add("Sri");
		dq.add("Sharoo");
		dq.addFirst("Negan");
		dq.addLast("Suresh");
		dq.add("Billa");
		System.out.println("Elements in Deque:"+dq);
		System.out.println("Removed element:"+dq.removeLast());
		System.out.println("Elements in Deque:"+dq);
		System.out.println("removed elemets:"+dq.removeFirst());
		System.out.println("elements in dq:"+dq);
		dq.add("rolex");
		System.out.println("elemets in dq:"+dq);
		System.out.println("head:"+dq.element());
		System.out.println("poll:"+dq.pollLast());
		System.out.println("peek:"+dq.peek());
		System.out.println("elements in dq:"+dq);
		System.out.println("element is empty:"+dq.isEmpty());

	}

}
