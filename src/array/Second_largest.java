package array;

import java.util.Scanner;

public class Second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n,max,i,temp=0;
	boolean result;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the num:");
     n=s.nextInt();
     int ar[]=new int[n];
     System.out.println("enter num one by one:");
     for( i=0;i<n;i++) {
    	 ar[i]=s.nextInt();
    	 }
     for( i=0;i<n-1;i++) {
    	 for(int j=0;j<n-i-1;j++) {
    		 if(ar[j]>ar[j+1]) {
    		 temp=ar[j];
    		 ar[j]=ar[j+1];
    		 ar[j+1]=temp;
    		 }
    		 
    	 }
     }
     System.out.println("after sorting:");
     for(int k=0;k<n;k++) {
     System.out.println(ar[k]+" ");}
     
    	 System.out.println("second largest:"+ar[n-2]);
    	 System.out.println("second smallest:"+ar[1]);
    	 
    	 
    	 
     
     
	}
}
    


