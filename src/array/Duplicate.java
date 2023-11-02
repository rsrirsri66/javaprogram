package array;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,pos;
		Scanner s=new Scanner(System.in);
		System.out.print("enter num of elements");
		n=s.nextInt();
		int ae[]=new int[n];
		System.out.print("enter num one by one:");
		for(int i=0;i<n;i++)
		{
			ae[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ae[i]==ae[j]) {                          
					if(j!=n-1) {
						ae[j]=ae[j+1];
						
					} 
					n=n-1;
					j--;
				}
			}
		} 
		  System.out.println(n);
         System.out.print("array elements:");
         for(int i=0;i<n;i++) {
        	 System.out.print(ae[i]+" ");
         }
	}

}
