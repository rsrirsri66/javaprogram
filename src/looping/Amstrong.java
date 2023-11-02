package looping;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num, digit=0,reminder,result=0,temp;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the num");
     num=s.nextInt();
     temp=num;
     while(num>0) {
    	 digit++;
    	 num=num/10;
     }
     num=temp;
     while(num>0) {
    	 reminder=num%10;
    	 result=(int) (result+ Math.pow(reminder, digit));
    	 num=num/10;
    	 
     }
     if(temp==result) {
    	 System.out.println("amstrong num");
     }
     else {
    	 System.out.println("not amstrong");
     }
	}

}
