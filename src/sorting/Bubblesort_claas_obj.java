package sorting;

import java.util.Scanner;

public class Bubblesort_claas_obj {
	static void bubblesort(int a[],int n) {
		for (int step=0;step<n-1;step++) {
			for(int i=0;i<n-step-1;i++) {
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}

   static void printarray(int a[],int n) {
	   for(int i=0;i<n;i++) {
		   System.out.println(a[i]);
		   
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n;
      Scanner s=new Scanner(System.in);
      System.out.print("enter the no.of elements=");
      n=s.nextInt();
      int a[]=new int[n];
      System.out.println("enter the nums:");
      for(int i=0;i<n;i++) {
    	  a[i]=s.nextInt();
    	  
      }
      bubblesort(a,n);
      System.out.println("after sorting:");
      printarray(a,n);
	}
}

