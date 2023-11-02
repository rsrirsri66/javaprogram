package assessment_4;
import java.util.*;

public class Insertion_sort {
	
	static void insertion(int a[],int n)
	{
		for(int step=1;step<n;step++)
		{
			int key=step;
			for(int i=step-1;i>=0;i--)
			{
				if(a[i]>a[key])
				{
					int temp;
					temp=a[i];
					a[i]=a[key];
					a[key]=temp;
					key--;
				}
			}
		}
	}
	static void print_statement(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the elements=");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter num one by one:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
			
		}
		
		insertion(a,n);
		System.out.println("sorted array:");
		print_statement(a,n);
		

	}

}
