package looping;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num,a=0,b=1,c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the total num:");
        num=s.nextInt();
      
        System.out.println("fibonacci series ");
        System.out.print(a+" "+b+" ");
        for (int i=1;i<num;i++) 
        {
        	c=a+b;
        	System.out.print(c+" ");
        	a=b;
        	b=c;
        	
        }
	}

}
