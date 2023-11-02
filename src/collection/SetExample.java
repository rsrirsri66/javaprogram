package collection;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[]= {23,34,34,23,56,67,78};
		Set<Integer> set=new HashSet<Integer>();
		
		// removing duplicate
		for(int i=0;i<count.length;i++)
		{
			set.add(count[i]);
			
		}
		System.out.println(set);
		TreeSet<Integer>sortedSet=new TreeSet<Integer>(set);//used for sorting
		System.out.println("the sorted list is");
		System.out.println(sortedSet);
		System.out.println("the first element of set is:"+sortedSet.first());
		System.out.println("the last element of set is:"+sortedSet.last());

	}

}
