package assessment_4;
import java.util.*;

public class Heap_sort {
	
	static void heaping(int a[],int n)
	{
		for(int step=n-1;step>=0;step--)
		{
			int max=step;
			for(step=n-1;step>=0;step--)
		     {
		    	 max=step;
		    	 for(int i=step-1;i>=0;i--)
		    	 {
		    		 if(a[max]<a[i])
		      		 {
		    			 max=i;
		    		 }
		    	 }
		    	int  temp=a[step];
		    	 a[step]=a[max];
		    	 a[max]=temp;
	}
		}
	}
	static void print_ans(int a[],int n)
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
		System.out.print("elememts =");
		n=s.nextInt();
		System.out.println("enter the element one by one:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		heaping(a,n);
		System.out.println("Sorting : ");
		print_ans(a,n);
		

	}

}
