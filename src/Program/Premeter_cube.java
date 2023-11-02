package Program;

import java.util.Scanner;

public class Premeter_cube {
	public static void main(String[] args) {
	int a,b,c;
	Scanner s=new Scanner(System.in);
    System.out.println("enter 1st num:");
    a=s.nextInt();
    Scanner s1=new Scanner(System.in);
    System.out.println("enter 2nd num:");
    b=s1.nextInt();
    Scanner s3=new Scanner(System.in);
    System.out.println("enter 3rd num:");
    c=s3.nextInt();
    int result= (a+b+c);
    System.out.print("perimeter of cube:"+4*result);

}
}
