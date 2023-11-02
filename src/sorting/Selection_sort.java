package sorting;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
	     int i,n,step,min_idx,temp=0;
	     Scanner s=new Scanner(System.in);
	     System.out.println("enter the no.of elements=");
	     n=s.nextInt();
	     int a[]=new int[n];
	     System.out.println("enter the num one by one=");
	     for(i=0;i<n;i++){
	     	
				a[i]=s.nextInt();}
	    System.out.println("before sorting:");
	     for(i=0;i<n;i++) {
	    	 System.out.println(a[i]);
	    	 
	     }
	     
	     for(step=0;step<n-1;step++) 
	     {
	    	 min_idx=step;
	    	 for(i=step+1;i<n;i++) 
	    	 {
	    		if(a[min_idx]>a[i])
	    		{
	    			min_idx=i;
	    		}
	    	 }
	    	 temp=a[step];
	    	 a[step]=a[min_idx];
	    	 a[min_idx]=temp;
	     }
	     System.out.println("after sorting:");
	     for(i=0;i<n;i++) {
	     System.out.print(a[i]+" ");
	     }
	}

}
