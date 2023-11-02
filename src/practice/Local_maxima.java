package practice;
import java.util.Scanner;
public class Local_maxima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the element:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("enter the element one by one:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		// 1,2,3,4,5,-1
		int c=0,j;
		for(int i=0;i<n;i++) 
		{	
			if(arr[0]>arr[1]&&arr[0]>arr[n-1])
			{
				System.out.println(arr[0]);
				break;
			}
			
		//1,2,3,4,5,-1,9,8
			for( j=i+1;j<n-1;j++)
			{
				
				if(arr[i]<arr[j]&&arr[j]>arr[j+1])
				{
					//System.out.println(arr[j]); 
					c++;
					//break;
				}
				
			}
			if(c==2)
			{
				break;
				
				
			}
		} 
		System.out.println("count:"+c);
		

	}

}
