package controlflow;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		int num1;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the num");
		num1=s.nextInt();
		if(num1>0)
		{
		   System.out.print("positive num:"+num1);
		}
		else {
			   System.out.print("negative num:"+num1);
		   }
	}

}
