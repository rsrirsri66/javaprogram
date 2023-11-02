package collection;

import java.util.HashMap;
import java.util.*;

public class For_while_hashmaplooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<Integer, String>hmap=new HashMap<Integer, String>();
		
		hmap.put(11, "AB");
		hmap.put(2, "CD");
		hmap.put(33, "EF");
		hmap.put(9, "GH");
		hmap.put(3, "IJ");
		//for loop
      System.out.println("For Loop:");
      for(Map.Entry me :hmap.entrySet()) //Map.Entry is adata type
      {
System.out.println("key :"+me.getKey()+"& Value:"+me.getValue());
Iterator i=hmap.entrySet().iterator();

      }
      //while loop& iterator
      System.out.println("while loop:");
      Iterator i2=hmap.entrySet().iterator();
      while(i2.hasNext())
      {
    	  Map.Entry me2=(Map.Entry)
    			  i2.next();
    	  System.out.println("key is:"+me2.getKey()+"val is:"+me2.getValue());
      }
	}

}
