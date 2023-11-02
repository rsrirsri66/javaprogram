package collection;
import java.util.*;

public class Linkedlist_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> list=new LinkedList<String>();
	        list.add("item1");
			list.add("item2");
			list.add("item3");
			list.add("item4");
			list.add("item5");
			list.add("item6");
			list.add("item1");
			System.out.println("linked list:"+list);
			list.addFirst("item0");
			list.addLast("item7");
			Object first=list.get(0);
			System.out.println("first element:"+first);
			list.set(0, "changed first element");
			Object sec=list.get(0);
			System.out.println("first element after update by set method:"+sec);
			list.removeFirst();
			//list.removeLast();
			System.out.println("after removing elements:"+list);
			list.add(0, "items");
			list.remove(2);
			//list.poll();//removes the 1st element
			System.out.println("final list:"+list);
			Object str=list.clone();
			System.out.println(str);
			list.removeLastOccurrence("item1");
			System.out.print(list);
			
			

	}

}
