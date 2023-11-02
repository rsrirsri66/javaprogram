package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Leader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the element:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("enter the element one by one:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int b[]=new int[n];
		int i,temp,index=0;
		for(i=0;i<n;i++) 
		{  temp=0;
			for(int j=i+1;j<n;j++) 
			{
				
				if(arr[i]<arr[j])   
				{
					//System.out.println(arr[i]);
					temp=1; 
					break;
					
				}
			}
			if(temp==0) {
				//System.out.println(b[index++]);
				b[index++]=arr[i];
				}
		}
		
		
		Arrays.sort(b);
			for(int i1=0;i1<n;i1++) {
				if(b[i1]!=0)
				System.out.print(b[i1]+" ");
			
		}
		

	}

}
