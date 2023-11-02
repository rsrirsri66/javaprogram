package array;

import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,pos;
		Scanner s=new Scanner(System.in);
		System.out.print("enter num of elements");
		n=s.nextInt();
		int ae[]=new int[n];
		System.out.print("enter num one by one:");
		for(int i=0;i<n;i++)
		{
			ae[i]=s.nextInt();
		}
		System.out.print("enter the position:");
		pos=s.nextInt();
		System.out.print("update:");
		int update=s.nextInt();

		ae[pos-1]=update;
		for(int i=0;i<n;i++) {
			System.out.println(ae[i]);
		}
	}

}
