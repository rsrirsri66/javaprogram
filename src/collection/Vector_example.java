package collection;
import java.util.*;

public class Vector_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec=new Vector<String>(8);
		
		vec.addElement("apple");
		vec.addElement("orange");
		vec.addElement("mango");
		vec.addElement("fig");
		//vec.addElement("fet");
		
		System.out.println("size is:"+vec.size());
		System.out.println("default capcity increment is:"+vec.capacity());
		
		vec.addElement("fruit 1");
		vec.addElement("fruit 2");
		vec.addElement("fruit 3");
	    vec.addElement("fruit 6");
		
		System.out.println("size after addition:"+vec.size());
		System.out.println("default capcity increment is:"+vec.capacity());
		
		Enumeration en=vec.elements();
		System.out.println("\nElements are:");
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement()+" ");
		}

	}

}
