package collection;
import java.util.*;

public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<String> list=new LinkedList<String>();
        list.add("abc");
		list.add("zteve");
		list.add("Sri");
		list.add("rose");
		
		list.addFirst("suriya");
		//list.removeFirst();
		list.addLast("kamal");
		list.removeLast();
		list.remove(3);
		
		list.add(2,"Shiva");
		System.out.println(list);
		Iterator<String>iterator=list.iterator();
		System.out.println("list:");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		list.clone();
		System.out.println(list);
	}

}
