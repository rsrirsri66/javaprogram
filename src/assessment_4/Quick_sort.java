package assessment_4;

import java.util.*;

public class Quick_sort {
	static int partition(int array[], int low, int high) {
		int pivot=array[high];
		int i=(low-1);
		for(int j=low;j<high;j++)
		{
			if(array[j]<=pivot)
			{
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		return (i+1);
	}
	
	static void quick(int array[],int low,int high)
	{
		if(low<high)
		{
			int pi=partition(array,low,high);
			quick(array,low,pi-1);
			quick(array,pi+1,high);
			
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
		  System.out.println("unsorted array:");
		  System.out.println(Arrays.toString(a));
		  int size=a.length;
		  Quick_sort.quick(a,0,size-1);
		  System.out.println("Sorted array:");
		  System.out.println(Arrays.toString(a));

	}

}
