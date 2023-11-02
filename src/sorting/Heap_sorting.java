package sorting;

import java.util.Scanner;

public class Heap_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int i,n,step,max_idx,temp=0;
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
		     for(step=n-1;step>=0;step--)
		     {
		    	 max_idx=step;
		    	 for(i=step-1;i>=0;i--)
		    	 {
		    		 if(a[max_idx]<a[i])
		      		 {
		    			 max_idx=i;
		    		 }
		    	 }
		    	 temp=a[step];
		    	 a[step]=a[max_idx];
		    	 a[max_idx]=temp;
		     }
		     System.out.println("after sorting:");
		     for(i=0;i<n;i++) 
		     {
		    	 System.out.print(a[i]+" ");
		     }
		     
	}

}
