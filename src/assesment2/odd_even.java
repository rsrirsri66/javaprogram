package assesment2;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s= new Scanner(System.in);
		System.out.print("enter no of elements in array=");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elements");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("even num=");
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) 
				System.out.println(+a[i]);
	}
		System.out.println("odd num=");
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				System.out.println(+a[i]);
			}

}
}
}