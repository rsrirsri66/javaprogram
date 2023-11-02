package Program;

import java.util.Scanner;

public class longval_byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a;
		byte b;
		Scanner s=new Scanner(System.in);
		System.out.print("enter any long val");
		a=s.nextLong();
		b=(byte)a;
		System.out.println("conversion into byte:"+b);

	}

}
