package practice;

import java.util.Scanner;

public class Goto {
	
	static int number=2,count;
	static int isprime(int number1)
	{
		for(int j=2;j<=number1/2;j++)
		{
			if(number1%j==0)
			{
				number1++;
				isprime(number1);
			}
		}
		if(count==0)
		{
			System.out.println(number1+" ");
			count++;
		}
		return number1;
	}
	static void primenumber(int num)
	{
		count=0;
		if(num==0)
		
			return;
			else {
				if(number==2)
				{
					System.out.println(number+" ");
					number++;
					
				}
			else {
				number=isprime(number);
				number++;
				}
			}
		primenumber(--num);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int n=s.nextInt();
		primenumber(n);
		s.close();
	}

}
