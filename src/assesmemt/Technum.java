package assesmemt;

import java.util.Scanner;

public class Technum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit=0,n1 = 0,n2=0,result=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num=");
		int num=s.nextInt();
		//int temp=num;
	     //while(num>0) {
	    //	 digit++;
	    	// num=num/10;
		//}
	     //num=temp;
	     
	    	 n1=num/100;
	    	 n2=num%100;
	    	 System.out.println("first two num="+n1);
	    	 System.out.println("last two num="+n2);
	    
	     
	     result=(n1+n2)*(n1+n2);
	     System.out.println(result);
		if(result==num) {
			System.out.println("the num is technum");
		}
		else {
			System.out.print("not a technum");
		}

	}

}
