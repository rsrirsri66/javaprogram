package Program;

import java.util.Scanner;

public class extract_digits {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      int n,m,a,i=1,count=0;
      Scanner s=new Scanner(System.in);
      System.out.print("enter num:");
      n=s.nextInt();
      m=n;
      while(n>0) {
    	  n=n/10;
    	  count++;
      }
      while(m>0) {
    	  a=m%10;
    	  System.out.println("digits at position"+count+":"+a);
    	  m=m/10;
    	  count--;
      }
	}

}
