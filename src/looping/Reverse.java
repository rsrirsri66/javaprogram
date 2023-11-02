package looping;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,result=0,reminder;
         Scanner s=new Scanner(System.in);
	     System.out.println("num:");
	     num=s.nextInt();
	     int temp=num;
	     while(num>0) {
	    	 reminder=num%10;
	    	 result=result*10+reminder;
	    	 num=num/10;
	     }
	     System.out.println(result); 
	     System.out.println(num);
	if(result==temp) {
		System.out.print("number is palindrone");
	}
	else {
		System.out.print("num is not palindrone");
	}

}
}

