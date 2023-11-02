package array;

import java.util.Scanner;

public class max_min {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,max,min;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of elements");
        n= s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements one by one");
        for(int i=0;i<n;i++){
        	
			arr[i]=s.nextInt();}
			 //System.out.println("array elements stored");
			max=arr[0];
			for(int i=1;i<n;i++) {
				if(arr[i]>max)
					max=arr[i];
			}
			min=arr[0];
			for(int i=1;i<n;i++) {
				if(arr[i]<min)
					min=arr[i];
			}
			System.out.println(max);
			System.out.print(min);
        
	}
}
