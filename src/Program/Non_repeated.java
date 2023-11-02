package Program;

import java.util.Scanner;

public class Non_repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.print("number of elements:");
		int n=s.nextInt();
		int ary[]=new int[n];
		System.out.println("enter num one by one:");
		for(int i=0;i<n;i++) {
			ary[i]=s.nextInt();
		}
		System.out.println("array:");
		for(int i=0;i<n;i++) {
			System.out.println(ary[i]+" ");
		}
		System.out.println("non repeating:");
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(ary[i]==ary[j]&&i!=j)
				{
					flag=1;
				}
			}
				if(flag==0)
				{
					System.out.println(ary[i]+" ");
				}
				flag=0;
				
			}
		}
			}
			
		


