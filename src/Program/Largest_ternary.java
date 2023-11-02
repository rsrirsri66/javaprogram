package Program;

import java.util.Scanner;

public class Largest_ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("enter three nums:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=c>(a>b?a:b)?c:((a>b)?a:b);
		System.out.println("largest num="+d);

	}

}
