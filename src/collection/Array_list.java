package collection;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> alist=new ArrayList<String>();
			ArrayList<Comparable>alist=new ArrayList<Comparable>();//comparable is used for string,int,float....
			alist.add("Steve");
			alist.add("Sri");
			alist.add("lucy");
			alist.add("smith");
			alist.add("Shiva");
			alist.add(3);
			alist.add(12.123);
			System.out.println(alist);
			//add steve at 4th position
			alist.add(3, "Steve");
			alist.remove(1);
			alist.add(0, "tuty");
			System.out.println(alist);
			System.out.println(alist.size());
			System.out.println(alist.contains("tom"));
			alist.clone();
			//alist.clear();
			System.out.println(alist);

	}

}
