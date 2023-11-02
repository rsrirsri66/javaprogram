package collection;

import java.util.*;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer, String>hmap=new TreeMap<Integer, String>();
		
		hmap.put(11, "Abi");
		hmap.put(2, "Zed");
		hmap.put(33, "Elepant");
		hmap.put(9, "Gorge");
		hmap.put(3, "Ivana");

		 Set set=hmap.entrySet();
		 Iterator i=set.iterator();
		 while(i.hasNext())
		 {
			 Map.Entry m=(Map.Entry)i.next();
			 System.out.println("key is:"+m.getKey()+"val is:"+" "+m.getValue());
		 }
		 

}
}
