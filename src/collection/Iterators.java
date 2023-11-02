package collection;
import java.util.*;
public class Iterators {// iterator is used for faster execution

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("abc");
		alist.add("zteve");
		alist.add("Sri");
		alist.add("lucy");
		alist.add("smith");
		alist.add("Shiva");
		alist.set(0,"ganesh");
		System.out.println("orginal contents of alist: ");
		Iterator it=alist.iterator();
		while(it.hasNext())
		{
			Object element=it.next();
			System.out.println(element+"$");
			
		}
		System.out.println();
		//modify objs being iterated
		ListIterator list=alist.listIterator();
		while(list.hasNext())
		{
			Object element=list.next();
			System.out.println(element+"+");	
		}
		System.out.println();
		System.out.println("modified contents: ");
		it=alist.iterator();
		while(it.hasNext())
		{
			Object element=it.next();
			System.out.println(element+" ");
			
		}
		System.out.println();
		//now display backwards
		System.out.println("backward list: ");
		while(list.hasPrevious())//backword printing
		{
			Object element=list.previous();
			System.out.println(element+" ");	
		}
		System.out.println();
		
	}

}
