package Program;

import java.util.Scanner;

public class increment_by_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b,c;
		String x="";
		Scanner s=new Scanner(System.in);
		System.out.print("enter the num");
		a=s.nextInt();
		while(a>0) {
			 b=a%10;
			c=b+1;
			x=c+x;
			a=a/10;
			
		}
		
System.out.print(x);
	}

}
