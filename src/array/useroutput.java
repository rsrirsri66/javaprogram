package array;

import java.util.Scanner;

public class useroutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of elements");
        n= s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements one by one");
        for(int i=0;i<n;i++){
        	
			arr[i]=s.nextInt();
        }
        System.out.println("array elements stored");
        for(int i=0;i<n;i++) {
        System.out.println(arr[i]);
	}

}
}