package array;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,search;
		Scanner s=new Scanner(System.in);
		System.out.print("no.of elements");
		n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("enter num one by one:");
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		System.out.print("enter search element:");
		search=s.nextInt();
		for(int i=0;i<n;i++) {
			if(ar[i]==search) {
				System.out.println("search element:"+search+" "+"at position:"+(i+1));
			}
			else {
				System.out.println("element is not there");
			}
		}
		
		

	}

}
