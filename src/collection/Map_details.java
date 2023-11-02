package collection;

import java.util.*;

public class Map_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>m=new HashMap<Integer, String>();
		
		m.put(12, "sri");
		m.put(1, "sridhar");
		m.put(2, "Rsri");
		m.put(3, "sri");
		m.put(112, "sridharan");
		
		//display content using iterator
		Set set=m.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Map.Entry mentry=(Map.Entry)i.next();
			System.out.println("key is:"+mentry.getKey());
		}
		String var=m.get(2);
		System.out.println("val at key 2 is:"+var);
		m.remove(3);
		System.out.println("after removal:");
		Set set2=m.entrySet();
		Iterator i2=set2.iterator();
		while(i2.hasNext())
		{
			Map.Entry mentry2=(Map.Entry)i2.next();
			System.out.print("key is:"+mentry2.getKey()+"& val is:");
			System.out.println(mentry2.getValue());
		}
		
	}

}
