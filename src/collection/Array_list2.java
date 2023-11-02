package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_list2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter the no . of elements:");
		int n=s.nextInt();
	/*	alist.add("abc");
		alist.add("zteve");
		alist.add("Sri");
		alist.add("lucy");
		alist.add("smith");
		alist.add("Shiva");
		alist.set(0,"ganesh");*/
		System.out.println("enter num one by one: ");
		for(int i=0;i<n;i++)
		{
			alist.add(s.nextInt());
		}
		System.out.println("Arraylist: ");
		Collections.sort(alist);
		System.out.println(alist);
		
		
		System.out.println("arraylist using for each: ");
		
		for(int str:alist) 
		{
			System.out.println(str);
			
		}
		alist.remove(1);
		System.out.println(alist);
		System.out.println(alist.get(2));
		System.out.println(alist.indexOf(2));
		
	}

}
