package Program;

import java.util.Scanner;

public class Nobita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b;
      Scanner s=new Scanner(System.in);
      System.out.println("enter buying price:");
      a=s.nextInt();
      Scanner s1=new Scanner(System.in);
      System.out.println("enter selling price:");
      b=s.nextInt();
      System.out.print("profit="+Math.abs(a-b));
	}
    
}
