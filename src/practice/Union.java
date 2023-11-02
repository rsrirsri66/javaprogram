package practice;
import java.util.*;
public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>alist=new ArrayList<Integer>();
		ArrayList<Integer>alist1=new ArrayList<Integer>(); 
		Scanner s=new Scanner(System.in);
		System.out.print("enter the no . of elements:");
		int n=s.nextInt();
		System.out.println("enter num one by one: ");
		for(int i=0;i<n;i++)
		{ 
			alist.add(s.nextInt());
		}
		System.out.println("enter num one by one: ");
		for(int i=0;i<n;i++)
		{
			alist1.add(s.nextInt());
		}
		System.out.println("Arraylist: ");
		System.out.println(alist);
		System.out.println("Arraylist1: ");
		System.out.println(alist1); 
		
		ArrayList<Integer> union=new ArrayList<Integer>(alist); 
	    for(int num: alist1) {
	    	if(!union.contains(num))
	    		union.add(num);
	    	
	    } 
	    Collections.sort(union);
	    System.out.println("union"+union);
	    ArrayList<Integer> intersection=new ArrayList<Integer>();
	    for(Integer num : alist) {
	    	if(alist1.contains(num))
	    		intersection.add(num);
	    	
	    }
	    System.out.println("intersection"+intersection);
		
		


	}

}
