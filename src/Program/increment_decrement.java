package Program;

import java.util.Scanner;

public class increment_decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any int a:");
		a=s.nextInt();
		b=++a;
		System.out.println(a);
		System.out.println(b);
		c=a++;
		System.out.println(a);
		System.out.println(c);

	}

}
