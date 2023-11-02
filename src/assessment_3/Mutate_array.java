package assessment_3;

import java.util.*;

public class Mutate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the elements");
		n=s.nextInt();
		int ar[]=new int[n+1];
		System.out.println("enter num one by one:");
		for(int i=0;i<n;i++) {
		  ar[i]=s.nextInt();	
		}
		for(int i=0;i<n;i++)
		{
			if(i==0 && ar[0]==0)
			 ar[0]=ar[i];
			else if(i==n-1 && ar[n-1]==0)
				ar[n-1]=ar[n-2];
			else if(ar[i]==0)
				ar[i]=ar[i-1]+ar[i+1];
		}
		for(int arr:ar)
		{
			System.out.println("ans:"+arr);
			s.close();
		}
		
	
	

	}
	

}
