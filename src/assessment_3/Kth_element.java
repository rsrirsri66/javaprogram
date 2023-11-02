package assessment_3;

import java.util.Scanner;

public class Kth_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,k;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elements:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter the k th position at which u want to check num:");
		k=s.nextInt();
		//a[k-1]=k;
		
		
			System.out.println("number:"+a[k-1]);
		

	}

}
