package Assessment;

import java.util.Scanner;

public class pokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b;
       Scanner s=new Scanner(System.in);
       System.out.print("pokeball=");
       a=s.nextInt();
       System.out.print("pokemon=");
       b=s.nextInt();
       if(a>b) {
   		System.out.print(1);
       }
   		else {
   			System.out.print(0);
   		}
   	
	}
	

}
