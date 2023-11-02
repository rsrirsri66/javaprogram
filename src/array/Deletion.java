package array;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,pos;
		Scanner s=new Scanner(System.in);
		System.out.print("number of elements:");
		n=s.nextInt();
		int ary[]=new int[n];
		System.out.println("enter num one by one:");
		for(int i=0;i<n;i++) {
			ary[i]=s.nextInt();
		}
		System.out.print("enter the deletion position:");
		pos=s.nextInt();
		int j=pos;
		while(j<n) {
			ary[j-1]=ary[j];
			j++;
		} 
		System.out.println("after deleting:");
		for(int i=0;i<n-1;i++) {
			System.out.print(ary[i]+" ");
		}
	}

}
