package assesment2;

import java.util.Scanner;

public class largest_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,large,small;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of elements in array ");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the numbers:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		large=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]>large)
				large=a[i];
		}
		small=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]<small)
				small=a[i];
		}
		System.out.println("largest number="+large);
		System.out.println("smallest number="+small);
		
		

	}

}
