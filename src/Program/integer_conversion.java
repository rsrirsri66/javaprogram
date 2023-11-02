package Program;

import java.util.Scanner;

public class integer_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a;
      byte b;
      char c;
      float d;
      Scanner s=new Scanner(System.in);
      System.out.print("any integer");
      a=s.nextInt();
      b=(byte)a;
      System.out.println(b);
      c=(char)a;
      System.out.println(c);
      d=a;//float in greater than int so no need conversion
      System.out.println(d);
	}

}
