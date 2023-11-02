package practice;
import java.util.*;

public class Decimal_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		int n,rmb,count=0;
		n=s.nextInt();
		while(n!=0)
		{
			rmb=n%2;
			n=n/2;
		
		System.out.println(rmb);
		if(rmb==1)
		{
			count++;
		}
		
		}
		System.out.println(count);
		

	}

}
