package Program;

import java.util.Scanner;

public class bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,count=0;
		String x="";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the decimal :");
		n=s.nextInt();
		while(n>0) {
			int a=n%2;
			x=a+x;
			n=n/2;
		}
		int l=x.length();
		for(int i=0;i<l;i++) {
			if(x.charAt(i)=='1') {
				count++;
			}
		}
System.out.println("no.of 1's are:"+count);
	}

}
