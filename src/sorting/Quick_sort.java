package sorting;

import java.util.Arrays;
import java.util.Scanner;
class Quicksort{
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
}


public class Quick_sort 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	  int[]data= {8,7,2,1,0,9,6};
	  System.out.println("unsorted array:");
	  System.out.println(Arrays.toString(data));
	  int size=data.length;
	  Quicksort.quick(data,0,size-1);
	  System.out.println("Sorted array:");
	  System.out.println(Arrays.toString(data));
	}

}
