package assessment_3;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,search,flag=0;
    Scanner s=new Scanner(System.in);
    System.out.print("no.of elements");
    n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the num one by one:");
    for(int i=0;i<n;i++) {
    	arr[i]=s.nextInt();   
    	}
      System.out.print("enter the num to be searched:");
      search=s.nextInt();
      for(int i=0;i<n;i++) {
    	  if(arr[i]==search) {
    		  System.out.println("Search element:"+search);
    		  System.out.println("element found at the position:"+(i+1));
    		  flag=0;}
    		  else {
    			  flag=1;
    		  }
    	  
    	 
      }
      if(flag==1) {
		  System.out.println("Element is not here");
	  }
	}

}
