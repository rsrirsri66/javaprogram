package Assessment;

import java.util.Scanner;

public class Single_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,o,sum = 0,add = 0;
		Scanner s=new Scanner(System.in);
		System.out.print("num=");
		n=s.nextInt();
		String str=Integer.toString(n);
		int len=str.length();
		for(int i=0;i<len;i++) {
			m=n%10;
			n=n/10;
			sum=sum+m;
			
		}
		System.out.println("singledig"+sum);	
		String str1=Integer.toString(sum);
		int len1=str1.length();
		for(int j=0;j<len1;j++) {
			o=sum%10;
			sum=sum/10;
			add=add+o;
		}
		System.out.print(add);
		}
        
	}
//while(n>0||sum>9)
//r=n%10;
//sum=sum+r;
//n=n/10;


