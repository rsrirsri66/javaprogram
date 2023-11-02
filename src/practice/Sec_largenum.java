package practice;

import java.util.Scanner;

public class Sec_largenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elements:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]<a[j]) {
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		   System.out.println("after sorting:");
		     for(int i=0;i<n;i++) {
		     System.out.println(a[i]+" ");
		     
		     }
		     System.out.println("small num"+" "+a[0]);
		    // System.out.println("large num"+" "+a[n-2]);
		     int i;
		     for(i=n-1;i>0;i--) {
		    	 if(a[i]!=a[i-1])
		    		 break;
		     }
		     System.out.println(a[i-1]);

	}

}
