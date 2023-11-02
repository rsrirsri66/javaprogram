package Assessment;

import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b,d,s1,time;
     Scanner s=new Scanner(System.in);
     System.out.print("a=");
     a=s.nextInt();
     System.out.print("b=");
     b=s.nextInt();
     System.out.print("speed=");
     s1=s.nextInt();
     d=a-b;
     time=d/s1;
     System.out.print("Time="+time);
     
	}

}
