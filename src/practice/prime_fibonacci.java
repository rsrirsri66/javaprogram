package practice;

import java.util.Scanner;

public class prime_fibonacci {
	static int fibonacci(int n){
		int a=0,b=1,c;
		//System.out.println(a+" "+b+" "); 
		for(int i=1;i<n;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		return 0; 
		
	}
	static int prime(int n) {
		if(n<2) {
			return 0; 
		}
		for(int i=2;i<=Math.sqrt((n);i++){
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int count=fibonacci(n);
		int prme=prime(n);
		
		System.out.println("av:"+prme);

	}

}
