package assessment_3;

import java.util.Scanner;

public class Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,o,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elements:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter the element of which you want to count no. of occurrence:");
		o=s.nextInt();
		for(int i=0;i<n;i++) {
			if(o==a[i]) {
				count++;
			}
		}
		System.out.println("no. of occurrence of the element:"+count);

	}

}
