package looping;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		int num,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
		num=s.nextInt();
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		System.out.printf("factorial is %d", fact);
	}

}
