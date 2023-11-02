package practice;
import java.util.*;
public class Next_greatest_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,flag=0;
      Scanner s= new Scanner(System.in);
      System.out.println("enter num of element");
      n=s.nextInt();
      int arr[]=new int[n];
      System.out.println("enter element one by one:");
      for(int i=0;i<n;i++)
      {
    	  arr[i]=s.nextInt();
      }
      for(int i=0;i<n;i++) {
    	  if(arr[i]==arr[n-1]) {
    		  System.out.println(arr[i]+"->-1");
    		  flag=1;
    	  }
    		  for(int j=i+1;j<n;j++) {
    			  if(arr[i]<arr[j]) {
    			  
    				  System.out.println(arr[i]+"->"+arr[j]);
    			      flag=1;
    			      break;
    		  }
    		  }
    		  if(flag==0)
    			  System.out.println(arr[i]+"->");
    		  flag=0;
    	  }
      
      }
	}


