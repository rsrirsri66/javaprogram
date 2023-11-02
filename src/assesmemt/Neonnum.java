package assesmemt;

import java.util.Scanner;

public class Neonnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,n1,n2,sum=0,product=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter num=");
        num=s.nextInt();
        n1=num*num;
        System.out.println("enter num="+n1);
        String str=Integer.toString(n1);
        int len=str.length();
        for(int i=1;i<=len;i++) {
        	n2=n1%10;
        	n1=n1/10;
        	sum=sum+n2;
        } System.out.println(sum);
        if(num==sum) {
        	 System.out.println("neon number");
        	 }
        	 else {
        		 System.out.println("not neon num");
        	 }
        }
	}


