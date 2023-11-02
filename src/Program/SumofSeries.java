package Program;

import java.util.Scanner;

public class SumofSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,ans=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num:");
		n=s.nextInt();
		int fact=1;
		int a=1;
		for(int i=1;i<=n;i++) {
			fact=i*fact;
		}
		System.out.println(fact);
		

	}

}
