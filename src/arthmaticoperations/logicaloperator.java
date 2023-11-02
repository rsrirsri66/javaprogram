package arthmaticoperations;

import java.util.Scanner;

public class logicaloperator {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.print("a=");
		a=s1.nextInt();
		System.out.print("b=");
		b=s1.nextInt();
		System.out.print("c=");
		c=s1.nextInt();
		if(c>b&&c>a) {
			System.out.println("C is bigger");
		}
			else if(b>a&&b>c) {
			 System.out.println("B is bigger");
			}
				else {
				System.out.print("A is bigger");
			}
		}
	}
