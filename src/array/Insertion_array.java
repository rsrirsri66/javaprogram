package array;

import java.util.Scanner;

public class Insertion_array {
	public static void main(String[] args) {
	int n,pos,element;
	Scanner s=new Scanner(System.in);
	System.out.print("enter the elements");
	n=s.nextInt();
	int ar[]=new int[n+1];
	System.out.println("enter num one by one:");
	for(int i=0;i<n;i++) {
	  ar[i]=s.nextInt();	
	}
	System.out.print("enter the position:");
	pos=s.nextInt();
	System.out.print("insert num:");
	element=s.nextInt();
	int j=n;
	while(j>=pos) {
		ar[j]=ar[j-1];
		j--;
	}
	//System.out.println(n);
	ar[pos-1]=element;
	
	System.out.print("after positioning");
	for(int i=0;i<n+1;i++) {
		System.out.print(ar[i]+" ");

	}
	//System.out.println(n);
}
}