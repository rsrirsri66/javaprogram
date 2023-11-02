package practice;
import java.util.*;
class SortedArrayList {
	private ArrayList<Integer>list;
	
	public  SortedArrayList() { 
		list=new ArrayList<Integer>();
	}
	public boolean isEmpty() {
		 return list.size() == 0 || list == null;
	} 
	 public int binarySearch(int ele)
	    {
	        return Collections.binarySearch(list, ele);
	    }
	    /**  Function to check if element is present in list  **/
	    public boolean contains(int ele)
	    {
	        return binarySearch(ele) >= 0;
	    }
	    public void remove(int ind)
	    {
	        list.remove(ind);
	    }
	
	public void add(int element) { 
		int pos=list.size();
		list.add(element);
		while(pos> 0 && element<list.get(pos-1) )
		{
			list.set(pos, list.get( pos-1));  
			pos--;
		}
		list.set(pos, element);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		SortedArrayList list=new SortedArrayList();
		 System.out.println("Sorted List Test\n");          
	        char ch;
	        /*  Perform list operations  */
	        do {
	        	 System.out.println("\nSorted List Operations\n");
	             System.out.println("1. insert");
	             System.out.println("2. remove ");
	             System.out.println("3. binary search");
	             System.out.println("4. contains");
	             System.out.println("5. check empty");
	                       
	             int choice = scan.nextInt();  
	             switch (choice) 
	             {
	             case 1 : 
	                 System.out.println("Enter integer element to add");
	                 list.add( scan.nextInt() );                     
	                 break;                           
	             case 2 : 
	                 System.out.println("Enter index");
	                 list.remove(scan.nextInt() );                     
	                 break;                         
	             case 3 : 
	                 System.out.println("Enter integer element to search");
	                 System.out.println("Binary search result : "+ list.binarySearch(scan.nextInt() ));
	                 break;                                          
	             case 4 : 
	                 System.out.println("Enter integer element ");
	                 System.out.println("Contains result : "+ list.contains(scan.nextInt() ));                
	                 break;
	             case 5 : 
	                 System.out.println("Empty status = "+ list.isEmpty());
	                 break;                                      
	             default : 
	                 System.out.println("Wrong Entry \n ");
	                 break;   
	             }
	             /*  Display List  */ 
	             System.out.println(list);
	              System.out.println("\nDo you want to continue (Type y or n) \n");
	             ch = scan.next().charAt(0);
	        }while (ch == 'Y'|| ch == 'y');  
	        
}
}
