package assesmemt;

import java.util.Scanner;

public class Spynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,n1,sum=0,product=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter num=");
        num=s.nextInt();
        String str1=Integer.toString(num);
        int len=str1.length();
        for(int i=1;i<=len;i++) {
        	n1=num%10;
        	num=num/10;
        	sum=sum+n1;
        	product=product*n1;
        	
        }System.out.println("SUM:"+sum);
        System.out.println("PRODUCT:"+product);
        if(sum==product) {
        	System.out.println("number is Spy NUM");}
        	else {
        		System.out.println("NOT number is Spy NUM");
        	}
        }
	}


