package Program;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num:");
		n=s.nextInt();
		int ar[]=new int[n];
		System.out.print("enter num one by one;");
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
		}
		System.out.println("even num:");
		for(int i=0;i<n;i++){
		   if(ar[i]%2==0) {
			System.out.print(ar[i]+" ");
			System.out.println();
		}
		}
		System.out.println("odd num:");
		for(int i=0;i<n;i++){
		   if(ar[i]%2!=0) {
			System.out.print(ar[i]+" ");
		
		   }
		}
	}
}
		

	


